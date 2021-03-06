/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dal.ProductDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cart;
import model.Color;
import model.Color_Size;
import model.Order;
import model.Product;
import model.ProductCart;
import model.Size;

/**
 *
 * @author ADMIN
 */

public class OrderController extends HttpServlet {
    
    protected boolean checkIsProductExist( ArrayList<ProductCart> listProductCarts, ProductCart c){
        for (ProductCart lc : listProductCarts) {
            if(lc.getColorID()==c.getColorID()
                    &&lc.getSizeID()==c.getSizeID()
                    &&lc.getProductID()==c.getProductID()){
                lc.setQuantity(c.getQuantity()+lc.getQuantity());
                return true;
            }
        }
        return false;   
    }
    
    protected ArrayList<ProductCart> getListProductsFromCooky(String txt){
//s        pid:1,sid:1,cid:1,quantity:1;
//temp:   pid:1
        ArrayList<ProductCart> listProducts= new ArrayList<>();
        String[] product = txt.split("/");
        for (String s : product) {
            String temp[]=s.split(",");
            try {
                int pid = Integer.parseInt(temp[0].split((":"))[1]);
                int sid = Integer.parseInt(temp[1].split((":"))[1]);         
                int cid = Integer.parseInt(temp[2].split((":"))[1]);
                int quantity = Integer.parseInt(temp[3].split((":"))[1]);
                ProductCart pc = new ProductCart();
                pc.setColorID(cid);
                pc.setQuantity(quantity);
                pc.setSizeID(sid);
                pc.setProductID(pid);
                if(listProducts.isEmpty()||!checkIsProductExist(listProducts, pc)){
                    listProducts.add(pc);      
                } 
           } 
            catch (Exception e) {       
           }                      
        }
        return listProducts;
    }
    
    public Cart getCart(ArrayList<ProductCart> listProducts){
        ProductDBContext pdbc = new ProductDBContext();
        ArrayList<String> listPrices = new ArrayList<>();
        BigDecimal totalMoney=new BigDecimal("0");
        DecimalFormat df = new DecimalFormat("#,###");
        if(!listProducts.isEmpty()){    
            for (ProductCart pc : listProducts) {
                Product p = pdbc.getOneProduct(pc.getProductID());
                pc.setImage(p.getListImages().get(0).getImage());
                listPrices.add(df.format(p.getPrice().multiply(new BigDecimal(pc.getQuantity()))));
                totalMoney=totalMoney.add(p.getPrice().multiply(new BigDecimal(pc.getQuantity())));
                pc.setPrice(df.format(p.getPrice()));
                pc.setRetailPrice(df.format(p.getRetailPrice()));
                pc.setProductName(p.getProductName());
                pc.setPriceBigDecimal(p.getPrice());
                for (Color c : p.getListColors()) {
                    if(c.getColorID()==pc.getColorID()){
                        pc.setColor(c.getColor());
                    }
                }
                for (Size s : p.getListSizes()) {
                    if(s.getSizeID()==pc.getSizeID()){
                        pc.setSize(s.getSize());
                    }
                }
            }
            Cart c = new Cart();
            c.setListProducts(listProducts);
            c.setListPrices(listPrices);
            c.setTotalMoney(df.format(totalMoney));
            return c;
        }   
        return null;
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookies[] = request.getCookies();
        ArrayList<ProductCart> listProducts = new ArrayList<>();
        if(cookies!=null){
            for (Cookie cooky : cookies) {
                if(cooky.getName().equals("cart")){
                    listProducts = getListProductsFromCooky(cooky.getValue());
                }
            }
        }    
        if(getCart(listProducts)!=null){
            request.setAttribute("cart", getCart(listProducts));
        }
        request.getRequestDispatcher("cart.jsp").forward(request, response);  
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");        
        int pid = Integer.parseInt(request.getParameter("pid"));
        int cid = Integer.parseInt(request.getParameter("cid"));
        int sid = Integer.parseInt(request.getParameter("sid"));
        int num = Integer.parseInt(request.getParameter("num"));
        Cookie cookies[] = request.getCookies();
        int maxquantity=0;
        ProductDBContext productDBContext = new ProductDBContext();
        Product p = productDBContext.getOneProduct(pid);
        for (Color_Size cs : p.getListColor_Sizes()) {
            if(cs.getColorID()==cid&&cs.getSizeID()==sid){
                maxquantity=cs.getQuantity();
            }
        }
        
        ArrayList<ProductCart> listProducts = new ArrayList<>();
        if(cookies!=null){
            for (Cookie cooky : cookies) {
                if(cooky.getName().equals("cart")){
                    listProducts = getListProductsFromCooky(cooky.getValue());
                }
            }
        }    
        String txt="";
        for (int i=0; i<listProducts.size();i++) {
            if(listProducts.get(i).getColorID()==cid
                    &&listProducts.get(i).getProductID()==pid
                    &&listProducts.get(i).getSizeID()==sid){
                if(listProducts.get(i).getQuantity()+num<=0||num==0){
                    listProducts.remove(listProducts.get(i));
                }else if(listProducts.get(i).getQuantity()+num>maxquantity){
                    listProducts.get(i).setQuantity(maxquantity);
                }
                else{
                    listProducts.get(i).setQuantity(listProducts.get(i).getQuantity()+num);
                }
            }
        }
        
        for(int i=0;i<listProducts.size();i++){
            if(i==0){
                txt="pid:"+listProducts.get(i).getProductID()+",sid:"+listProducts.get(i).getSizeID()+",cid:"+
                        listProducts.get(i).getColorID()+",quantity:"+listProducts.get(i).getQuantity();           
            }else{
                txt+="/"+"pid:"+listProducts.get(i).getProductID()+",sid:"+listProducts.get(i).getSizeID()+",cid:"+
                        listProducts.get(i).getColorID()+",quantity:"+listProducts.get(i).getQuantity();
            }
        }
        Cookie c = new Cookie("cart", txt);
        c.setMaxAge(60*60);
        response.addCookie(c);
        response.getWriter().print(txt);        
        if(getCart(listProducts)!=null){
            request.setAttribute("cart", getCart(listProducts));
        }     
        request.getRequestDispatcher("../view/data.jsp").forward(request, response); 
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

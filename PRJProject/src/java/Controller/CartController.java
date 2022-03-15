/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Cart;
import model.ProductCart;

/**
 *
 * @author ADMIN
 */
public class CartController extends HttpServlet {

    protected boolean checkIsProductExist(Cart cart, ProductCart c){
        ArrayList<ProductCart> listProductCarts = cart.getListProducts();
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
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account account = (Account) request.getSession().getAttribute("account");
        Cart cart = (Cart) request.getSession().getAttribute("cart");
        if(cart==null){
            cart = new Cart();
        }else{
            String pid = request.getParameter("pid");
            String cid = request.getParameter("cid");
            String sid = request.getParameter("sid");
            String quantity = request.getParameter("quantity");
            ProductCart pc = new ProductCart();
            pc.setQuantity(Integer.parseInt(quantity));
            pc.setProductID(Integer.parseInt(pid));
            pc.setColorID(Integer.parseInt(cid));
            pc.setSizeID(Integer.parseInt(sid));
            if(!checkIsProductExist(cart, pc)){
                cart.getListProducts().add(pc);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

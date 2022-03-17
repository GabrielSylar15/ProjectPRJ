/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.oracle.jrockit.jfr.Producer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        Account account = (Account) request.getSession().getAttribute("account");      
//        if(request.getSession().getAttribute("cart")==null){
//            Cart cart = new Cart();
//            String pid = request.getParameter("pid");
//            String cid = request.getParameter("cid");
//            String sid = request.getParameter("sid");
//            String quantity = request.getParameter("quantity");
//            ProductCart pc = new ProductCart();
//            pc.setQuantity(Integer.parseInt(quantity));
//            pc.setProductID(Integer.parseInt(pid));
//            pc.setColorID(Integer.parseInt(cid));
//            pc.setSizeID(Integer.parseInt(sid));
//            cart.getListProducts().add(pc);
//            request.getSession().setAttribute("cart", cart);
//        }
//        else{
//            Cart cart = (Cart) request.getSession().getAttribute("cart");
//            String pid = request.getParameter("pid");
//            String cid = request.getParameter("cid");
//            String sid = request.getParameter("sid");
//            String quantity = request.getParameter("quantity");
//            ProductCart pc = new ProductCart();
//            pc.setQuantity(Integer.parseInt(quantity));
//            pc.setProductID(Integer.parseInt(pid));
//            pc.setColorID(Integer.parseInt(cid));
//            pc.setSizeID(Integer.parseInt(sid));
//            if(!checkIsProductExist(cart, pc)){
//                cart.getListProducts().add(pc);
//            }
//            request.getSession().setAttribute("cart", cart);
//        }

        Cookie[] cookies = request.getCookies();
        String pid = request.getParameter("pid");
        String cid = request.getParameter("cid");
        String sid = request.getParameter("sid");
        String quantity = request.getParameter("quantity");
        String txt="";
        if(cookies!=null){
            for (Cookie cooky : cookies) {
                if(cooky.getName().equals("cart")){
                    txt+=cooky.getValue();
                    cooky.setMaxAge(0);
                    response.addCookie(cooky);
                }
            }
        }
//        pid:1,sid:1,cid:1,quantity:1;
        if(txt.equals("")){
            txt="pid:"+pid+",sid:"+sid+",cid:"+cid+",quantity:"+quantity;
        }else{
            txt+="/"+"pid:"+pid+",sid:"+sid+",cid:"+cid+",quantity:"+quantity;    
        }    
        Cookie c = new Cookie("cart", txt);
        c.setMaxAge(60*60);
        response.addCookie(c);
        response.getWriter().print(txt);
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

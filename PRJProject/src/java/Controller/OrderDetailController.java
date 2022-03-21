/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dal.OrderDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Cart;
import model.Order;
import model.ProductCart;

/**
 *
 * @author ADMIN
 */
public class OrderDetailController extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OrderController oc = new OrderController();
        Cookie cookies[] = request.getCookies();
        ArrayList<ProductCart> listProducts = new ArrayList<>();
        if(cookies!=null){
            for (Cookie cooky : cookies) {
                if(cooky.getName().equals("cart")){
                    listProducts = oc.getListProductsFromCooky(cooky.getValue());
                }
            }
        }    
        if(oc.getCart(listProducts)!=null){
            request.setAttribute("cart", oc.getCart(listProducts));
        }
        request.getRequestDispatcher("checkoutp.jsp").forward(request, response);        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");        
        Account account = (Account) request.getSession().getAttribute("account");
        OrderController oc = new OrderController();
        Cookie cookies[] = request.getCookies();
        ArrayList<ProductCart> listProducts = new ArrayList<>();
        if(cookies!=null){
            for (Cookie cooky : cookies) {
                if(cooky.getName().equals("cart")){
                    listProducts = oc.getListProductsFromCooky(cooky.getValue());
                    cooky.setMaxAge(0);
                    response.addCookie(cooky);
                }
            }
        } 
        Cart cart = oc.getCart(listProducts);
        Order o = new Order();
        o.setCart(cart);
        o.setCusID(account.getCusID());
        o.setNote(request.getParameter("message"));
        o.setShipAddress(request.getParameter("add1"));
        o.setDept(new BigDecimal("0"));
        o.setIsShipped(false);
      
        OrderDBContext orderDBContext = new OrderDBContext();
        orderDBContext.addOrder(o);
       
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

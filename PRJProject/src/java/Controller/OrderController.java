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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cart;
import model.Color;
import model.Product;
import model.ProductCart;
import model.Size;

/**
 *
 * @author ADMIN
 */
public class OrderController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        ProductDBContext pdbc = new ProductDBContext();
        ArrayList<String> listPrices = new ArrayList<>();
        BigDecimal totalMoney=new BigDecimal("0");
        DecimalFormat df = new DecimalFormat("#,###");
        if(request.getSession().getAttribute("cart")!=null){
            Cart cart = (Cart) request.getSession().getAttribute("cart");
            for (ProductCart pc : cart.getListProducts()) {
                Product p = pdbc.getOneProduct(pc.getProductID());
                pc.setImage(p.getListImages().get(0).getImage());
                listPrices.add(df.format(p.getPrice().multiply(new BigDecimal(pc.getQuantity()))));
                totalMoney=totalMoney.add(p.getPrice().multiply(new BigDecimal(pc.getQuantity())));
                pc.setPrice(df.format(p.getPrice()));
                pc.setProductName(p.getProductName());
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
            request.setAttribute("totalMoney", df.format(totalMoney));
            request.setAttribute("cart", cart);
            request.setAttribute("listPrices",listPrices);
        }
        request.getRequestDispatcher("cart.jsp").forward(request, response);  



    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
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

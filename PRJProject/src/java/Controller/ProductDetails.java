/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dal.ProductDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Color_Size;
import model.Product;
import model.ProductCart;

/**
 *
 * @author ADMIN
 */
public class ProductDetails extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int pid;
        if(request.getParameter("pid")==null){
            pid=1;
        }else{
            pid = Integer.parseInt(request.getParameter("pid"));
        }
        ProductDBContext productDBContext = new ProductDBContext();
        Product p = productDBContext.getOneProduct(pid);
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
        for (ProductCart pc : listProducts) {
            for (Color_Size cs : p.getListColor_Sizes()) {
                if(pc.getColorID()==cs.getColorID()&&
                        pc.getSizeID()==cs.getSizeID()&&
                        pc.getProductID()==p.getProductID()){
                    cs.setQuantity(cs.getQuantity()-pc.getQuantity());
                }
            }
        }
        request.setAttribute("product", p);
        request.getRequestDispatcher("singleproduct.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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

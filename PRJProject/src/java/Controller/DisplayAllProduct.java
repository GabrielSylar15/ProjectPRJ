/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dal.CategoryDBContext;
import dal.ProductDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Product;

/**
 *
 * @author ADMIN
 */
public class DisplayAllProduct extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ProductDBContext productDBContext = new ProductDBContext();
            int page = 1;
            int page_size=6,totalpage=0;
            if(request.getParameter("pageindex")!=null){
                page = Integer.parseInt(request.getParameter("pageindex"));
            }   
            String filter="", order="";
            if(request.getParameter("categoryid")!=null){ 
                filter = " where categoryid="+request.getParameter("categoryid");
            }   
            if(request.getParameter("order")!=null){
                switch(request.getParameter("order")){
                    case "price-desc":
                        order= "price desc";
                        break;
                    case "price-asc":
                        order= "price asc";
                        break;    
                    case "best-selling":
                        order="";
                        break;
                    case "maxquantity":
                        order="quantity desc";
                        break;
                    case "minquantity":
                        order="quantity asc";
                        break;
                    case "newest":
                    order="ProductID desc";
                        break;
                    case "oldest":
                        order="ProductID asc";
                        break;
                    case "benifit":
                        order="RetailPrice-Price/QuantityPerUnit desc";
                        break;
                }
            }
            int count = productDBContext.count(filter);
            if(count%page_size==0) totalpage = count/page_size;
            else    totalpage = count/page_size+1;
            request.setAttribute("totalpage", totalpage);
            request.setAttribute("pageindex", page);
            ArrayList<Product> listProducts = productDBContext.getListProductsWithCondition(page, page_size,filter, order);
            request.setAttribute("listProducts", listProducts);
            CategoryDBContext categoryDBContext = new CategoryDBContext();
            ArrayList<Category> listCategories = categoryDBContext.getListCategories();
            request.setAttribute("listCategories", listCategories);
            request.getRequestDispatcher("product.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayAllProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

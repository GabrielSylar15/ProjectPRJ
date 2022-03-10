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
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import static jdk.nashorn.internal.objects.NativeError.getFileName;
import model.Category;
import model.Product;
import model.ProductImages;

/**
 *
 * @author ADMIN
 */
@MultipartConfig(
        fileSizeThreshold   = 1024 * 1024 * 1,  // 1 MB
        maxFileSize         = 1024 * 1024 * 10, // 10 MB
        maxRequestSize      = 1024 * 1024 * 15,
        location = "D:\\WED201c\\HtmlPRJ\\ProjectPRJ\\PRJProject\\web\\uploads"// 15 MB
)
public class ProductsController extends HttpServlet {
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        ProductDBContext productDBContext = new ProductDBContext();
//        int page = 1;
//        int page_size=12;
//        ArrayList<Product> listProducts = productDBContext.getListProducts(1, page_size);
//        request.setAttribute("listProducts", listProducts);
//        request.getRequestDispatcher("view/test.jsp").forward(request, response);
//    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDBContext categoryDBContext = new CategoryDBContext();
        ArrayList<Category> listCategories = categoryDBContext.getListCategories();
        request.setAttribute("listCategories", listCategories);
        request.getRequestDispatcher("InsertProduct.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ProductName = request.getParameter("name");
        BigDecimal price = new BigDecimal(request.getParameter("price"));
        int QuantityPerUnit = Integer.parseInt(request.getParameter("QuantityPerUnit"));
        BigDecimal retailPrice = new BigDecimal(request.getParameter("retailprice"));
        String description = request.getParameter("description");
        ArrayList<ProductImages> listImages = new ArrayList<>();
        Category category = new Category();
        category.setCategoryID(Integer.parseInt(request.getParameter("category")));
        Collection<Part> parts = request.getParts();
        String[] raw_quantities= request.getParameterValues("quantity");
        for (Part part : parts) {
            if(part.getSubmittedFileName()!=null){
              String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
              part.write(filename); 
              ProductImages pi = new ProductImages();
              pi.setImage(filename);
//              response.getWriter().print(filename);
            }
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

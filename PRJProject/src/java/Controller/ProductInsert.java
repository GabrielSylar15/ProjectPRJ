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
import model.Color;
import model.Color_Size;
import model.Product;
import model.ProductImages;
import model.Size;

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
public class ProductInsert extends HttpServlet {
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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String ProductName = request.getParameter("name");
        BigDecimal price = new BigDecimal(request.getParameter("price"));
        int QuantityPerUnit = Integer.parseInt(request.getParameter("QuantityPerUnit"));
        BigDecimal retailPrice = new BigDecimal(request.getParameter("retailprice"));
        String description = request.getParameter("description");
        ArrayList<ProductImages> listImages = new ArrayList<>();
        Category category = new Category();
        category.setCategoryID(Integer.parseInt(request.getParameter("category")));
        Collection<Part> parts = request.getParts();
        Product p = new Product();
        String[] raw_quantities = request.getParameterValues("quantity");
        String[] raw_size = null, raw_color = null;
        ArrayList<Size> listSizes = new ArrayList<>();
        ArrayList<Color> listColors = new ArrayList<>();
        if(request.getParameterValues("color")==null){
            Color c = new Color();
            c.setColorID(0);
            c.setColor("None");
            listColors.add(c);
        }else{
            raw_color = request.getParameterValues("color");
             for(int i=0;i<raw_color.length;i++){
                 Color x = new Color();
                 x.setColorID(i+1);
                 x.setColor(raw_color[i]);
                 listColors.add(x);                 
             }           
        }
        if(request.getParameterValues("size")==null){
            Size s = new Size();
            s.setSizeID(0);       
            s.setSize("None");
            listSizes.add(s);
        }else{
            raw_size = request.getParameterValues("size");
            for(int i=0;i<raw_size.length;i++){
                Size x = new Size();
                x.setSizeID(i+1);
                x.setSize(raw_size[i]);
                listSizes.add(x);                 
            } 
        }
        
        ArrayList<Color_Size> listColorSizes = new ArrayList<>();
        

        for (Part part : parts) {
            if(part.getSubmittedFileName()!=null){
              String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
              part.write(filename); 
              ProductImages pi = new ProductImages();
              pi.setImage("uploads/"+filename);
              listImages.add(pi);
            }
        }  
        p.setProductName(ProductName);
        p.setPrice(price);
        p.setCategory(category);
        p.setDescription(description);
        p.setRetailPrice(retailPrice);
        p.setQuantityPerUnit(QuantityPerUnit);
        p.setListImages(listImages);
        p.setListSizes(listSizes);
        p.setListColors(listColors);
        for (String s : raw_quantities) {
            p.getQuantity().add(Integer.parseInt(s));
        }
        ProductDBContext productDBContext = new ProductDBContext();
        productDBContext.insertProduct(p);    
        response.sendRedirect("../template/displayproducts"); 
//        for (String raw_quantity : raw_quantities) {
//            response.getWriter().println(raw_quantity);
//        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

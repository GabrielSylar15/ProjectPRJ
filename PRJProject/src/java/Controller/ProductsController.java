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
import model.Option;
import model.OptionValue;
import model.Product;
import model.ProductImages;
import model.SkuValue;

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
        Product p = new Product();
        String[] raw_quantities = request.getParameterValues("quantity");
        String[] raw_size = null, raw_color = null;
        ArrayList<OptionValue> listOptionValues = new ArrayList<>();
        ArrayList<SkuValue> listSkuValues = new ArrayList<>();
        ArrayList<Option> listOptions = new ArrayList<>();
        if(request.getParameterValues("color")!=null){
            raw_color = request.getParameterValues("color");
            for (int i = 0; i < raw_color.length; i++) {
                OptionValue op = new OptionValue();
                op.setOptionID(3);
                op.setValueName(raw_color[i]);
                op.setValueID(i+1);       
                listOptionValues.add(op);
            }    
            Option op = new Option();
            op.setOptionID(3);
            listOptions.add(op);
            p.setIsOption(true);
        }
        if(request.getParameterValues("size")!=null){
            raw_size = request.getParameterValues("size");            
            for (int i = 0; i < raw_size.length; i++) {
                OptionValue op = new OptionValue();
                op.setOptionID(4);
                op.setValueName(raw_size[i]);
                op.setValueID(i+1);
                listOptionValues.add(op);
            }  
            Option op = new Option();
            op.setOptionID(4);
             listOptions.add(op);
            p.setIsOption(true);
        }
        if(raw_color==null&&raw_size==null){
           p.setIsOption(false);
        }
        
        if((raw_color==null&&raw_size!=null||raw_size==null&&raw_color!=null)){
            int index_quantity=0;
            if(raw_color!=null){
                for (int i = 0; i < raw_color.length; i++) {
                    SkuValue sk = new SkuValue();
                    sk.setOptionID(3);
                    sk.setSkuID(index_quantity+1);
                    sk.setValueID(i+1);
                    sk.setQuantity(Integer.parseInt(raw_quantities[index_quantity]));
                    index_quantity+=1;  
                }              
            }else{
                for (int i = 0; i < raw_size.length; i++) {
                    SkuValue sk = new SkuValue();
                    sk.setOptionID(4);
                    sk.setSkuID(index_quantity+1);
                    sk.setValueID(i+1);
                    sk.setQuantity(Integer.parseInt(raw_quantities[index_quantity]));
                    index_quantity+=1;  
                }                  
            }
        }else if(raw_color!=null&&raw_size!=null){       
            int index_quantity=0;
            for(int i=0;i<raw_color.length;i++){
                for (int j = 0; j < raw_size.length; j++) {
                    SkuValue sk = new SkuValue();
                    sk.setOptionID(3);
                    sk.setSkuID(index_quantity+1);
                    sk.setValueID(i+1);
                    sk.setQuantity(Integer.parseInt(raw_quantities[index_quantity]));
                    index_quantity+=1;              
                }
            }   
        }
     
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
        p.setQuantity(QuantityPerUnit);
        p.setCategory(category);
        p.setDescription(description);
        p.setRetailPrice(retailPrice);
        if(p.isIsOption()==false){
            p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        }
        p.setListImages(listImages);
        p.setListOptionValues(listOptionValues);
        p.setListOptions(listOptions);
        p.setListSkuValues(listSkuValues);
//        response.getWriter().print(p.getProductName()+" "+p.getPrice()+" "+p.getQuantityPerUnit()+" "+p.getCategory().getCategoryID()+" "+p.getDescription()+" "+p.getRetailPrice()+" "+p.getQuantity()+" "+p.isIsOption());
        ProductDBContext productDBContext = new ProductDBContext();
        productDBContext.insertProduct(p);    
//        for (OptionValue o : listOptionValues) {
//            response.getWriter().println(o.getOptionID()+" "+o.getValueName()+" "+o.getValueID());
//        }
        
//        for (Option o : listOptions) {
//            response.getWriter().println(o.getOptionID()+" "+o.getOptionName());
//        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ProductDBContext extends DBContext{
    public ArrayList<Product> getListProducts(int page_index, int page_size){
        try {
            ArrayList<Product> listProducts = new ArrayList();
            String sql="select *from (select *, ROW_NUMBER() OVER(order by ProductId asc) as row_index from Product) as tbl "
                    + "where row_index>=?*(?-1)+1 and row_index<=?*?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, page_size);
            st.setInt(2, page_index);
            st.setInt(3, page_size);
            st.setInt(4, page_index);    
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getBigDecimal("Price"));
                p.setQuantityPerUnit(rs.getInt("QuantityPerUnit"));
                Category category = new Category();
                category.setCategoryID(rs.getInt("CategoryID"));
                p.setCategory(category);
                p.setDescription(rs.getNString("Description"));
                p.setRetailPrice(rs.getBigDecimal("RetailPrice"));
                listProducts.add(p);
            }
            
           String sql_listImages = "select Image, ImageID from ProductImage where ProductID = ?";
            for (Product p : listProducts) {
                PreparedStatement st_img = connection.prepareStatement(sql_listImages);
                st_img.setInt(1, p.getProductID());
                ArrayList<ProductImages> listImages = new ArrayList<>();
                ResultSet rs_img = st_img.executeQuery();
                while (rs_img.next()) {                    
                    ProductImages img = new ProductImages();
                    img.setImage(rs_img.getString("Image"));
                    img.setImageID(rs_img.getInt("ImageID"));
                    listImages.add(img);
                }
               p.setListImages(listImages);
            }
            
            return listProducts;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
//Insert Product    
    public void insertProduct(Product p){
        try {
            String sql="INSERT INTO [Product]\n" +
                        "           ([ProductName]\n" +
                        "           ,[Price]\n" +
                        "           ,[QuantityPerUnit]\n" +
                        "           ,[CategoryID]\n" +
                        "           ,[Description]\n" +
                        "           ,[RetailPrice])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?)";
            connection.setAutoCommit(false);
            PreparedStatement st = connection.prepareStatement(sql);
            st.setNString(1, p.getProductName());
            st.setBigDecimal(2, p.getPrice());
            st.setInt(3, p.getQuantityPerUnit());
            st.setInt(4, p.getCategory().getCategoryID());
            st.setNString(5, p.getDescription());
            st.setBigDecimal(6, p.getRetailPrice());
            st.executeUpdate();
            
//            Get ID for Product  
            String sql_lastid="SELECT TOP 1 productid FROM Product ORDER BY ProductID DESC";
            PreparedStatement stm_lastid = connection.prepareStatement(sql_lastid);
            ResultSet rs = stm_lastid.executeQuery();
            while(rs.next()){
                p.setProductID(rs.getInt("productid"));
            }
            
            String sql_images = "INSERT INTO [ProductImage]\n" +
                                "           ([ProductID]\n" +
                                "           ,[Image])\n" +
                                "     VALUES\n" +
                                "           (?\n" +
                                "           ,?)";
            for (ProductImages pi : p.getListImages()) {
                PreparedStatement stm_pi = connection.prepareStatement(sql_images);
                stm_pi.setInt(1, p.getProductID());
                stm_pi.setString(2, pi.getImage());
                stm_pi.executeUpdate();
            }
       
            String sql_size="INSERT INTO [Size]\n" +
                            "           ([SizeID]\n" +
                            "           ,[ProductID]\n" +
                            "           ,[Size])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?\n" +
                            "           ,?)";
            for (Size s: p.getListSizes()) {
                PreparedStatement stm_size = connection.prepareStatement(sql_size);
                stm_size.setInt(1, s.getSizeID());
                stm_size.setInt(2, p.getProductID());
                stm_size.setNString(3, s.getSize());
                stm_size.executeUpdate();
            } 
            
           String sql_color="INSERT INTO [Color]\n" +
                            "           ([ColorID]\n" +
                            "           ,[ProductID]\n" +
                            "           ,[Color])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?\n" +
                            "           ,?)";
            for (Color c: p.getListColors()) {
                PreparedStatement stm_color = connection.prepareStatement(sql_color);
                stm_color.setInt(1, c.getColorID());
                stm_color.setInt(2, p.getProductID());
                stm_color.setNString(3, c.getColor());
                stm_color.executeUpdate();
            }            
            
            String sql_color_size = "INSERT INTO [Quantity]\n" +
                                    "           ([ProductID]\n" +
                                    "           ,[ColorID]\n" +
                                    "           ,[SizeID]\n" +
                                    "           ,[Quantity])\n" +
                                    "     VALUES\n" +
                                    "           (?\n" +
                                    "           ,?\n" +
                                    "           ,?\n" +
                                    "           ,?)";
            
            int count=0;
            for (Size s: p.getListSizes()) {
                for (Color c: p.getListColors()) {
                    PreparedStatement stm_color_size = connection.prepareStatement(sql_color_size);
                    stm_color_size.setInt(1, p.getProductID());
                    stm_color_size.setInt(2, c.getColorID());
                    stm_color_size.setInt(3, s.getSizeID());
                    stm_color_size.setInt(4, p.getQuantity().get(count));
                    count+=1;
                    stm_color_size.executeUpdate();
                }    
            }             
         
            connection.commit();
        } catch (SQLException ex) {
            try {
                Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
//    Get One Product By ID
    public Product getOneProduct(int id){
        try {
            String sql="select *from Product where ProductID=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            Product p = new Product();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getBigDecimal("Price"));
                p.setQuantityPerUnit(rs.getInt("QuantityPerUnit"));
                Category category = new Category();
                category.setCategoryID(rs.getInt("CategoryID"));
                p.setCategory(category);
                p.setDescription(rs.getNString("Description"));
                p.setRetailPrice(rs.getBigDecimal("RetailPrice"));                
            }
            
            String sql_listImages = "select Image, ImageID from ProductImage where ProductID = ?";
            PreparedStatement st_img = connection.prepareStatement(sql_listImages);
            st_img.setInt(1, p.getProductID());
            ArrayList<ProductImages> listImages = new ArrayList<>();
            ResultSet rs_img = st_img.executeQuery();
            while (rs_img.next()) {                    
                ProductImages img = new ProductImages();
                img.setImage(rs_img.getString("Image"));
                img.setImageID(rs_img.getInt("ImageID"));
                listImages.add(img);
            }
            p.setListImages(listImages); 
            
            String sql_color_size="select *from Quantity as a join Size as b on a.SizeID = b.SizeID and a.ProductID=b.ProductID\n" +
"						   join Color as c on a.ProductID=c.ProductID and a.ColorID = c.ColorID\n" +
"						   where a.ProductID=?";
            PreparedStatement stm_color_size = connection.prepareStatement(sql_color_size);
            stm_color_size.setInt(1, p.getProductID());
            ResultSet rs_color_size = stm_color_size.executeQuery();
            while(rs_color_size.next()){
                Color_Size cs = new Color_Size();
                cs.setColorID(rs_color_size.getInt("ColorID"));
                cs.setQuantity(rs_color_size.getInt("Quantity"));
                cs.setSizeID(rs_color_size.getInt("SizeID"));
                p.getListColor_Sizes().add(cs);
            }
            
            String sql_color="select *from Color where ProductID=?";
            PreparedStatement stm_color = connection.prepareStatement(sql_color);
            stm_color.setInt(1, p.getProductID());
            ResultSet rs_color = stm_color.executeQuery();
            while (rs_color.next()) {
                Color c = new Color();
                c.setColor(rs_color.getString("color"));
                c.setColorID(rs_color.getInt("ColorID"));
                p.getListColors().add(c);
            }
            
            String sql_size="select *from Size where ProductID=?";
            PreparedStatement stm_size = connection.prepareStatement(sql_size);
            stm_size.setInt(1, p.getProductID());
            ResultSet rs_size = stm_size.executeQuery();
            while (rs_size.next()) {
                Size s = new Size();
                s.setSize(rs_size.getString("Size"));
                s.setSizeID(rs_size.getInt("SizeID"));
                p.getListSizes().add(s);
            }            
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   public void updateProduct(Product p){
        try {
            String sql="UPDATE [Product]\n" +
                    "   SET [ProductName] = ?\n" +
                    "      ,[Price] = ?\n" +
                    "      ,[QuantityPerUnit] = ?\n" +
                    "      ,[CategoryID] = ?\n" +
                    "      ,[Description] = ?\n" +
                    "      ,[RetailPrice] = ?\n" +
                    " WHERE ProductID=?";
            connection.setAutoCommit(false);
            PreparedStatement st = connection.prepareStatement(sql);
            st.setNString(1, p.getProductName());
            st.setBigDecimal(2, p.getPrice());
            st.setInt(3, p.getQuantityPerUnit());
            st.setInt(4, p.getCategory().getCategoryID());
            st.setNString(5, p.getDescription());
            st.setBigDecimal(6, p.getRetailPrice());
            st.setInt(7, p.getProductID());
            st.executeUpdate();
            
            String sql_del_img="DELETE FROM [ProductImage]\n" +
                                "      WHERE ProductID=?";
            PreparedStatement st_del_img = connection.prepareStatement(sql_del_img);
            st_del_img.setInt(1, p.getProductID());
            st_del_img.executeUpdate();
            
            String sql_images = "INSERT INTO [ProductImage]\n" +
                                "           ([ProductID]\n" +
                                "           ,[Image])\n" +
                                "     VALUES\n" +
                                "           (?\n" +
                                "           ,?)";
            for (ProductImages pi : p.getListImages()) {
                PreparedStatement stm_pi = connection.prepareStatement(sql_images);
                stm_pi.setInt(1, p.getProductID());
                stm_pi.setString(2, pi.getImage());
                stm_pi.executeUpdate();
            }                               
            
            String sql_del_cs="DELETE FROM [Quantity]\n" +
                        "      WHERE ProductID=?";
            PreparedStatement st_del_cs = connection.prepareStatement(sql_del_cs);
            st_del_cs.setInt(1, p.getProductID());
            st_del_cs.executeUpdate();
            
            String sql_del_size = "DELETE FROM	[Size]\n" +
                                "      WHERE ProductID=?";
            PreparedStatement st_del_size = connection.prepareStatement(sql_del_size);
            st_del_size.setInt(1,p.getProductID());
            st_del_size.executeUpdate();
            
            String sql_del_color = "DELETE FROM [Color]\n" +
                                "      WHERE ProductID=?";
            PreparedStatement st_del_color = connection.prepareStatement(sql_del_color);
            st_del_color.setInt(1, p.getProductID());
            st_del_color.executeUpdate();
            
             String sql_size="INSERT INTO [Size]\n" +
                            "           ([SizeID]\n" +
                            "           ,[ProductID]\n" +
                            "           ,[Size])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?\n" +
                            "           ,?)";
            for (Size s: p.getListSizes()) {
                PreparedStatement stm_size = connection.prepareStatement(sql_size);
                stm_size.setInt(1, s.getSizeID());
                stm_size.setInt(2, p.getProductID());
                stm_size.setNString(3, s.getSize());
                stm_size.executeUpdate();
            }  
            
           String sql_color="INSERT INTO [Color]\n" +
                            "           ([ColorID]\n" +
                            "           ,[ProductID]\n" +
                            "           ,[Color])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?\n" +
                            "           ,?)";
            for (Color c: p.getListColors()) {
                PreparedStatement stm_color = connection.prepareStatement(sql_color);
                stm_color.setInt(1, c.getColorID());
                stm_color.setInt(2, p.getProductID());
                stm_color.setNString(3, c.getColor());
                stm_color.executeUpdate();
            }               
            
            String sql_color_size = "INSERT INTO [Quantity]\n" +
                                    "           ([ProductID]\n" +
                                    "           ,[ColorID]\n" +
                                    "           ,[SizeID]\n" +
                                    "           ,[Quantity])\n" +
                                    "     VALUES\n" +
                                    "           (?\n" +
                                    "           ,?\n" +
                                    "           ,?\n" +
                                    "           ,?)";
            
            for (Color_Size cs: p.getListColor_Sizes()) {
                PreparedStatement stm_color_size = connection.prepareStatement(sql_color_size);
                stm_color_size.setInt(1, p.getProductID());
                stm_color_size.setInt(2, cs.getColorID());
                stm_color_size.setInt(3, cs.getSizeID());
                stm_color_size.setInt(4, cs.getQuantity());
                stm_color_size.executeUpdate();      
            }        
                        
            connection.commit();              
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
   }
   
   public void deleteProduct(Product p){
       
   }
    
}

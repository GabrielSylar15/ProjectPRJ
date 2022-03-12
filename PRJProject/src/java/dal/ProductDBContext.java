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
import model.Option;
import model.OptionValue;
import model.Product;
import model.ProductImages;
import model.SkuValue;

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
                p.setQuantity(rs.getInt("Quantity"));
                p.setQuantityPerUnit(rs.getInt("QuantityPerUnit"));
                Category category = new Category();
                category.setCategoryID(rs.getInt("CategoryID"));
                p.setCategory(category);
                p.setDescription(rs.getNString("Description"));
                p.setRetailPrice(rs.getBigDecimal("RetailPrice"));
                p.setIsOption(rs.getBoolean("isOption"));
                listProducts.add(p);
            }
            
            String sql_color="select ov.ValueID, a.ProductID, ov.OptionID, ov.Quantity, ValueName, OptionName from Product as a join OptionValue as ov on ov.productID = a.ProductID\n" +
"						  join [Option] as o on ov.OptionID = o.OptionID \n" +
"						  where a.ProductID=?";
            for (Product p : listProducts) {
                ArrayList<OptionValue> listOptionValues = new ArrayList<>();              
                PreparedStatement stm = connection.prepareStatement(sql_color);
                stm.setInt(1, p.getProductID());
                ResultSet rs2 = stm.executeQuery();
                while(rs2.next()){
                    OptionValue op = new OptionValue();
                    op.setValueID(rs2.getInt("ValueID"));
                    op.setOptionID(rs2.getInt("OptionID"));
                    op.setProductID(rs2.getInt("ProductID"));
//                    op.setQuantity(rs2.getInt("Quantity"));
                    op.setValueName(rs2.getNString("ValueName"));
//                    op.setOptionName(rs2.getString("OptionName"));
                    listOptionValues.add(op);
                }
                p.setListOptionValues(listOptionValues);
            }   
            
            return listProducts;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void insertProduct(Product p){
        try {
            String sql="INSERT INTO [Product]\n" +
                        "           ([ProductName]\n" +
                        "           ,[Price]\n" +
                        "           ,[QuantityPerUnit]\n" +
                        "           ,[CategoryID]\n" +
                        "           ,[Description]\n" +
                        "           ,[RetailPrice]\n" +
                        "           ,[Quantity]\n" +
                        "           ,[isOption])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
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
            if(p.isIsOption()==false){
                st.setInt(7, p.getQuantity());
            }else{
                st.setNull(7, Types.INTEGER);
            }
            st.setBoolean(8, p.isIsOption());
            st.executeUpdate();
            
//            Get ID for Product  
            String sql_lastid="SELECT TOP 1 productid FROM Product ORDER BY ProductID DESC";
            PreparedStatement stm_lastid = connection.prepareStatement(sql_lastid);
            ResultSet rs = stm_lastid.executeQuery();
            while(rs.next()){
                p.setProductID(rs.getInt("productid"));
            }
            
            String sql_op_p = "INSERT INTO [dbo].[Option_Product]\n" +
                                "           ([ProductID]\n" +
                                "           ,[OptionID])\n" +
                                "     VALUES\n" +
                                "           (?\n" +
                                "           ,?)";
            for (Option o : p.getListOptions()) {
                PreparedStatement stm_op_p = connection.prepareStatement(sql_op_p);
                stm_op_p.setInt(1, p.getProductID());
                stm_op_p.setInt(2, o.getOptionID());
                stm_op_p.executeUpdate();
            }            
            
            String sql_optionvalue="INSERT INTO [OptionValue]\n" +
                                    "           ([ValueID]\n" +
                                    "           ,[ProductID]\n" +
                                    "           ,[OptionID]\n" +
                                    "           ,[ValueName])\n" +
                                    "     VALUES\n" +
                                    "           (?\n" +
                                    "           ,?\n" +
                                    "           ,?\n" +
                                    "           ,?)";
            for (OptionValue op : p.getListOptionValues()) {
                PreparedStatement stm_op = connection.prepareStatement(sql_optionvalue);
                stm_op.setInt(1, op.getValueID());
                stm_op.setInt(2, p.getProductID());
                stm_op.setInt(3, op.getOptionID());
                stm_op.setString(4, op.getValueName());
                stm_op.executeUpdate();
            }
        
            
//            String sql_images = "INSERT INTO [ProductImage]\n" +
//                                "           ([ProductID]\n" +
//                                "           ,[Image])\n" +
//                                "     VALUES\n" +
//                                "           (?\n" +
//                                "           ,?)";
//            for (ProductImages pi : p.getListImages()) {
//                PreparedStatement stm_pi = connection.prepareStatement(sql_images);
//                stm_pi.setInt(1, p.getProductID());
//                stm_pi.setString(2, pi.getImage());
//                stm_pi.executeUpdate();
//            }
//            
//

//            
//            String sql_sku = "INSERT INTO [dbo].[SkuValues]\n" +
//                            "           ([ProductID]\n" +
//                            "           ,[SkuID]\n" +
//                            "           ,[OptionID]\n" +
//                            "           ,[ValueID]\n" +
//                            "           ,[Quantity])\n" +
//                            "     VALUES\n" +
//                            "           (?\n" +
//                            "           ,?\n" +
//                            "           ,?\n" +
//                            "           ,?\n" +
//                            "           ,?)";
//            for (SkuValue sk : p.getListSkuValues()) {
//                PreparedStatement stm_sku = connection.prepareStatement(sql_sku);
//                stm_sku.setInt(1, p.getProductID());
//                stm_sku.setInt(2, sk.getSkuID());
//                stm_sku.setInt(3, sk.getOptionID());
//                stm_sku.setInt(4, sk.getValueID());
//                stm_sku.setInt(5, sk.getQuantity());
//                stm_sku.executeUpdate();
//            }
//            
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
    
    public void getOneProduct(int id){
        
    }
    
}

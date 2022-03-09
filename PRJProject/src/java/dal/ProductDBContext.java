/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.OptionValue;
import model.Product;

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
                    op.setQuantity(rs2.getInt("Quantity"));
                    op.setValueName(rs2.getNString("ValueName"));
                    op.setOptionName(rs2.getString("OptionName"));
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
        String sql="";
        
    }
    
}

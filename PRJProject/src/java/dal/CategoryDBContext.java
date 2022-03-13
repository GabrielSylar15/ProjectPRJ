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

/**
 *
 * @author ADMIN
 */
public class CategoryDBContext extends DBContext{
    public ArrayList<Category> getListCategories(){
        PreparedStatement st = null;
        try {
            ArrayList<Category> listCategories = new ArrayList<>();
            String sql = "SELECT CategoryID, CategoryName from Category";
            st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Category category = new Category();
                category.setCategoryID(rs.getInt("CategoryID"));
                category.setCategoryName(rs.getString("CategoryName"));
                listCategories.add(category);
            }   return listCategories;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
    
    public void addCategory(String categoryName){
        try {
            String sql = "INSERT INTO [Category]\n" +
                    "           ([CategoryName])\n" +
                    "     VALUES\n" +
                    "           (?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, categoryName);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteCategory(String categoryId){
        String sql="";
        
    }
}

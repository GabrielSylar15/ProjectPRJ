/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class AccountDBContext extends DBContext{
    public Account getAccount(String userName, String passWord){
        try {
            String sql = "select *from Account where username=? and Password=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, userName);
            st.setString(2, passWord);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Account ac = new Account();
                ac.setCusID(rs.getInt("CusID"));
                ac.setUserName(rs.getString("UserName"));
                ac.setPassword(rs.getString("Password"));
                ac.setIsAdmin(rs.getBoolean("isAdmin"));
                ac.setDisplayNamme(rs.getNString("DisplayName"));
                return ac;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

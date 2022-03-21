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
import model.Cart;
import model.Order;
import model.ProductCart;

/**
 *
 * @author ADMIN
 */
public class OrderDBContext extends DBContext{
    public void addOrder(Order o){
        try {
            String sql="INSERT INTO [Order]\n" +
                        "           ([CusID]\n" +
                        "           ,[ShipAddress]\n" +
                        "           ,[Note]\n" +
                        "           ,[OrderDate]\n" +
                        "           ,[isShipped]\n" +
                        "           ,[isOnline]\n" +
                        "           ,[dept])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,GETDATE()\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?)";
            connection.setAutoCommit(false);
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, o.getCusID());
            st.setNString(2, o.getShipAddress());
            st.setNString(3, o.getNote());
            st.setBoolean(4, false);
            st.setBoolean(5, false);
            st.setBigDecimal(6, o.getDept());
            st.executeUpdate();
            
            String sql_lastid="SELECT TOP 1 orderid FROM [Order] ORDER BY OrderID DESC";
            PreparedStatement st_lasid = connection.prepareStatement(sql_lastid);
            ResultSet rs = st_lasid.executeQuery();
            while(rs.next()){
                o.setOrderID(rs.getInt("orderid"));
            }
            
            String sql_order_quantity="INSERT INTO [Order_Details]\n" +
                                        "           ([Quantity]\n" +
                                        "           ,[UnitPrice]\n" +
                                        "           ,[OrderID]\n" +
                                        "           ,[ProductID]\n" +
                                        "           ,[ColorID]\n" +
                                        "           ,[SizeID])\n" +
                                        "     VALUES\n" +
                                        "           (?\n" +
                                        "           ,?\n" +
                                        "           ,?\n" +
                                        "           ,?\n" +
                                        "           ,?\n" +
                                        "           ,?)";
            for (ProductCart pc : o.getCart().getListProducts()) {
                PreparedStatement st_order_quantity = connection.prepareStatement(sql_order_quantity);
                st_order_quantity.setInt(1, pc.getQuantity());
                st_order_quantity.setBigDecimal(2, pc.getPriceBigDecimal());
                st_order_quantity.setInt(3, o.getOrderID());
                st_order_quantity.setInt(4, pc.getProductID());
                st_order_quantity.setInt(5, pc.getColorID());
                st_order_quantity.setInt(6, pc.getSizeID());
                st_order_quantity.executeUpdate();
             }
            
            
            String sql_updatequantity="UPDATE [Quantity]\n" +
                                "   SET [Quantity] = \n" +
                                "   (select Quantity from Quantity where SizeID=? and ColorID=? and ProductID=?)-?\n" +
                                " WHERE ProductID = ? and ColorID=? and SizeID=?";
            for (ProductCart pc : o.getCart().getListProducts()) {
                PreparedStatement st_updatequantity = connection.prepareStatement(sql_updatequantity);
                st_updatequantity.setInt(1, pc.getSizeID());
                st_updatequantity.setInt(2, pc.getColorID());
                st_updatequantity.setInt(3, pc.getProductID());
                st_updatequantity.setInt(4, pc.getQuantity());
                st_updatequantity.setInt(5, pc.getProductID());
                st_updatequantity.setInt(6, pc.getColorID());
                st_updatequantity.setInt(7, pc.getSizeID());
                st_updatequantity.executeUpdate();
             }
        connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(OrderDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<Order> getListOrder(int cusID){
        try {
            ArrayList<Order> listOrders = new ArrayList<>();
            String sql="select* from [Order] where CusId=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, cusID);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Order o = new Order();
                o.setOrderID(rs.getInt("OrderID"));
                o.setCusID(cusID);
                o.setShipAddress(rs.getNString("ShipAddress"));
                o.setNote(rs.getNString("Note"));
                o.setOrderDate(rs.getDate("OrderDate"));
                o.setIsShipped(rs.getBoolean("isShipped"));
                o.setIsOnline(rs.getBoolean("isOnline"));
                o.setDept(rs.getBigDecimal("dept"));
                listOrders.add(o);
            }
            
            String sql_order="select* from [Order] as a join Order_Details as b on a.orderid=b.orderid \n" +
"where CusId=? and a.Orderid=?";
            for (Order o : listOrders) {
                PreparedStatement st_order = connection.prepareStatement(sql_order); 
                st_order.setInt(1, cusID);
                st_order.setInt(2, o.getOrderID());
                ResultSet rs2 = st_order.executeQuery();
                ArrayList<ProductCart> listProductCart = new ArrayList<>();
                while(rs2.next()){
                    ProductCart pc = new ProductCart();
                    pc.setColorID(rs2.getInt("ColorID"));
                    pc.setSizeID(rs2.getInt("sizeID"));
                    pc.setQuantity(rs2.getInt("Quantity"));
                    pc.setProductID(rs2.getInt("ProductID"));
                    listProductCart.add(pc);
                }
                Cart c = new Cart();
                c.setListProducts(listProductCart);
                o.setCart(c);
            }
            return listOrders;
        } catch (SQLException ex) {
            Logger.getLogger(OrderDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

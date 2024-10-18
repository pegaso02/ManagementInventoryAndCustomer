
package Controller;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class ConexionBd {
    
    private static final String url = "jdbc:mysql://localhost:3306/ManagmentInventoryCustomer";
    private  static final String user = "root";
    private  static final String password = "Fgg230314041@";
    
    public static Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(url, user, password);
        
    }
    
    
    
    
}

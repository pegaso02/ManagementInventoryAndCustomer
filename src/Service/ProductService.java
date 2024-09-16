

package Service;

import Controller.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductService {
    
    public void newProduct(String productName,Double price, int Qty){
        String query = "INSERT INTO Product (ProductName,Price,qty) VALUES (?,?,?)";

        
        try(
        Connection con = ConexionBd.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
                ) {
            
            ps.setString(1, productName);
            ps.setDouble(2, price);
            ps.setInt(3, Qty);
            
            int row = ps.executeUpdate();
            
            if(row>0){
                System.out.println("Producto ingresado");
            }
            
        } catch (Exception e) {
            System.out.println("Producto no ingresado !! "+e);
        }
    }
    
    
    
}

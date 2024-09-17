
package Service;

import Controller.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CustomerService {
    
    public void createCustomer(String name,String mail,Double nit){
        
        String query = "INSERT INTO Customer(Name,Mail,Nit) VALUES (?, ?, ?)";
        
        try(
                Connection con = ConexionBd.getConnection();
                PreparedStatement ps = con.prepareCall(query);
                ) {
            
            ps.setString(1, name);
            ps.setString(2, mail);
            ps.setDouble(3, nit);
            
            
            // Guardar cantidad de filas afectadas
            int row = ps.executeUpdate();
            
            if(row > 0){
                System.out.println("registrado con exito !! ");
            }
                
        } catch (Exception e) {
        }
        
    }
    
}

package Modelo;

import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_GREEN;
import static Controlador.Crl_cliente.ANSI_RESET;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
      
    private static String base="gimnasio_main";
    private static String url="jdbc:mysql://localhost:3306/" + base;
    private static String usuario="root";
    private static String contraseña="root";
    
    private Connection con=null;
    
    
    public Connection getConexion(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");

            con = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            
            System.out.println(ANSI_GREEN+"-Conecto Correcta."+ANSI_RESET);
            System.out.println(ANSI_CYAN +"----------------------------------------------------------");
            
        }catch(SQLException e){
            
            
            System.out.println(e);   
            JOptionPane.showMessageDialog(null,e);
            
            
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;

    }
    
}

package compras.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "proyecto_final";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;
    
    private Conexion() {
        
    }
    
    public static Connection getConexion() {
        
        if (connection == null) {
            
            try {
                
                Class.forName("org.mariadb.jdbc.Driver");
                
                connection = DriverManager.getConnection(URL + DB, USER, PASSWORD);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
            }
            
        }
        
        return connection;
        
    }
    
}

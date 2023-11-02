package compras.accesoADatos;

import compras.entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {
     
    private Connection con = null;
    
    public ProductoData(){
        con=Conexion.getConexion();
    }
    
    public void guardarProducto(Producto producto){
        
        String sql="INSERT INTO producto(nombre, descripcion, precioActual, stock, estado)"
                + "VALUES(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            
            
           ResultSet  rs = ps.getGeneratedKeys();
            
           if(rs.next()){
               producto.setIdProducto(rs.getInt(1));
               JOptionPane.showMessageDialog(null, "producto Guardado");
           }
          ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error cuando se conecta a la tabla producto");
        }
    }
    
}

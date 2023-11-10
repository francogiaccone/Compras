package compras.accesoADatos;

import compras.entidades.DetalleCompra;
import java.sql.*;
import javax.swing.JOptionPane;

public class DetalleCompraData {
    
    private Connection con = null;
    
    public DetalleCompraData() {
        
        con = Conexion.getConexion();
        
    }
    
    public void guardarDetalle(DetalleCompra detalle) {
        
        String sql = "INSERT INTO detallecompra(cantidad, precioCosto, idCompra, idProducto)"
                    + "VALUES (?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioCosto());
            ps.setInt(1, detalle.getCompra().getIdCompra());
            ps.setInt(4, detalle.getProducto().getIdProducto());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle de compra registrado.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla DetalleCompra.");
        }
    }
    
    public void eliminarDetalle(int id) {
        String sql = "DELETE FROM detallecompra WHERE idDetalle = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla DetalleCompra.");
        }
    }
    
}

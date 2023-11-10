package compras.accesoADatos;

import compras.entidades.Compra;
import compras.entidades.Proveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraData {
    
    private Connection con = null;
    private ProveedorData provData;
    
    public CompraData() {
        con = Conexion.getConexion();
        provData = new ProveedorData();
    }
    
    public void guardarCompra(Compra compra) {
        String sql = "INSERT INTO compra (idProveedor, fecha)"
                    + "VALUES (?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra registrada.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Compra.");
        }
    }
    
    public Compra buscarCompra(int id) {
        String sql = "SELECT idProveedor, fecha FROM compra WHERE idCompra = ?";

        Compra compra = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                compra = new Compra();
                compra.setIdCompra(id);
                Proveedor proveedor = provData.buscarProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(proveedor);
                compra.setFecha(rs.getDate("fecha").toLocalDate());

            } else {
                JOptionPane.showMessageDialog(null, "No existe la compra");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor");
        }
        return compra;
    }
    
    public List<Compra> listarCompras() {
        String sql = "SELECT idCompra, idProveedor, fecha FROM compra";
        
        ArrayList<Compra> compras = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                Proveedor proveedor = provData.buscarProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(proveedor);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                
                compras.add(compra);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Compra");
        }
        
        return compras;
    }
    
    
    
}

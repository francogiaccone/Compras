package compras.accesoADatos;

import compras.entidades.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class ProveedorData {
    
    private Connection con = null;

    public ProveedorData() {
        con = Conexion.getConexion();
    }
    
    public void guardarProveedor(Proveedor proveedor) {
        
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono)"
                + "VALUES (?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor Guardado");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor");
        }
    }
    
    public void modificarProveedor(Proveedor proveedor) {

        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?"
                + " WHERE idProovedor = ? ";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor");
        }
    }
    
    public Proveedor buscarProveedor(int id) {
        String sql = "SELECT razonSocial, domicilio, telefono FROM proveedor WHERE idProveedor = ?";

        Proveedor proveedor = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                proveedor = new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el proveedor");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor");
        }
        return proveedor;
    }
    
}

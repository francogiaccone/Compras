package compras.accesoADatos;

import compras.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorData {
    
    private Connection con = null;

    public ProveedorData() {
        con = Conexion.getConexion();
    }
    
    public void guardarProveedor(Proveedor proveedor) {
        
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono, estado)"
                + "VALUES (?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor guardado.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor.");
        }
    }
    
    public void modificarProveedor(Proveedor proveedor) {

        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?"
                + " WHERE idProveedor = ? ";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor.");
        }
    }
    
    public void eliminarProveedor(int id) {
        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor.");
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
    
    public List<Proveedor> listarProveedores() {
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedor WHERE estado = 1";
        
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Proveedor proveedor = new Proveedor(
                    rs.getInt("idProveedor"),
                    rs.getString("razonSocial"),
                    rs.getString("domicilio"),
                    rs.getString("telefono"),
                    true
                );
                
                proveedores.add(proveedor);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor");
        } catch (NullPointerException ex) {
            
        }
        
        return proveedores;
    }
    
    public List<Proveedor> listarProveedoresEliminados() {
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedor WHERE estado = 0";
        
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Proveedor proveedor = new Proveedor(
                    rs.getInt("idProveedor"),
                    rs.getString("razonSocial"),
                    rs.getString("domicilio"),
                    rs.getString("telefono"),
                    true
                );
                
                proveedores.add(proveedor);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor");
        } catch (NullPointerException ex) {
            
        }
        
        return proveedores;
    }
    
    public List<Proveedor> listarProveedoresPorProducto(int idProducto) {
        String sql = "SELECT DISTINCT proveedor.* FROM proveedor "
                    + "JOIN compra ON compra.idProveedor = proveedor.idProveedor "
                    + "JOIN detallecompra ON detallecompra.idCompra = compra.idCompra "
                    + "JOIN producto ON detallecompra.idProducto = producto.idProducto "
                    + "WHERE producto.idProducto = ? AND proveedor.estado = true";
        
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Proveedor proveedor = new Proveedor(
                    rs.getInt("idProveedor"),
                    rs.getString("razonSocial"),
                    rs.getString("domicilio"),
                    rs.getString("telefono"),
                    true
                );
                
                proveedores.add(proveedor);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Proveedor");
        } catch (NullPointerException ex) {}
        
        return proveedores;
    }
}

package compras.accesoADatos;

import compras.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleCompraData {
    
    private Connection con = null;
    CompraData comData;
    ProductoData prodData;
    
    public DetalleCompraData() {
        
        con = Conexion.getConexion();
        comData = new CompraData();
        prodData = new ProductoData();
    }
    
    public void guardarDetalle(DetalleCompra detalle) {
        
        String sql = "INSERT INTO detallecompra(cantidad, precioCosto, idCompra, idProducto)"
                    + "VALUES (?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioCosto());
            ps.setInt(3, detalle.getCompra().getIdCompra());
            ps.setInt(4, detalle.getProducto().getIdProducto());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "Detalle de compra registrado.");
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
    
    public List<DetalleCompra> listarDetalleCompra() {
        String sql = "SELECT detallecompra.idDetalle, producto.nombre, detallecompra.cantidad, detallecompra.precioCosto, compra.fecha, proveedor.razonSocial FROM detallecompra "
                    + "JOIN compra ON detallecompra.idCompra = compra.idCompra "
                    + "JOIN producto ON detallecompra.idProducto = producto.idProducto "
                    + "JOIN proveedor ON compra.idProveedor = proveedor.idProveedor";
        
        ArrayList<DetalleCompra> detalles = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                Producto producto = new Producto(rs.getString("nombre"), "", 0, 0, true);
                detalleCompra.setProducto(producto);
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                Proveedor proveedor = new Proveedor(rs.getString("razonSocial"), "", "", true);
                Compra compra = new Compra(proveedor, rs.getDate("fecha").toLocalDate());
                detalleCompra.setCompra(compra);
                
                detalles.add(detalleCompra);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla DetalleCompra");
        }
        
        return detalles;
    }
    
    public List<DetalleCompra> listarDetalleCompraPorProveedor(int idProveedor) {
        String sql = "SELECT detallecompra.idDetalle, producto.nombre, detallecompra.cantidad, detallecompra.precioCosto, compra.fecha FROM detallecompra "
                    + "JOIN compra ON detallecompra.idCompra = compra.idCompra "
                    + "JOIN producto ON detallecompra.idProducto = producto.idProducto "
                    + "WHERE compra.idProveedor = ?";
        
        ArrayList<DetalleCompra> detalles = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                Producto producto = new Producto(rs.getString("nombre"), "", 0, 0, true);
                detalleCompra.setProducto(producto);
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                Compra compra = new Compra(null, rs.getDate("fecha").toLocalDate());
                detalleCompra.setCompra(compra);
                
                detalles.add(detalleCompra);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla DetalleCompra");
        }
        
        return detalles;
    }
}

package compras.accesoADatos;

import compras.entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }

    public void guardarProducto(Producto producto) {

        String sql = "INSERT INTO producto (nombre, descripcion, precioActual, stock, estado)"
                + "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto Guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
    }

    public void modificarProducto(Producto producto) {

        String sql = "UPDATE producto SET nombre = ?, descripcion = ?, precioActual = ?, stock = ?"
                + " WHERE idProducto = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getIdProducto());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                //JOptionPane.showMessageDialog(null, "Producto modificado con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
    }

    public void eliminarProducto(int id) {

        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
    }

    public Producto buscarProducto(int id) {
        String sql = "SELECT nombre, descripcion, precioActual, stock FROM producto WHERE idProducto = ? AND estado = 1";

        Producto producto = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                producto = new Producto();
                producto.setIdProducto(id);
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
        return producto;
    }

    public List<Producto> listarProductos() {
        String sql = "SELECT idProducto, nombre, descripcion, precioActual, stock FROM producto WHERE estado = 1";
        ArrayList<Producto> productos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);

                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
        return productos;
    }
    
    public List<Producto> listarProductosEliminados() {
        String sql = "SELECT idProducto, nombre, descripcion, precioActual, stock FROM producto WHERE estado = 0";
        ArrayList<Producto> productos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(false);

                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
        return productos;
    }
    
    public List<Producto> listarProductosPorFecha(String fecha) {
        
        String sql = "SELECT producto.* FROM producto "
                    + "JOIN detallecompra ON detallecompra.idProducto = producto.idProducto "
                    + "JOIN compra ON detallecompra.idCompra = compra.idCompra "
                    + "WHERE compra.fecha = ?";
        
        ArrayList<Producto> productos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fecha);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                
                boolean prodEnLista = false;
                for (Producto prod : productos) {
                    if (prod.getIdProducto() == producto.getIdProducto()) {
                        prodEnLista = true;
                        break;
                    }
                }
                
                if (prodEnLista) {
                    continue;
                }
                
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));

                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
        return productos;
    }
    
    public List<Producto> listarProductosPorCompra(int idCompra) {
        String sql = "SELECT producto.* FROM producto "
                    + "JOIN detallecompra ON detallecompra.idProducto = producto.idProducto "
                    + "JOIN compra ON detallecompra.idCompra = compra.idCompra "
                    + "WHERE compra.idCompra = ?";
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));

                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
        return productos;
    }
    
    public List<Producto> listarProductosMasComprados(String fecha1, String fecha2) {
        String sql = "SELECT producto.idProducto, producto.nombre, producto.descripcion, SUM(detallecompra.cantidad) AS total FROM producto " 
                    + "JOIN detallecompra ON producto.idProducto = detallecompra.idProducto "
                    + "JOIN compra ON detallecompra.idCompra = compra.idCompra "
                    + "WHERE compra.fecha BETWEEN ? AND ?"
                    + "GROUP BY producto.idProducto, producto.nombre, producto.descripcion " 
                    + "ORDER BY total DESC";
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fecha1);
            ps.setString(2, fecha2);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("total"));

                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Producto");
        }
        return productos;
    }
    
}

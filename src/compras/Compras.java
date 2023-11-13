package compras;

import compras.accesoADatos.*;
import compras.entidades.*;

public class Compras {

    public static void main(String[] args) {
        
        Conexion.getConexion();
        
        
        //Producto arroz = new Producto("arroz","tio Franco",500.00,20,true);
        
        //Producto fideos = new Producto(2,"fideos","carolina",300.00,30,true);
        
        //ProductoData produc = new ProductoData();
        
        //produc.guardarProducto(arroz);
        
        //produc.guardarProducto(fideos);
        
        //produc.modificarProducto(fideos);
        
        //Producto mostaza = new Producto("mostaza","sabora",700.00,30,true);
        
        //produc.guardarProducto(mostaza);
        
        //produc.eliminarProducto(2);
        
        /*Producto productoEncontrado=produc.buscarProducto(3);
        if(productoEncontrado!=null){
            System.out.println("nombre " + productoEncontrado.getNombre());
            System.out.println("descripcion " + productoEncontrado.getDescripcion());
            System.out.println("precioActual " + productoEncontrado.getPrecioActual());
            System.out.println("stock " + productoEncontrado.getStock());
        }*/
        
        /*for(Producto ProductoData:produc.listarProductos()){
            System.out.println(ProductoData);
        }*/
        
        /*Proveedor Franco = new Proveedor("Genaro Fria","Buenos Aires 109","265723670145", true);
        
        ProveedorData Provee = new ProveedorData();
        
        Provee.guardarProveedor(Franco);*/
        
        //Proveedor sergio = new Proveedor("Sergio sa", "av siempre viva", "0124124", true);
        
        //System.out.println(Franco);
        //Provee.modificarProveedor(sergio);
    }
    
}

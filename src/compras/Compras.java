package compras;

import compras.accesoADatos.*;
import compras.entidades.Producto;

public class Compras {

    public static void main(String[] args) {
        
        Conexion.getConexion();
        
        
        Producto arroz = new Producto("arroz","tio Franco",500.00,20,true);
        
        ProductoData produc = new ProductoData();
        
        produc.guardarProducto(arroz);
    }
    
}

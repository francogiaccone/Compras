package compras.vistas;

import compras.accesoADatos.*;
import compras.entidades.*;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class MenuListar extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo;
    ProductoData prodData;
    ProveedorData provData;
    DetalleCompraData detData;
    
    public MenuListar() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        prodData = new ProductoData();
        provData = new ProveedorData();
        detData = new DetalleCompraData();
        
        modelo = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbCompras = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();
        jbProveedores = new javax.swing.JButton();
        jrEliminados = new javax.swing.JRadioButton();
        jrActivos = new javax.swing.JRadioButton();
        jlListar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(940, 550));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCompras.setBackground(new java.awt.Color(255, 255, 255));
        jbCompras.setForeground(new java.awt.Color(0, 0, 0));
        jbCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        jbCompras.setBorder(null);
        jbCompras.setBorderPainted(false);
        jbCompras.setFocusPainted(false);
        jbCompras.setRequestFocusEnabled(false);
        jbCompras.setVerifyInputWhenFocusTarget(false);
        jbCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprasActionPerformed(evt);
            }
        });
        jPanel1.add(jbCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 80, 50));

        jbProductos.setBackground(new java.awt.Color(255, 255, 255));
        jbProductos.setForeground(new java.awt.Color(0, 0, 0));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajas.png"))); // NOI18N
        jbProductos.setBorder(null);
        jbProductos.setFocusPainted(false);
        jbProductos.setFocusable(false);
        jbProductos.setRequestFocusEnabled(false);
        jbProductos.setVerifyInputWhenFocusTarget(false);
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });
        jPanel1.add(jbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 50));

        jbProveedores.setBackground(new java.awt.Color(255, 255, 255));
        jbProveedores.setForeground(new java.awt.Color(0, 0, 0));
        jbProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grupo.png"))); // NOI18N
        jbProveedores.setBorder(null);
        jbProveedores.setBorderPainted(false);
        jbProveedores.setFocusPainted(false);
        jbProveedores.setFocusable(false);
        jbProveedores.setRequestFocusEnabled(false);
        jbProveedores.setVerifyInputWhenFocusTarget(false);
        jbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(jbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 80, 50));

        botones.add(jrEliminados);
        jrEliminados.setText("Eliminados");
        jrEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEliminadosActionPerformed(evt);
            }
        });
        jPanel1.add(jrEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        botones.add(jrActivos);
        jrActivos.setSelected(true);
        jrActivos.setText("Activos");
        jrActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivosActionPerformed(evt);
            }
        });
        jPanel1.add(jrActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jlListar.setFont(new java.awt.Font("Ebrima", 1, 13)); // NOI18N
        jlListar.setForeground(new java.awt.Color(0, 0, 0));
        jlListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jlListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 260, 20));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTabla.getTableHeader().setResizingAllowed(false);
        jtTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtTabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 890, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprasActionPerformed
        if (jlListar.getText() == "COMPRAS") {
            return;
        }
        
        jlListar.setText("COMPRAS");
        
        jrActivos.setEnabled(false);
        jrEliminados.setEnabled(false);
        
        armarCabeceraCompras();
        
        ArrayList<DetalleCompra> compras = (ArrayList<DetalleCompra>) detData.listarDetalleCompra();
        
        modelo.setRowCount(0);
        
        for (DetalleCompra detalle : compras) {
            modelo.addRow(new Object[] {detalle.getIdDetalle(), detalle.getProducto().getNombre(), detalle.getCantidad(), detalle.getPrecioCosto(), detalle.getCompra().getProveedor().getRazonSocial(), detalle.getCompra().getFecha()});
        }
    }//GEN-LAST:event_jbComprasActionPerformed

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
        if (jlListar.getText() == "PRODUCTOS") {
            return;
        }
        
        jlListar.setText("PRODUCTOS");
        
        jrActivos.setEnabled(true);
        jrEliminados.setEnabled(true);
        
        armarCabeceraProductos();
        
        ArrayList<Producto> productos;
        
        if (jrActivos.isSelected()) {
            productos = (ArrayList<Producto>) prodData.listarProductos();
        } else {
            productos = (ArrayList<Producto>) prodData.listarProductosEliminados();
        }
        
        modelo.setRowCount(0);
        
        for (Producto producto : productos) {
            modelo.addRow(new Object[] {producto.getIdProducto(), producto.getNombre(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
        }
    }//GEN-LAST:event_jbProductosActionPerformed

    private void jbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProveedoresActionPerformed
        if (jlListar.getText() == "PROVEEDORES") {
            return;
        }
        
        jlListar.setText("PROVEEDORES");
        
        jrActivos.setEnabled(true);
        jrEliminados.setEnabled(true);
        
        armarCabeceraProveedores();
        
        ArrayList<Proveedor> proveedores;
        
        if (jrActivos.isSelected()) {
            proveedores = (ArrayList<Proveedor>) provData.listarProveedores();
        } else {
            proveedores = (ArrayList<Proveedor>) provData.listarProveedoresEliminados();
        }
        
        modelo.setRowCount(0);
        
        for (Proveedor proveedor : proveedores) {
            modelo.addRow(new Object[] {proveedor.getIdProveedor(), proveedor.getRazonSocial(), proveedor.getDomicilio(), proveedor.getTelefono()});
        }
    }//GEN-LAST:event_jbProveedoresActionPerformed

    private void jrEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEliminadosActionPerformed
        String texto = jlListar.getText();
        
        if (texto.equals("PRODUCTOS")) {
            ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductosEliminados();
            
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                modelo.addRow(new Object[] {producto.getIdProducto(), producto.getNombre(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
            }
        } else if (texto.equals("PROVEEDORES")) {
            ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) provData.listarProveedoresEliminados();
            
            modelo.setRowCount(0);
            for (Proveedor proveedor : proveedores) {
                modelo.addRow(new Object[] {proveedor.getIdProveedor(), proveedor.getRazonSocial(), proveedor.getDomicilio(), proveedor.getTelefono()});
            }
        }
    }//GEN-LAST:event_jrEliminadosActionPerformed

    private void jrActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivosActionPerformed
        String texto = jlListar.getText();
        
        if (texto.equals("PRODUCTOS")) {
            ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductos();
            
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                modelo.addRow(new Object[] {producto.getIdProducto(), producto.getNombre(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
            }
        } else if (texto.equals("PROVEEDORES")) {
            ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) provData.listarProveedores();
            
            modelo.setRowCount(0);
            for (Proveedor proveedor : proveedores) {
                modelo.addRow(new Object[] {proveedor.getIdProveedor(), proveedor.getRazonSocial(), proveedor.getDomicilio(), proveedor.getTelefono()});
            }
        }
    }//GEN-LAST:event_jrActivosActionPerformed
    
    private void armarCabecera() {
        modelo.addColumn("");
        
        jtTabla.setModel(modelo);
    }
    
    private void armarCabeceraProductos() {
        modelo.setColumnCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        
        jtTabla.setModel(modelo);
    }
    
    private void armarCabeceraProveedores() {
        modelo.setColumnCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("Razón social");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Teléfono");
        
        jtTabla.setModel(modelo);
    }
    
    private void armarCabeceraCompras() {
        modelo.setColumnCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Fecha");
        
        jtTabla.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCompras;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbProveedores;
    private javax.swing.JLabel jlListar;
    private javax.swing.JRadioButton jrActivos;
    private javax.swing.JRadioButton jrEliminados;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

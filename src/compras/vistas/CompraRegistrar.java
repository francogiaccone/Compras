package compras.vistas;

import compras.accesoADatos.*;
import compras.entidades.*;
import static compras.vistas.MenuHistorial.historial;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class CompraRegistrar extends javax.swing.JInternalFrame {

    DetalleCompraData detData;
    ProveedorData provData;
    ProductoData prodData;
    CompraData comData;
    ArrayList<DetalleCompra> detalles;

    boolean primerAgregar;

    public CompraRegistrar() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);

        detData = new DetalleCompraData();
        provData = new ProveedorData();
        prodData = new ProductoData();
        comData = new CompraData();

        detalles = new ArrayList<>();

        primerAgregar = false;

        cargarComboProveedor();
        cargarComboProductos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbProveedores = new javax.swing.JComboBox<>();
        jcbProductos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfPrecioCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jbAgregarOtroProducto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlProveedor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlProductos = new javax.swing.JLabel();
        jlUnidades = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlDomicilio = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Compra");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Proveedor");

        jcbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new Proveedor[] {}));

        jcbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new Producto[] {}));
        jcbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProductosItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Producto");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Cantidad");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Precio de Costo");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Fecha");

        jbAgregarOtroProducto.setForeground(new java.awt.Color(51, 51, 255));
        jbAgregarOtroProducto.setText("Añadir al carrito");
        jbAgregarOtroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarOtroProductoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setMaximumSize(new java.awt.Dimension(331, 68));

        jlProveedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setText("------------------------------------------------------------------------------------------");

        jlFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jlProductos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlProductos.setAutoscrolls(true);
        jlProductos.setMaximumSize(new java.awt.Dimension(187, 267));

        jlUnidades.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlUnidades.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlUnidades.setMaximumSize(new java.awt.Dimension(89, 267));

        jLabel9.setText("------------------------------------------------------------------------------------------");

        jlTelefono.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jlTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jbRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(0, 153, 51));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(64, 64, 64)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregarOtroProducto)
                        .addGap(211, 211, 211)
                        .addComponent(jbRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(147, 147, 147)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3))
                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbAgregarOtroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProductosItemStateChanged
        Producto productoSeleccionado = (Producto) jcbProductos.getSelectedItem();

        for (DetalleCompra detalle : detalles) {
            if (detalle.getProducto().getIdProducto() == productoSeleccionado.getIdProducto()) {
                jtfPrecioCosto.setEnabled(false);
                jtfPrecioCosto.setText(String.valueOf(detalle.getPrecioCosto()));
                return;
            }
        }

        jtfPrecioCosto.setEnabled(true);
    }//GEN-LAST:event_jcbProductosItemStateChanged

    private void jbAgregarOtroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarOtroProductoActionPerformed
        try {
            if (jcbProductos.getSelectedIndex() == -1 || jcbProveedores.getSelectedIndex() == -1 || jtfPrecioCosto.getText().isEmpty() || jtfCantidad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hay campos vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (jdcFecha.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Error en el campo fecha.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Producto productoSeleccionado = (Producto) jcbProductos.getSelectedItem();
            int cantidad = Integer.parseInt(jtfCantidad.getText().trim());
            double precioCosto = Double.parseDouble(jtfPrecioCosto.getText().trim());

            if (primerAgregar == false) {
                Proveedor proveedor = (Proveedor) jcbProveedores.getSelectedItem();
                jlProveedor.setText(proveedor.getRazonSocial());
                jlFecha.setText(jdcFecha.getDate().toString());
                jlDomicilio.setText(proveedor.getDomicilio());
                jlTelefono.setText(proveedor.getTelefono());
                primerAgregar = true;
            }

            for (DetalleCompra detalle : detalles) {
                if (detalle.getProducto().getIdProducto() == productoSeleccionado.getIdProducto()) {
                    detalle.setCantidad(detalle.getCantidad() + cantidad);

                    String jlProductosCopia = jlProductos.getText().replace("<html>", "");
                    jlProductosCopia = jlProductosCopia.replace("</html>", "");
                    jlProductos.setText("<html>" + jlProductosCopia + "<br>" + productoSeleccionado.getNombre() + "</html>");

                    String jlUnidadesCopia = jlUnidades.getText().replace("<html>", "");
                    jlUnidadesCopia = jlUnidadesCopia.replace("</html>", "");
                    jlUnidades.setText("<html>" + jlUnidadesCopia + "<br>x " + cantidad + "u.</html>");

                    return;
                }
            }

            DetalleCompra detalle = new DetalleCompra(cantidad, precioCosto, null, productoSeleccionado);

            detalles.add(detalle);

            String jlProductosCopia = jlProductos.getText().replace("<html>", "");
            jlProductosCopia = jlProductosCopia.replace("</html>", "");
            jlProductos.setText("<html>" + jlProductosCopia + "<br>" + productoSeleccionado.getNombre() + "</html>");

            String jlUnidadesCopia = jlUnidades.getText().replace("<html>", "");
            jlUnidadesCopia = jlUnidadesCopia.replace("</html>", "");
            jlUnidades.setText("<html>" + jlUnidadesCopia + "<br>x " + cantidad + "u.</html>");

            jcbProveedores.setEnabled(false);
            jdcFecha.setEnabled(false);
            jtfPrecioCosto.setEnabled(false);

        } catch (NumberFormatException ex) {

        }
    }//GEN-LAST:event_jbAgregarOtroProductoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        try {
            if (detalles.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Carrito vacío. Agregue un producto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Proveedor proveedor = (Proveedor) jcbProveedores.getSelectedItem();
            Date fechaDate = jdcFecha.getDate();
            LocalDate fecha = fechaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Compra compra = new Compra(proveedor, fecha);

            comData.guardarCompra(compra);

            for (DetalleCompra detalle : detalles) {
                detalle.setCompra(compra);

                detData.guardarDetalle(detalle);

                Producto productoModificado = detalle.getProducto();
                productoModificado.setStock(productoModificado.getStock() + detalle.getCantidad());
                prodData.modificarProducto(productoModificado);
            }

            JOptionPane.showMessageDialog(this, "Compra realizada.");
            
            Historial nuevoHistorial = new Historial("Compra registrada", LocalDateTime.now());
            historial.add(nuevoHistorial);

            detalles.clear();

            jcbProveedores.setEnabled(true);
            jdcFecha.setEnabled(true);
            jtfPrecioCosto.setEnabled(true);
            limpiarFactura();

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error de formato en la fecha. (dd/mm/yy)", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void cargarComboProveedor() {
        ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) provData.listarProveedores();

        for (Proveedor prov : proveedores) {
            jcbProveedores.addItem(prov);
        }
    }

    private void cargarComboProductos() {
        ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductos();

        for (Producto prod : productos) {
            jcbProductos.addItem(prod);
        }
    }

    private void limpiarFactura() {
        primerAgregar = false;
        jlProveedor.setText("");
        jlFecha.setText("");
        jlProductos.setText("");
        jlUnidades.setText("");
        jlDomicilio.setText("");
        jlTelefono.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregarOtroProducto;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JComboBox<Proveedor> jcbProveedores;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlProductos;
    private javax.swing.JLabel jlProveedor;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlUnidades;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfPrecioCosto;
    // End of variables declaration//GEN-END:variables
}

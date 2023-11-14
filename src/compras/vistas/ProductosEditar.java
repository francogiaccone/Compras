package compras.vistas;

import compras.accesoADatos.ProductoData;
import compras.entidades.Historial;
import compras.entidades.Producto;
import static compras.vistas.MenuHistorial.historial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ProductosEditar extends javax.swing.JInternalFrame {

    ProductoData prodData;
    DefaultTableModel modelo;

    public ProductosEditar() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);

        prodData = new ProductoData();

        modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int f, int c) {
                if (c == 0) {
                    return false;
                }
                return true;
            }
        };

        armarCabecera();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDescripcion = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();
        jtfStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(234, 236, 238));
        setMinimumSize(new java.awt.Dimension(950, 550));

        jPanel1.setBackground(new java.awt.Color(234, 236, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripción");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio");

        jbRegistrar.setBackground(new java.awt.Color(234, 236, 238));
        jbRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(0, 153, 51));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Stock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2)
                                .addGap(71, 71, 71))
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1))
                            .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jbRegistrar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRegistrar)
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(234, 236, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jtTabla.setBackground(new java.awt.Color(234, 236, 238));
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
        jScrollPane1.setViewportView(jtTabla);

        jbModificar.setBackground(new java.awt.Color(234, 236, 238));
        jbModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 153, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(234, 236, 238));
        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 0, 51));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        try {

            String nombre = jtfNombre.getText().trim();
            String descripcion = jtfDescripcion.getText().trim();

            if (nombre.isEmpty() || descripcion.isEmpty() || jtfPrecio.getText().isEmpty() || jtfStock.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hay campos vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Double precio = Double.parseDouble(jtfPrecio.getText().trim());
            Integer stock = Integer.parseInt(jtfStock.getText().trim());

            Producto producto = new Producto(nombre, descripcion, precio, stock, true);

            prodData.guardarProducto(producto);
            
            Historial nuevoHistorial = new Historial("Producto agregado", LocalDateTime.now());
            historial.add(nuevoHistorial);

            limpiarCampos();

            actualizarTabla();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error de formato, solo números.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {
            if (jtTabla.getSelectedRowCount() > 1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila por favor.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (jtTabla.isEditing()) {
                JOptionPane.showMessageDialog(this, "Confirme la celda editada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int fila = jtTabla.getSelectedRow();

            int idProducto = (int) modelo.getValueAt(fila, 0);
            String nombre = (String) modelo.getValueAt(fila, 1);
            String descripcion = (String) modelo.getValueAt(fila, 2);
            String precioString = modelo.getValueAt(fila, 3).toString();
            double precio = Double.parseDouble(precioString);
            String stockString = modelo.getValueAt(fila, 4).toString();
            int stock = Integer.parseInt(stockString);

            Producto producto = new Producto(idProducto, nombre, descripcion, precio, stock, true);

            prodData.modificarProducto(producto);
            
            Historial nuevoHistorial = new Historial("Producto modificado", LocalDateTime.now());
            historial.add(nuevoHistorial);
            
            JOptionPane.showMessageDialog(null, "Producto modificado con exito.");

            actualizarTabla();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error de formato, solo números. (tabla Precio y Stock)", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int[] filas = jtTabla.getSelectedRows();

        for (int fila : filas) {
            int idProducto = (int) modelo.getValueAt(fila, 0);

            prodData.eliminarProducto(idProducto);
        }

        int seleccionFila = filas.length;
        if (seleccionFila == 0) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún producto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (seleccionFila == 1) {
            JOptionPane.showMessageDialog(this, "Se ha eliminado 1 producto.");
            Historial nuevoHistorial = new Historial("1 producto eliminado", LocalDateTime.now());
            historial.add(nuevoHistorial);
        } else {
            JOptionPane.showMessageDialog(this, "Se han eliminado " + seleccionFila + " productos.");
            Historial nuevoHistorial = new Historial(seleccionFila + " productos agregados", LocalDateTime.now());
            historial.add(nuevoHistorial);
        }

        actualizarTabla();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void limpiarCampos() {
        jtfNombre.setText("");
        jtfDescripcion.setText("");
        jtfPrecio.setText("");
        jtfStock.setText("");
    }

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");

        jtTabla.setModel(modelo);
    }

    private void cargarTabla() {
        ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductos();

        for (Producto prod : productos) {
            modelo.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getDescripcion(), prod.getPrecioActual(), prod.getStock()});
        }
    }

    private void actualizarTabla() {
        modelo.setRowCount(0);
        cargarTabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfStock;
    // End of variables declaration//GEN-END:variables
}

package compras.vistas;

import compras.accesoADatos.ProductoData;
import compras.entidades.Producto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ProductosListarPorFecha extends javax.swing.JInternalFrame {
     
    ProductoData prodData;
    DefaultTableModel modelo;
    
    public ProductosListarPorFecha() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        prodData = new ProductoData();
        
        modelo = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        
        armarCabecera();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();

        jLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel.setText("Listar por fecha");

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

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jbBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            Date fechaDate = jdcFecha.getDate();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = dateFormat.format(fechaDate);
            
            ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductosPorFecha(fecha);
            
            modelo.setRowCount(0);
            
            for (Producto prod : productos) {
                modelo.addRow(new Object[] {prod.getIdProducto(), prod.getNombre(), prod.getDescripcion(), prod.getPrecioActual(), prod.getStock()});
            }
        } catch (NullPointerException ex) {
            modelo.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Error en el campo fecha.");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

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
            modelo.addRow(new Object[] {prod.getIdProducto(), prod.getNombre(), prod.getDescripcion(), prod.getPrecioActual(), prod.getStock()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

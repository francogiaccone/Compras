package compras.vistas;

import compras.accesoADatos.ProductoData;
import compras.entidades.Producto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ProductosListarMasComprados extends javax.swing.JInternalFrame {

    ProductoData prodData;
    DefaultTableModel modelo;
    
    public ProductosListarMasComprados() {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        jdcFecha2 = new com.toedter.calendar.JDateChooser();
        jdcFecha1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();

        jLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel.setText("Listar más comprados");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("hasta");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setText("Fecha1");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setText("Fecha2");

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
                .addGap(135, 135, 135)
                .addComponent(jdcFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdcFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(250, 250, 250))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        try {
            Date fechaDate1, fechaDate2;
            
            if (jdcFecha1.getDate() != null && jdcFecha2.getDate() == null) {
                fechaDate1 = jdcFecha1.getDate();
                fechaDate2 = new Date();
            } else if (jdcFecha1.getDate() == null && jdcFecha2.getDate() != null) {
                fechaDate1 = new Date(Long.MIN_VALUE);
                fechaDate2 = jdcFecha2.getDate();
            } else {
                fechaDate1 = jdcFecha1.getDate();
                fechaDate2 = jdcFecha2.getDate();
            }
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            String fecha1 = dateFormat.format(fechaDate1);
            String fecha2 = dateFormat.format(fechaDate2);
            
            ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductosMasComprados(fecha1, fecha2);
            
            modelo.setRowCount(0);
            
            for (Producto prod : productos) {
                modelo.addRow(new Object[] {prod.getIdProducto(), prod.getNombre(), prod.getDescripcion(), prod.getStock()});
            }
            
        } catch (NullPointerException ex) {
            modelo.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Ingrese una fecha en al menos un campo.");
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed
   
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Total Comprado");
        
        jtTabla.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private com.toedter.calendar.JDateChooser jdcFecha1;
    private com.toedter.calendar.JDateChooser jdcFecha2;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

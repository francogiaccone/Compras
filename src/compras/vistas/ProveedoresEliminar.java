package compras.vistas;

import compras.accesoADatos.ProveedorData;
import compras.entidades.Historial;
import compras.entidades.Proveedor;
import static compras.vistas.MenuHistorial.historial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ProveedoresEliminar extends javax.swing.JInternalFrame {

    ProveedorData provData;
    DefaultTableModel modelo;
    
    public ProveedoresEliminar() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        provData = new ProveedorData();
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Proveedor");

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

        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 0, 51));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int[] filas = jtTabla.getSelectedRows();
        
        for (int fila : filas) {
            int idProveedor = (int) modelo.getValueAt(fila, 0);
            
            provData.eliminarProveedor(idProveedor);
        }
        
        int seleccionFila = filas.length;
        if (seleccionFila == 0) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún proveedor.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (seleccionFila == 1) {
            JOptionPane.showMessageDialog(this, "Se ha eliminado 1 proveedor.");
            Historial nuevoHistorial = new Historial("1 proveedor eliminado", LocalDateTime.now());
            historial.add(nuevoHistorial);
        } else {
            JOptionPane.showMessageDialog(this, "Se han eliminado " + seleccionFila + " proveedores.");
            Historial nuevoHistorial = new Historial(seleccionFila + " proveedores eliminados", LocalDateTime.now());
            historial.add(nuevoHistorial);
        }
        
        actualizarTabla();
    }//GEN-LAST:event_jbEliminarActionPerformed
    
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Razón Social");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Teléfono");
        
        jtTabla.setModel(modelo);
    }
    
    private void cargarTabla() {
        ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) provData.listarProveedores();
        
        for (Proveedor prov : proveedores) {
            modelo.addRow(new Object[] {prov.getIdProveedor(), prov.getRazonSocial(), prov.getDomicilio(), prov.getTelefono()});
        }
    }

    private void actualizarTabla() {
        modelo.setRowCount(0);
        cargarTabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

package compras.vistas;

import compras.accesoADatos.ProveedorData;
import compras.entidades.Proveedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ProveedoresModificar extends javax.swing.JInternalFrame {

    ProveedorData provData;

    public ProveedoresModificar() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        provData = new ProveedorData();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbProveedor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtfRazonSocial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfDomicilio = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Proveedor");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Seleccionar");

        jcbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new Proveedor[] {}));
        jcbProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProveedorItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Razón Social");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Domicilio");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Teléfono");

        jbModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 153, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(345, 345, 345))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfRazonSocial)
                            .addComponent(jtfDomicilio)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jcbProveedor.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un proveedor para modificar.");
            return;
        }

        String razonSocial = jtfRazonSocial.getText().trim();
        String domicilio = jtfDomicilio.getText().trim();
        String telefono = jtfTelefono.getText().trim();

        if (razonSocial.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay campos vacíos.");
            return;
        }

        Proveedor proveedorSeleccionado = (Proveedor) jcbProveedor.getSelectedItem();

        Integer id = proveedorSeleccionado.getIdProveedor();

        Proveedor proveedor = new Proveedor(id, razonSocial, domicilio, telefono, true);

        provData.modificarProveedor(proveedor);

        actualizarCombo();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfRazonSocial.setText("");
        jtfDomicilio.setText("");
        jtfTelefono.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jcbProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProveedorItemStateChanged

        Proveedor productoSeleccionado = (Proveedor) jcbProveedor.getSelectedItem();

        if (productoSeleccionado == null) {
            return;
        }

        jtfRazonSocial.setText(productoSeleccionado.getRazonSocial());
        jtfDomicilio.setText(productoSeleccionado.getDomicilio());
        jtfTelefono.setText(productoSeleccionado.getTelefono());
    }//GEN-LAST:event_jcbProveedorItemStateChanged

    private void cargarCombo() {
        ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) provData.listarProveedores();

        for (Proveedor prov : proveedores) {
            jcbProveedor.addItem(prov);
        }
    }
    
    private void actualizarCombo() {
        jcbProveedor.removeAllItems();
        cargarCombo();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfRazonSocial;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}

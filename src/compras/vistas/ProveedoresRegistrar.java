package compras.vistas;

import compras.accesoADatos.ProveedorData;
import compras.entidades.Historial;
import compras.entidades.Proveedor;
import static compras.vistas.MenuHistorial.historial;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ProveedoresRegistrar extends javax.swing.JInternalFrame {

    ProveedorData provData;

    public ProveedoresRegistrar() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        provData = new ProveedorData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jtfRazonSocial = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBorder(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Razón Social");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Agregar Proveedor");

        jbRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(0, 153, 51));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Domicilio");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Teléfono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(jtfTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtfRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfRazonSocial.setText("");
        jtfDomicilio.setText("");
        jtfTelefono.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        String razonSocial = jtfRazonSocial.getText().trim();
        String domicilio = jtfDomicilio.getText().trim();
        String telefono = jtfTelefono.getText().trim();

        if (razonSocial.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay campos vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Proveedor proveedor = new Proveedor(razonSocial, domicilio, telefono, true);
        
        provData.guardarProveedor(proveedor);
        
        Historial nuevoHistorial = new Historial("Proveedor registrado", LocalDateTime.now());
        historial.add(nuevoHistorial);

        jbLimpiarActionPerformed(evt);
    }//GEN-LAST:event_jbRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfRazonSocial;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}

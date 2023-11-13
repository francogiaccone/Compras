package compras.vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuCompras extends javax.swing.JInternalFrame {

    public MenuCompras() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbRegistrar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbListarPorProducto = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jbRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jbRegistrar.setText("Registrar");
        jbRegistrar.setBorder(null);
        jbRegistrar.setBorderPainted(false);
        jbRegistrar.setFocusPainted(false);
        jbRegistrar.setFocusable(false);
        jbRegistrar.setIconTextGap(10);
        jbRegistrar.setRequestFocusEnabled(false);
        jbRegistrar.setVerifyInputWhenFocusTarget(false);
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setBorder(null);
        jbEliminar.setBorderPainted(false);
        jbEliminar.setFocusPainted(false);
        jbEliminar.setFocusable(false);
        jbEliminar.setIconTextGap(10);
        jbEliminar.setRequestFocusEnabled(false);
        jbEliminar.setVerifyInputWhenFocusTarget(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbListarPorProducto.setBackground(new java.awt.Color(255, 255, 255));
        jbListarPorProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbListarPorProducto.setForeground(new java.awt.Color(0, 0, 0));
        jbListarPorProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jbListarPorProducto.setText("Por producto");
        jbListarPorProducto.setBorder(null);
        jbListarPorProducto.setBorderPainted(false);
        jbListarPorProducto.setFocusPainted(false);
        jbListarPorProducto.setFocusable(false);
        jbListarPorProducto.setIconTextGap(10);
        jbListarPorProducto.setRequestFocusEnabled(false);
        jbListarPorProducto.setVerifyInputWhenFocusTarget(false);

        jbModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setBorder(null);
        jbModificar.setBorderPainted(false);
        jbModificar.setFocusPainted(false);
        jbModificar.setFocusable(false);
        jbModificar.setIconTextGap(10);
        jbModificar.setRequestFocusEnabled(false);
        jbModificar.setVerifyInputWhenFocusTarget(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jbListarPorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListarPorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 130));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 950, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CompraRegistrar comRegistrar = new CompraRegistrar();
        comRegistrar.setVisible(true);
        escritorio.add(comRegistrar);
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbListarPorProducto;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRegistrar;
    // End of variables declaration//GEN-END:variables
}

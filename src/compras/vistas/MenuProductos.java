package compras.vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuProductos extends javax.swing.JInternalFrame {

    public MenuProductos() {
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
        jbEditar = new javax.swing.JButton();
        jbListarPorCompra = new javax.swing.JButton();
        jbListarMasComprados = new javax.swing.JButton();
        jbListarPorFecha = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jbEditar.setBackground(new java.awt.Color(255, 255, 255));
        jbEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.setBorder(null);
        jbEditar.setBorderPainted(false);
        jbEditar.setFocusPainted(false);
        jbEditar.setFocusable(false);
        jbEditar.setIconTextGap(10);
        jbEditar.setRequestFocusEnabled(false);
        jbEditar.setVerifyInputWhenFocusTarget(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbListarPorCompra.setBackground(new java.awt.Color(255, 255, 255));
        jbListarPorCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbListarPorCompra.setForeground(new java.awt.Color(0, 0, 0));
        jbListarPorCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jbListarPorCompra.setText("Por compra");
        jbListarPorCompra.setBorder(null);
        jbListarPorCompra.setBorderPainted(false);
        jbListarPorCompra.setFocusPainted(false);
        jbListarPorCompra.setFocusable(false);
        jbListarPorCompra.setIconTextGap(10);
        jbListarPorCompra.setRequestFocusEnabled(false);
        jbListarPorCompra.setVerifyInputWhenFocusTarget(false);
        jbListarPorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarPorCompraActionPerformed(evt);
            }
        });

        jbListarMasComprados.setBackground(new java.awt.Color(255, 255, 255));
        jbListarMasComprados.setForeground(new java.awt.Color(0, 0, 0));
        jbListarMasComprados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jbListarMasComprados.setText("Más comprados");
        jbListarMasComprados.setBorder(null);
        jbListarMasComprados.setBorderPainted(false);
        jbListarMasComprados.setFocusPainted(false);
        jbListarMasComprados.setFocusable(false);
        jbListarMasComprados.setIconTextGap(10);
        jbListarMasComprados.setRequestFocusEnabled(false);
        jbListarMasComprados.setVerifyInputWhenFocusTarget(false);
        jbListarMasComprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarMasCompradosActionPerformed(evt);
            }
        });

        jbListarPorFecha.setBackground(new java.awt.Color(255, 255, 255));
        jbListarPorFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbListarPorFecha.setForeground(new java.awt.Color(0, 0, 0));
        jbListarPorFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jbListarPorFecha.setText("Por fecha");
        jbListarPorFecha.setBorder(null);
        jbListarPorFecha.setBorderPainted(false);
        jbListarPorFecha.setFocusPainted(false);
        jbListarPorFecha.setFocusable(false);
        jbListarPorFecha.setIconTextGap(10);
        jbListarPorFecha.setRequestFocusEnabled(false);
        jbListarPorFecha.setVerifyInputWhenFocusTarget(false);
        jbListarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarPorFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jbListarPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jbListarPorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jbListarMasComprados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListarPorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListarMasComprados, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListarPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductosEditar prodAdministrar = new ProductosEditar();
        prodAdministrar.setVisible(true);
        escritorio.add(prodAdministrar);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbListarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarPorFechaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductosListarPorFecha prodListar = new ProductosListarPorFecha();
        prodListar.setVisible(true);
        escritorio.add(prodListar);
    }//GEN-LAST:event_jbListarPorFechaActionPerformed

    private void jbListarPorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarPorCompraActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductosListarPorCompras prodListar = new ProductosListarPorCompras();
        prodListar.setVisible(true);
        escritorio.add(prodListar);
    }//GEN-LAST:event_jbListarPorCompraActionPerformed

    private void jbListarMasCompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarMasCompradosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductosListarMasComprados prodListar = new ProductosListarMasComprados();
        prodListar.setVisible(true);
        escritorio.add(prodListar);
    }//GEN-LAST:event_jbListarMasCompradosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbListarMasComprados;
    private javax.swing.JButton jbListarPorCompra;
    private javax.swing.JButton jbListarPorFecha;
    // End of variables declaration//GEN-END:variables
}

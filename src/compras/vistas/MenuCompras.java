package compras.vistas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
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
        jbListarPorProveedor = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));

        jbRegistrar.setBackground(new java.awt.Color(208, 207, 207));
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

        jbListarPorProveedor.setBackground(new java.awt.Color(208, 207, 207));
        jbListarPorProveedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbListarPorProveedor.setForeground(new java.awt.Color(0, 0, 0));
        jbListarPorProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jbListarPorProveedor.setText("Por proveedor");
        jbListarPorProveedor.setBorder(null);
        jbListarPorProveedor.setBorderPainted(false);
        jbListarPorProveedor.setFocusPainted(false);
        jbListarPorProveedor.setFocusable(false);
        jbListarPorProveedor.setIconTextGap(10);
        jbListarPorProveedor.setRequestFocusEnabled(false);
        jbListarPorProveedor.setVerifyInputWhenFocusTarget(false);
        jbListarPorProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarPorProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(jbListarPorProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListarPorProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbListarPorProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarPorProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ComprasListarPorProveedores comListar = new ComprasListarPorProveedores();
        comListar.setVisible(true);
        escritorio.add(comListar);
    }//GEN-LAST:event_jbListarPorProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbListarPorProveedor;
    private javax.swing.JButton jbRegistrar;
    // End of variables declaration//GEN-END:variables
}

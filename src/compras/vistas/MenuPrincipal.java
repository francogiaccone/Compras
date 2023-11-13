package compras.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class MenuPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbHistorial = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbListar = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();
        jbProveedores = new javax.swing.JButton();
        jbCompras = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Menú principal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 20));

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 3, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ProveMax");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 114, -1));

        jbSalir.setBackground(new java.awt.Color(208, 207, 207));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
        jbSalir.setFocusPainted(false);
        jbSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalir.setRequestFocusEnabled(false);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel3.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 60, 50));

        jbHistorial.setBackground(new java.awt.Color(208, 207, 207));
        jbHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/expediente.png"))); // NOI18N
        jbHistorial.setBorder(null);
        jbHistorial.setBorderPainted(false);
        jbHistorial.setFocusPainted(false);
        jbHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbHistorial.setRequestFocusEnabled(false);
        jPanel3.add(jbHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 60, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrega.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 26, 100, 60));

        jbListar.setBackground(new java.awt.Color(208, 207, 207));
        jbListar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jbListar.setForeground(new java.awt.Color(0, 0, 0));
        jbListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jbListar.setText(" LISTAR");
        jbListar.setBorder(null);
        jbListar.setBorderPainted(false);
        jbListar.setFocusPainted(false);
        jbListar.setFocusable(false);
        jbListar.setRequestFocusEnabled(false);
        jbListar.setVerifyInputWhenFocusTarget(false);
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });
        jPanel3.add(jbListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 200, 60));

        jbProductos.setBackground(new java.awt.Color(208, 207, 207));
        jbProductos.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jbProductos.setForeground(new java.awt.Color(0, 0, 0));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajas.png"))); // NOI18N
        jbProductos.setText("  PRODUCTOS");
        jbProductos.setBorder(null);
        jbProductos.setBorderPainted(false);
        jbProductos.setFocusPainted(false);
        jbProductos.setFocusable(false);
        jbProductos.setRequestFocusEnabled(false);
        jbProductos.setVerifyInputWhenFocusTarget(false);
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });
        jPanel3.add(jbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 60));

        jbProveedores.setBackground(new java.awt.Color(208, 207, 207));
        jbProveedores.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jbProveedores.setForeground(new java.awt.Color(0, 0, 0));
        jbProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grupo.png"))); // NOI18N
        jbProveedores.setText(" PROVEEDORES");
        jbProveedores.setBorder(null);
        jbProveedores.setBorderPainted(false);
        jbProveedores.setFocusPainted(false);
        jbProveedores.setFocusable(false);
        jbProveedores.setRequestFocusEnabled(false);
        jbProveedores.setVerifyInputWhenFocusTarget(false);
        jbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProveedoresActionPerformed(evt);
            }
        });
        jPanel3.add(jbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 60));

        jbCompras.setBackground(new java.awt.Color(208, 207, 207));
        jbCompras.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jbCompras.setForeground(new java.awt.Color(0, 0, 0));
        jbCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        jbCompras.setText(" COMPRAS");
        jbCompras.setBorder(null);
        jbCompras.setBorderPainted(false);
        jbCompras.setFocusPainted(false);
        jbCompras.setFocusable(false);
        jbCompras.setRequestFocusEnabled(false);
        jbCompras.setVerifyInputWhenFocusTarget(false);
        jbCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprasActionPerformed(evt);
            }
        });
        jPanel3.add(jbCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 260, 680));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 960, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuCompras menuCom = new MenuCompras();
        menuCom.setVisible(true);
        escritorio.add(menuCom);
        jlTitulo.setText("Menú compras");
    }//GEN-LAST:event_jbComprasActionPerformed

    private void jbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProveedoresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuProveedor menuProv = new MenuProveedor();
        menuProv.setVisible(true);
        escritorio.add(menuProv);
        jlTitulo.setText("Menú proveedores");
    }//GEN-LAST:event_jbProveedoresActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuProductos menuProd = new MenuProductos();
        menuProd.setVisible(true);
        escritorio.add(menuProd);
        jlTitulo.setText("Menú productos");
    }//GEN-LAST:event_jbProductosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCompras;
    private javax.swing.JButton jbHistorial;
    private javax.swing.JButton jbListar;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbProveedores;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables
}

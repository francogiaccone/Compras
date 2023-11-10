package compras.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jbProductos = new javax.swing.JButton();
        jbCompras = new javax.swing.JButton();
        jbProveedores = new javax.swing.JButton();
        jbCompras1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProveMax");
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jbProductos.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carretilla.png"))); // NOI18N
        jbProductos.setText("PRODUCTOS");
        jbProductos.setFocusPainted(false);
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });

        jbCompras.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        jbCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar.png"))); // NOI18N
        jbCompras.setText("LISTAR");
        jbCompras.setFocusPainted(false);

        jbProveedores.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        jbProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        jbProveedores.setText("PROVEEDORES");
        jbProveedores.setFocusPainted(false);
        jbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProveedoresActionPerformed(evt);
            }
        });

        jbCompras1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        jbCompras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compras.png"))); // NOI18N
        jbCompras1.setText("COMPRAS");
        jbCompras1.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbProveedores)
                .addGap(34, 34, 34)
                .addComponent(jbCompras1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCompras1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuProductos menuProd = new MenuProductos();
        menuProd.setVisible(true);
        escritorio.add(menuProd);
    }//GEN-LAST:event_jbProductosActionPerformed

    private void jbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProveedoresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuProveedor menuProv = new MenuProveedor();
        menuProv.setVisible(true);
        escritorio.add(menuProv);
    }//GEN-LAST:event_jbProveedoresActionPerformed

    public void cambiarEscritorio(javax.swing.JInternalFrame ji) {
        escritorio.removeAll();
        escritorio.repaint();
        ji.setVisible(true);
        escritorio.add(ji);
    }
    
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jbCompras;
    private javax.swing.JButton jbCompras1;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbProveedores;
    // End of variables declaration//GEN-END:variables
}

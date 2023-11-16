package compras.vistas;

import compras.accesoADatos.CompraData;
import compras.accesoADatos.ProductoData;
import compras.entidades.Compra;
import compras.entidades.Historial;
import compras.entidades.Producto;
import static compras.vistas.MenuHistorial.historial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ProductosListarPorCompras extends javax.swing.JInternalFrame {
    
    ProductoData prodData;
    CompraData comData;
    DefaultTableModel modelo;
    
    public ProductosListarPorCompras() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        prodData = new ProductoData();
        comData = new CompraData();
        
        modelo = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        
        cargarCombo();
        armarCabecera();
        
        Historial nuevoHistorial = new Historial("Listar productos por compras", LocalDateTime.now());
        historial.add(nuevoHistorial);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        jcbCompras = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        jLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel.setText("Listar por compra");

        jcbCompras.setModel(new javax.swing.DefaultComboBoxModel<>(new Compra[] {}));
        jcbCompras.setSelectedIndex(-1);
        jcbCompras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbComprasItemStateChanged(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jcbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jcbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbComprasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbComprasItemStateChanged
        try {
            Compra compra = (Compra) jcbCompras.getSelectedItem();
            int idCompra = compra.getIdCompra();
            
            ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductosPorCompra(idCompra);
            
            modelo.setRowCount(0);
            for (Producto prod : productos) {
                modelo.addRow(new Object[] {prod.getIdProducto(), prod.getNombre(), prod.getDescripcion(), prod.getPrecioActual(), prod.getStock(), prod.isEstado() ? "Activo" : "Eliminado"});
            }
            
        } catch (NullPointerException ex) {
            modelo.setRowCount(0);
        }
    }//GEN-LAST:event_jcbComprasItemStateChanged

    private void cargarCombo() {
        ArrayList<Compra> compras = (ArrayList<Compra>) comData.listarCompras();

        for (Compra com : compras) {
            jcbCompras.addItem(com);
        }
        
        jcbCompras.setSelectedIndex(-1);
    }
    
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Estado");
        
        jtTabla.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Compra> jcbCompras;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

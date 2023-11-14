package compras.vistas;

import compras.accesoADatos.ProductoData;
import compras.accesoADatos.ProveedorData;
import compras.entidades.Historial;
import compras.entidades.Producto;
import compras.entidades.Proveedor;
import static compras.vistas.MenuHistorial.historial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ProveedoresListarPorProducto extends javax.swing.JInternalFrame {
    
    ProveedorData provData;
    ProductoData prodData;
    DefaultTableModel modelo;
    
    public ProveedoresListarPorProducto() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        provData = new ProveedorData();
        prodData = new ProductoData();
        
        modelo = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        
        armarCabecera();
        cargarCombo();
        
        Historial nuevoHistorial = new Historial("Listar proveedores por producto", LocalDateTime.now());
        historial.add(nuevoHistorial);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        jLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel.setText("Listar por producto");

        jcbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new Producto[] {}));
        jcbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProductosItemStateChanged(evt);
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

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel)
                .addGap(57, 57, 57)
                .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProductosItemStateChanged
        try {
            Producto productoSeleccionado = (Producto) jcbProductos.getSelectedItem();
            int idProducto = productoSeleccionado.getIdProducto();
            
            ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) provData.listarProveedoresPorProducto(idProducto);
            
            modelo.setRowCount(0);
            for (Proveedor prov : proveedores) {
                modelo.addRow(new Object[] {prov.getIdProveedor(), prov.getRazonSocial(), prov.getDomicilio(), prov.getTelefono()});
            }
            
        } catch (NullPointerException ex) {
            modelo.setRowCount(0);
        }
    }//GEN-LAST:event_jcbProductosItemStateChanged

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Razón Social");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Teléfono");
        
        jtTabla.setModel(modelo);
    }
    
    private void cargarCombo() {
        ArrayList<Producto> productos = (ArrayList<Producto>) prodData.listarProductos();

        for (Producto prod : productos) {
            jcbProductos.addItem(prod);
        }
        
        jcbProductos.setSelectedIndex(-1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

package compras.vistas;

import compras.accesoADatos.DetalleCompraData;
import compras.accesoADatos.ProveedorData;
import compras.entidades.DetalleCompra;
import compras.entidades.Historial;
import compras.entidades.Proveedor;
import static compras.vistas.MenuHistorial.historial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ComprasListarPorProveedores extends javax.swing.JInternalFrame {
    
    DetalleCompraData detData;
    ProveedorData provData;
    DefaultTableModel modelo;
    
    public ComprasListarPorProveedores() {
        initComponents();
        
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) this.getUI();
        internalFrameUI.setNorthPane(null);
        this.setResizable(false);
        
        detData = new DetalleCompraData();
        provData = new ProveedorData();
        
        modelo = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        
        armarCabecera();
        cargarCombo();
        
        Historial nuevoHistorial = new Historial("Listar compras por proveedor", LocalDateTime.now());
        historial.add(nuevoHistorial);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        fondo = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jcbProveedores = new javax.swing.JComboBox<>();

        jLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel.setText("Listar por proveedor");

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

        jcbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new Proveedor[] { }));
        jcbProveedores.setSelectedIndex(-1);
        jcbProveedores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProveedoresItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel)
                .addGap(46, 46, 46)
                .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void jcbProveedoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProveedoresItemStateChanged
        try {
            Proveedor proveedorSeleccionado = (Proveedor) jcbProveedores.getSelectedItem();
            int idProveedor = proveedorSeleccionado.getIdProveedor();
            
            ArrayList<DetalleCompra> detalles = (ArrayList<DetalleCompra>) detData.listarDetalleCompraPorProveedor(idProveedor);
            
            modelo.setRowCount(0);
            for (DetalleCompra detalle : detalles) {
                modelo.addRow(new Object[] {detalle.getIdDetalle(), detalle.getProducto().getNombre(), detalle.getCantidad(), detalle.getPrecioCosto(), detalle.getCompra().getFecha()});
            }
            
        } catch (NullPointerException ex) {
            modelo.setRowCount(0);
        }
    }//GEN-LAST:event_jcbProveedoresItemStateChanged
    
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Fecha");
        
        jtTabla.setModel(modelo);
    }
    
    private void cargarCombo() {
        ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) provData.listarProveedores();
        
        for (Proveedor proveedor : proveedores) {
            jcbProveedores.addItem(proveedor);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Proveedor> jcbProveedores;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

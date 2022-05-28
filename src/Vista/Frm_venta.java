/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author Claudia
 */
public class Frm_venta extends javax.swing.JFrame {

    public Frm_venta() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/icono_gym.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbStockPantallaVenta = new Vista.ColorCeldaProductoVentas();
        lbGananciaTotalVenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscadorProductosVentas = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tlbCarrito = new javax.swing.JTable();
        lbSalirVenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadProductosVentas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbTipoDeBusqueda = new javax.swing.JComboBox<>();
        lbTotal = new javax.swing.JLabel();
        lbSalirVenta1 = new javax.swing.JLabel();
        lbLimpiarCarrito = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbVenderProductos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbEliminarProductoCarrito = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbAgregarProductoAlCarrito = new javax.swing.JLabel();
        lbIdStockVenta = new javax.swing.JLabel();
        lbIdCarritoVentas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tlbStockPantallaVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tlbStockPantallaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Codigo", "Nombre", "Costo", "Venta", "Cantidad"
            }
        ));
        tlbStockPantallaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbStockPantallaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlbStockPantallaVenta);

        lbGananciaTotalVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGananciaTotalVenta.setForeground(new java.awt.Color(0, 0, 0));
        lbGananciaTotalVenta.setText("GANANCIA:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BUSCADOR:");

        txtBuscadorProductosVentas.setBackground(new java.awt.Color(255, 255, 255));

        tlbCarrito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tlbCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Costo", "Venta", "Total"
            }
        ));
        tlbCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbCarritoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tlbCarrito);

        lbSalirVenta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirVenta.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirVenta.setText("x");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CANTIDAD:");

        txtCantidadProductosVentas.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidadProductosVentas.setText("1");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TIPO DE BUSQUEDA");

        jcbTipoDeBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        jcbTipoDeBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        jcbTipoDeBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre Producto", "Codigo de Barra (aparato)", "Codigo de Barra (manual)" }));

        lbTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(0, 0, 0));
        lbTotal.setText("TOTAL:");

        lbSalirVenta1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirVenta1.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirVenta1.setText("VENTAS");

        lbLimpiarCarrito.setForeground(new java.awt.Color(0, 0, 0));
        lbLimpiarCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLimpiarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbLimpiarCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbLimpiarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbVenderProductos.setForeground(new java.awt.Color(0, 0, 0));
        lbVenderProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVenderProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        lbVenderProductos.setText("VENDER");
        lbVenderProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbVenderProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbVenderProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEliminarProductoCarrito.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarProductoCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarProductoCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarProductoCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEliminarProductoCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEliminarProductoCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbAgregarProductoAlCarrito.setForeground(new java.awt.Color(0, 0, 0));
        lbAgregarProductoAlCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgregarProductoAlCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        lbAgregarProductoAlCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAgregarProductoAlCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAgregarProductoAlCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        lbIdStockVenta.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lbIdStockVenta.setForeground(new java.awt.Color(204, 0, 51));
        lbIdStockVenta.setText("stock");

        lbIdCarritoVentas.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lbIdCarritoVentas.setForeground(new java.awt.Color(0, 0, 102));
        lbIdCarritoVentas.setText("carrito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSalirVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSalirVenta1)
                        .addGap(84, 84, 84)
                        .addComponent(lbIdStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIdCarritoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbLimpiarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbGananciaTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscadorProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbTipoDeBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIdCarritoVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbSalirVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSalirVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lbIdStockVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidadProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtBuscadorProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbTipoDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbLimpiarCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbGananciaTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(134, 134, 134))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tlbCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbCarritoMouseClicked

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            Conexion conn = new Conexion();

            Connection con = conn.getConexion();

            int Fila = tlbCarrito.getSelectedRow();
            String codigo = tlbCarrito.getValueAt(Fila, 0).toString();

            String sql = "SELECT Codigo FROM producto WHERE Codigo=?";

            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                lbIdCarritoVentas.setText(rs.getString("Codigo"));

            }

        } catch (SQLException e) {

            System.out.println(e);

        }

    }//GEN-LAST:event_tlbCarritoMouseClicked

    private void tlbStockPantallaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbStockPantallaVentaMouseClicked

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            Conexion conn = new Conexion();

            Connection con = conn.getConexion();

            int Fila = tlbStockPantallaVenta.getSelectedRow();
            String codigo = tlbStockPantallaVenta.getValueAt(Fila, 1).toString();

            String sql = "SELECT Codigo FROM producto WHERE Codigo=?";

            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                lbIdStockVenta.setText(rs.getString("Codigo"));

            }

        } catch (SQLException e) {

            System.out.println(e);

        }


    }//GEN-LAST:event_tlbStockPantallaVentaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> jcbTipoDeBusqueda;
    public javax.swing.JLabel lbAgregarProductoAlCarrito;
    public javax.swing.JLabel lbEliminarProductoCarrito;
    public javax.swing.JLabel lbGananciaTotalVenta;
    public javax.swing.JLabel lbIdCarritoVentas;
    public javax.swing.JLabel lbIdStockVenta;
    public javax.swing.JLabel lbLimpiarCarrito;
    public javax.swing.JLabel lbSalirVenta;
    public javax.swing.JLabel lbSalirVenta1;
    public javax.swing.JLabel lbTotal;
    public javax.swing.JLabel lbVenderProductos;
    public javax.swing.JTable tlbCarrito;
    public javax.swing.JTable tlbStockPantallaVenta;
    public javax.swing.JTextField txtBuscadorProductosVentas;
    public javax.swing.JTextField txtCantidadProductosVentas;
    // End of variables declaration//GEN-END:variables
}

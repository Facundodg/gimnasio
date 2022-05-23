package Vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Frm_usuario_info extends javax.swing.JFrame {

    public Frm_usuario_info() {
        initComponents();
        this.setLocationRelativeTo(null);

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/Sol_modoNocturno.png")); //pones la ruta de la imagen
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        jrbModoNocturno.setIcon(fondo1);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/img/mute.png")); //pones la ruta de la imagen
        Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        jrbSonido.setIcon(fondo2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbPuestoInfo = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbSalirCuentaUsuarioInfo = new javax.swing.JLabel();
        lbBorrarCuenta = new javax.swing.JLabel();
        lbSalirUsuarioInfo = new javax.swing.JLabel();
        jcbTamañoFuenteTabla = new javax.swing.JComboBox<>();
        jrbSonido = new javax.swing.JRadioButton();
        jrbModoNocturno = new javax.swing.JRadioButton();
        lbPuestoInfo1 = new javax.swing.JLabel();
        lbCambiar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNombreUsuarioInfo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        lbPuestoInfo2 = new javax.swing.JLabel();
        lbFotoInfoUsuario = new com.bolivia.label.CLabel();
        lbSalirVenta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 60, 20));

        lbPuestoInfo.setForeground(new java.awt.Color(0, 0, 0));
        lbPuestoInfo.setText("PUEST");
        jPanel1.add(lbPuestoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 60, -1));

        lbId.setForeground(new java.awt.Color(0, 0, 0));
        lbId.setText("id");
        jPanel1.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 40, 30));

        lbSalirCuentaUsuarioInfo.setForeground(new java.awt.Color(0, 0, 255));
        lbSalirCuentaUsuarioInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalirCuentaUsuarioInfo.setText("SALIR CUENTA");
        lbSalirCuentaUsuarioInfo.setToolTipText("Salir de la cuenta.");
        lbSalirCuentaUsuarioInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbSalirCuentaUsuarioInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSalirCuentaUsuarioInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSalirCuentaUsuarioInfoMouseExited(evt);
            }
        });
        jPanel1.add(lbSalirCuentaUsuarioInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 130, 30));

        lbBorrarCuenta.setForeground(new java.awt.Color(0, 0, 255));
        lbBorrarCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBorrarCuenta.setText("BORRAR CUENTA");
        lbBorrarCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbBorrarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBorrarCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbBorrarCuentaMouseExited(evt);
            }
        });
        jPanel1.add(lbBorrarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 30));

        lbSalirUsuarioInfo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirUsuarioInfo.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirUsuarioInfo.setText("x");
        jPanel1.add(lbSalirUsuarioInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, 18));

        jcbTamañoFuenteTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Mediana", "Chica" }));
        jcbTamañoFuenteTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTamañoFuenteTablaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbTamañoFuenteTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 130, -1));

        jrbSonido.setBackground(new java.awt.Color(204, 204, 255));
        jrbSonido.setForeground(new java.awt.Color(0, 0, 0));
        jrbSonido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbSonido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jrbSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 50, 50));

        jrbModoNocturno.setBackground(new java.awt.Color(204, 204, 255));
        jrbModoNocturno.setForeground(new java.awt.Color(0, 0, 0));
        jrbModoNocturno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbModoNocturno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jrbModoNocturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 50, 50));

        lbPuestoInfo1.setForeground(new java.awt.Color(0, 0, 0));
        lbPuestoInfo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPuestoInfo1.setText("TAMAÑO DE FUENTE DE LA TABLA");
        jPanel1.add(lbPuestoInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 200, 30));

        lbCambiar.setForeground(new java.awt.Color(0, 0, 255));
        lbCambiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCambiar.setText("CAMBIAR ");
        lbCambiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCambiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCambiarMouseExited(evt);
            }
        });
        jPanel1.add(lbCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 30));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PUESTO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 60, -1));

        lbNombreUsuarioInfo.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreUsuarioInfo.setText("NAME");
        jPanel1.add(lbNombreUsuarioInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 90, 20));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 20, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Ingles" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 130, -1));

        lbPuestoInfo2.setForeground(new java.awt.Color(0, 0, 0));
        lbPuestoInfo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuestoInfo2.setText("IDIOMA");
        jPanel1.add(lbPuestoInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 60, 30));

        lbFotoInfoUsuario.setText("");
        jPanel1.add(lbFotoInfoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lbSalirVenta1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirVenta1.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirVenta1.setText("USAURIO");
        jPanel1.add(lbSalirVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTamañoFuenteTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTamañoFuenteTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTamañoFuenteTablaActionPerformed

    private void lbCambiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCambiarMouseEntered
        
        lbCambiar.setForeground(Color.red);
        
    }//GEN-LAST:event_lbCambiarMouseEntered

    private void lbSalirCuentaUsuarioInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirCuentaUsuarioInfoMouseEntered
       
        lbSalirCuentaUsuarioInfo.setForeground(Color.red);
        
        
    }//GEN-LAST:event_lbSalirCuentaUsuarioInfoMouseEntered

    private void lbBorrarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBorrarCuentaMouseEntered


        lbBorrarCuenta.setForeground(Color.red);

    }//GEN-LAST:event_lbBorrarCuentaMouseEntered

    private void lbCambiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCambiarMouseExited
       
        
        lbCambiar.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_lbCambiarMouseExited

    private void lbSalirCuentaUsuarioInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirCuentaUsuarioInfoMouseExited


        lbSalirCuentaUsuarioInfo.setForeground(Color.BLUE);

    }//GEN-LAST:event_lbSalirCuentaUsuarioInfoMouseExited

    private void lbBorrarCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBorrarCuentaMouseExited


        lbBorrarCuenta.setForeground(Color.BLUE);

    }//GEN-LAST:event_lbBorrarCuentaMouseExited

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_usuario_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_usuario_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_usuario_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_usuario_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_usuario_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> jcbTamañoFuenteTabla;
    public javax.swing.JRadioButton jrbModoNocturno;
    public javax.swing.JRadioButton jrbSonido;
    public javax.swing.JLabel lbBorrarCuenta;
    public javax.swing.JLabel lbCambiar;
    public com.bolivia.label.CLabel lbFotoInfoUsuario;
    public javax.swing.JLabel lbId;
    public javax.swing.JLabel lbNombreUsuarioInfo;
    public javax.swing.JLabel lbPuestoInfo;
    public javax.swing.JLabel lbPuestoInfo1;
    public javax.swing.JLabel lbPuestoInfo2;
    public javax.swing.JLabel lbSalirCuentaUsuarioInfo;
    public javax.swing.JLabel lbSalirUsuarioInfo;
    public javax.swing.JLabel lbSalirVenta1;
    // End of variables declaration//GEN-END:variables
}

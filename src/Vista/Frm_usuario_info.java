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
        lbFotoInfoUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPuestoInfo = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbSalirCuentaUsuarioInfo = new javax.swing.JLabel();
        lbBorrarCuenta = new javax.swing.JLabel();
        lbSalirUsuarioInfo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jrbSonido = new javax.swing.JRadioButton();
        jrbModoNocturno = new javax.swing.JRadioButton();
        lbPuestoInfo1 = new javax.swing.JLabel();
        lbCambiar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNombreUsuarioInfo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbCambiarIdioma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFotoInfoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoInfoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lbFotoInfoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 68, 70));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 41, 60, 20));

        lbPuestoInfo.setForeground(new java.awt.Color(0, 0, 0));
        lbPuestoInfo.setText("PUEST");
        jPanel1.add(lbPuestoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, -1));

        lbId.setForeground(new java.awt.Color(0, 0, 0));
        lbId.setText("id");
        jPanel1.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, 30));

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
        jPanel1.add(lbSalirCuentaUsuarioInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, 30));

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
        jPanel1.add(lbBorrarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 130, 30));

        lbSalirUsuarioInfo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirUsuarioInfo.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirUsuarioInfo.setText("x");
        jPanel1.add(lbSalirUsuarioInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, 18));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Ingles" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 90, -1));

        jrbSonido.setBackground(new java.awt.Color(204, 204, 255));
        jrbSonido.setForeground(new java.awt.Color(0, 0, 0));
        jrbSonido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbSonido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jrbSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 50, 50));

        jrbModoNocturno.setBackground(new java.awt.Color(204, 204, 255));
        jrbModoNocturno.setForeground(new java.awt.Color(0, 0, 0));
        jrbModoNocturno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbModoNocturno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jrbModoNocturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 50, 50));

        lbPuestoInfo1.setForeground(new java.awt.Color(0, 0, 0));
        lbPuestoInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuestoInfo1.setText("IDIOMA:");
        jPanel1.add(lbPuestoInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 60, 20));

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
        jPanel1.add(lbCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 30));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PUESTO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 60, -1));

        lbNombreUsuarioInfo.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreUsuarioInfo.setText("NAME");
        jPanel1.add(lbNombreUsuarioInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 90, 20));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 20, 30));

        lbCambiarIdioma.setForeground(new java.awt.Color(0, 0, 255));
        lbCambiarIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCambiarIdioma.setText("CAMBIAR IDIOMA");
        lbCambiarIdioma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbCambiarIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCambiarIdiomaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCambiarIdiomaMouseExited(evt);
            }
        });
        jPanel1.add(lbCambiarIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void lbCambiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCambiarMouseEntered
        
        lbCambiar.setForeground(Color.red);
        
    }//GEN-LAST:event_lbCambiarMouseEntered

    private void lbCambiarIdiomaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCambiarIdiomaMouseEntered
       
        
        lbCambiarIdioma.setForeground(Color.red);
        
    }//GEN-LAST:event_lbCambiarIdiomaMouseEntered

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

    private void lbCambiarIdiomaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCambiarIdiomaMouseExited

        lbCambiarIdioma.setForeground(Color.BLUE);

    }//GEN-LAST:event_lbCambiarIdiomaMouseExited

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JRadioButton jrbModoNocturno;
    public javax.swing.JRadioButton jrbSonido;
    public javax.swing.JLabel lbBorrarCuenta;
    public javax.swing.JLabel lbCambiar;
    public javax.swing.JLabel lbCambiarIdioma;
    public javax.swing.JLabel lbFotoInfoUsuario;
    public javax.swing.JLabel lbId;
    public javax.swing.JLabel lbNombreUsuarioInfo;
    public javax.swing.JLabel lbPuestoInfo;
    public javax.swing.JLabel lbPuestoInfo1;
    public javax.swing.JLabel lbSalirCuentaUsuarioInfo;
    public javax.swing.JLabel lbSalirUsuarioInfo;
    // End of variables declaration//GEN-END:variables
}

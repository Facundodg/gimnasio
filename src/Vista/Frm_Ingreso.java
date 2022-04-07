/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author Claudia
 */
public class Frm_Ingreso extends javax.swing.JFrame {

    private boolean estado = true;

    public Frm_Ingreso() {

        initComponents();
        this.setLocationRelativeTo(null);

        //---------GIF DE CORRER--------------
        ImageIcon gif = new ImageIcon(getClass().getResource("/img/candado.png")); //pones la ruta de la imagen
        Icon fondo = new ImageIcon(gif.getImage().getScaledInstance(lbCandado.getWidth(), lbCandado.getHeight(), Image.SCALE_DEFAULT));
        lbCandado.setIcon(fondo);
        this.repaint();

        setIconImage(new ImageIcon(getClass().getResource("../img/icono_gym.png")).getImage());

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpIngresoUsuario = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new java.awt.Button();
        lbCandado = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnRegistroIngreso = new java.awt.Button();
        jsContraseña = new javax.swing.JSeparator();
        jsUsuario = new javax.swing.JSeparator();
        lbSalirSistemaIngreso = new javax.swing.JLabel();
        lbMinimizarVentana = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbUsuario1 = new javax.swing.JLabel();
        lbUsuario2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jpIngresoUsuario.setBackground(new java.awt.Color(102, 102, 255));
        jpIngresoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpIngresoUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario.setText("USUARIO");
        jpIngresoUsuario.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 210, -1, -1));

        lbContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseña.setText("CONTRASEÑA");
        jpIngresoUsuario.add(lbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 282, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(102, 102, 255));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
        jpIngresoUsuario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 230, 237, 17));

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIngresar.setLabel("INGRESAR");
        jpIngresoUsuario.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 343, 120, 43));
        btnIngresar.getAccessibleContext().setAccessibleName("INGRESAR");

        jpIngresoUsuario.add(lbCandado, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 49, 128, 128));

        txtContraseña.setBackground(new java.awt.Color(102, 102, 255));
        txtContraseña.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setBorder(null);
        jpIngresoUsuario.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 305, 236, 17));

        btnRegistroIngreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistroIngreso.setLabel("REGISTRARME");
        jpIngresoUsuario.add(btnRegistroIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 343, 124, 43));
        btnRegistroIngreso.getAccessibleContext().setAccessibleName("REGISTRARME");

        jsContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jsContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jpIngresoUsuario.add(jsContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 323, 245, 10));

        jsUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jsUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jpIngresoUsuario.add(jsUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 250, 245, 10));

        lbSalirSistemaIngreso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirSistemaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirSistemaIngreso.setText("x");
        jpIngresoUsuario.add(lbSalirSistemaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, 17, -1));

        lbMinimizarVentana.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbMinimizarVentana.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimizarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimizarVentana.setText("-");
        lbMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarVentanaMouseClicked(evt);
            }
        });
        jpIngresoUsuario.add(lbMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 2, -1, 32));
        jpIngresoUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 499, 12, -1));

        lbUsuario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jpIngresoUsuario.add(lbUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 216, -1, -1));

        lbUsuario2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key.png"))); // NOI18N
        jpIngresoUsuario.add(lbUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 290, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpIngresoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpIngresoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarVentanaMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lbMinimizarVentanaMouseClicked

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
            java.util.logging.Logger.getLogger(Frm_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Button btnIngresar;
    public java.awt.Button btnRegistroIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jpIngresoUsuario;
    public javax.swing.JSeparator jsContraseña;
    public javax.swing.JSeparator jsUsuario;
    private javax.swing.JLabel lbCandado;
    private javax.swing.JLabel lbContraseña;
    public javax.swing.JLabel lbMinimizarVentana;
    public javax.swing.JLabel lbSalirSistemaIngreso;
    public javax.swing.JLabel lbUsuario;
    public javax.swing.JLabel lbUsuario1;
    public javax.swing.JLabel lbUsuario2;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

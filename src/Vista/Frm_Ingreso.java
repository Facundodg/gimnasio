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

        lbUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario.setText("USUARIO");

        lbContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseña.setText("CONTRASEÑA");

        txtUsuario.setBackground(new java.awt.Color(102, 102, 255));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIngresar.setLabel("INGRESAR");

        txtContraseña.setBackground(new java.awt.Color(102, 102, 255));
        txtContraseña.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setBorder(null);

        btnRegistroIngreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistroIngreso.setLabel("REGISTRARME");

        jsContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jsContraseña.setForeground(new java.awt.Color(0, 0, 0));

        jsUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jsUsuario.setForeground(new java.awt.Color(0, 0, 0));

        lbSalirSistemaIngreso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirSistemaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirSistemaIngreso.setText("x");

        lbMinimizarVentana.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbMinimizarVentana.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimizarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimizarVentana.setText("-");
        lbMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarVentanaMouseClicked(evt);
            }
        });

        lbUsuario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        lbUsuario2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key.png"))); // NOI18N

        javax.swing.GroupLayout jpIngresoUsuarioLayout = new javax.swing.GroupLayout(jpIngresoUsuario);
        jpIngresoUsuario.setLayout(jpIngresoUsuarioLayout);
        jpIngresoUsuarioLayout.setHorizontalGroup(
            jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIngresoUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIngresoUsuarioLayout.createSequentialGroup()
                                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbUsuario1)
                                    .addComponent(lbUsuario2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUsuario)
                                    .addComponent(lbContraseña)
                                    .addComponent(jsUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnRegistroIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))))
            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lbCandado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbSalirSistemaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMinimizarVentana)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpIngresoUsuarioLayout.setVerticalGroup(
            jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbMinimizarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbSalirSistemaIngreso))
                .addGap(15, 15, 15)
                .addComponent(lbCandado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addComponent(lbUsuario)
                        .addGap(3, 3, 3)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jsUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(lbContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addComponent(lbUsuario1)
                        .addGap(42, 42, 42)
                        .addComponent(lbUsuario2)))
                .addGap(1, 1, 1)
                .addComponent(jsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
    public javax.swing.JLabel lbContraseña;
    public javax.swing.JLabel lbMinimizarVentana;
    public javax.swing.JLabel lbSalirSistemaIngreso;
    public javax.swing.JLabel lbUsuario;
    public javax.swing.JLabel lbUsuario1;
    public javax.swing.JLabel lbUsuario2;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

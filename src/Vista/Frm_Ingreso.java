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
        ImageIcon gif = new ImageIcon(getClass().getResource("/img/Gif_correr_ingreso.gif")); //pones la ruta de la imagen
        Icon fondo = new ImageIcon(gif.getImage().getScaledInstance(lbGif_frm_ingreso.getWidth(), lbGif_frm_ingreso.getHeight(), Image.SCALE_DEFAULT));
        lbGif_frm_ingreso.setIcon(fondo);
        this.repaint();

        setIconImage(new ImageIcon(getClass().getResource("../img/icono_gym.png")).getImage());

    }

    public static void left(JComponent componente, int milisegundos, int saltos, int pares) {

        (new Thread() {

            @Override
            public void run() {
                
                System.out.println("corriendo");
                for (int i = componente.getWidth(); i >= pares; i -= saltos) {
                    try {
                        Thread.sleep(milisegundos);
                        componente.setPreferredSize(new Dimension(i, componente.getHeight()));
                        SwingUtilities.updateComponentTreeUI(componente);

                    } catch (Exception e) {

                        System.out.println(e);

                    }
                }
            }

        }).start();

    }

    public static void right(JComponent componente, int milisegundos, int saltos, int pares) {

        (new Thread() {

            @Override
            public void run() {
                for (int i = componente.getWidth(); i <= pares; i += saltos) {
                    try {
                        Thread.sleep(milisegundos);
                        componente.setPreferredSize(new Dimension(i, componente.getHeight()));
                        SwingUtilities.updateComponentTreeUI(componente);

                    } catch (Exception e) {

                        System.out.println(e);

                    }
                }
            }

        }).start();

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
        lbGif_frm_ingreso = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnRegistroIngreso = new java.awt.Button();
        jsContraseña = new javax.swing.JSeparator();
        jsUsuario = new javax.swing.JSeparator();
        lbSalirSistemaIngreso = new javax.swing.JLabel();
        lbMinimizarVentana = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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
        jpIngresoUsuario.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        lbContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseña.setText("CONTRASEÑA");
        jpIngresoUsuario.add(lbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(102, 102, 255));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario.setBorder(null);
        jpIngresoUsuario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 264, 17));

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIngresar.setLabel("Ingresar");
        jpIngresoUsuario.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 120, 43));
        jpIngresoUsuario.add(lbGif_frm_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 145, 214));

        txtContraseña.setBackground(new java.awt.Color(102, 102, 255));
        txtContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtContraseña.setBorder(null);
        jpIngresoUsuario.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 264, 17));

        btnRegistroIngreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistroIngreso.setLabel("Registrarse");
        jpIngresoUsuario.add(btnRegistroIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 124, 43));

        jsContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jsContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jpIngresoUsuario.add(jsContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 264, 10));

        jsUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jsUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jpIngresoUsuario.add(jsUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 264, 10));

        lbSalirSistemaIngreso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirSistemaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirSistemaIngreso.setText("x");
        jpIngresoUsuario.add(lbSalirSistemaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 2, 17, -1));

        lbMinimizarVentana.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbMinimizarVentana.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimizarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimizarVentana.setText("-");
        lbMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarVentanaMouseClicked(evt);
            }
        });
        jpIngresoUsuario.add(lbMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 2, -1, 32));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        jpIngresoUsuario.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 470, 380));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<--");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jpIngresoUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 30, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-->");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jpIngresoUsuario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpIngresoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpIngresoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarVentanaMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lbMinimizarVentanaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        if (estado) {
            
            right(jPanel3, 1, 2, 470);
            estado = false;
            
        } else {
            
            left(jPanel3, 1, 2, 100);
            estado = true;

        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jpIngresoUsuario;
    public javax.swing.JSeparator jsContraseña;
    public javax.swing.JSeparator jsUsuario;
    public javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbGif_frm_ingreso;
    public javax.swing.JLabel lbMinimizarVentana;
    public javax.swing.JLabel lbSalirSistemaIngreso;
    public javax.swing.JLabel lbUsuario;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

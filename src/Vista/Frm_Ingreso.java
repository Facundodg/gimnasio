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
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario.setBorder(null);

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIngresar.setLabel("Ingresar");

        txtContraseña.setBackground(new java.awt.Color(102, 102, 255));
        txtContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtContraseña.setBorder(null);

        btnRegistroIngreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistroIngreso.setLabel("Registrarse");

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-->");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("-MEJORA DE INTERFAZ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 380, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("-ACOMODO DE LA INTERFAZ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 380, 20));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ACTUALIZACIONES");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("-MANTENIMINTO DE LA BD");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 380, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("-INGRESO DE EVENTOS DE BOTON (GUARDAR,ELIMINAR,MODIFICAR) EN TIENDA");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 380, 20));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("-INGRESO DE FILTROS DE LA PARTE DE TIENDAS");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 20));

        javax.swing.GroupLayout jpIngresoUsuarioLayout = new javax.swing.GroupLayout(jpIngresoUsuario);
        jpIngresoUsuario.setLayout(jpIngresoUsuarioLayout);
        jpIngresoUsuarioLayout.setHorizontalGroup(
            jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbSalirSistemaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbMinimizarVentana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbGif_frm_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnRegistroIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jpIngresoUsuarioLayout.setVerticalGroup(
            jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSalirSistemaIngreso)
                            .addComponent(lbMinimizarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIngresoUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                                .addComponent(lbGif_frm_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lbUsuario)
                                .addGap(3, 3, 3)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jsUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbContraseña)
                                .addGap(13, 13, 13)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jpIngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistroIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpIngresoUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)))
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
            .addComponent(jpIngresoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarVentanaMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lbMinimizarVentanaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        if (estado) {
            
            right(jPanel3, 1, 2, 385);
            estado = false;
            jLabel2.setText("<--");
            
        } else {
            
            left(jPanel3, 1, 2, 100);
            estado = true;
            jLabel2.setText("-->");

        }

    }//GEN-LAST:event_jLabel2MouseClicked

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
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

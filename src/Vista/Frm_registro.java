package Vista;

import java.awt.Component;
import java.awt.Image;
import java.awt.PopupMenu;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Frm_registro extends javax.swing.JFrame {

    public Frm_registro() {

        initComponents();
        this.setLocationRelativeTo(null);

        ImageIcon logo = new ImageIcon(getClass().getResource("/img/blanco.png")); //pones la ruta de la imagen
        Icon fondo1 = new ImageIcon(logo.getImage().getScaledInstance(lbUsuarioImagen.getWidth(), lbUsuarioImagen.getHeight(), Image.SCALE_DEFAULT));
        lbUsuarioImagen.setIcon(fondo1);
        this.repaint();
        setIconImage(new ImageIcon(getClass().getResource("../img/icono_gym.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpRegistro = new javax.swing.JPanel();
        lbNombreUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        lbConfirmarContraseña = new javax.swing.JLabel();
        lbPuesto = new javax.swing.JLabel();
        txtNombreUsuarioRegistrar = new javax.swing.JTextField();
        ContraseñaUsuarioRegistrar = new javax.swing.JTextField();
        txtContraseñaConfirmarRegistrar = new javax.swing.JTextField();
        jcbPuestoRegistro = new javax.swing.JComboBox<>();
        btnRegistrarUsuario = new java.awt.Button();
        lbContraseñaPuesto = new javax.swing.JLabel();
        txtContraseñaPuestoRegistrar = new javax.swing.JTextField();
        btnCargarImagenUsuario = new java.awt.Button();
        btnAtras = new java.awt.Button();
        btnSalirRegistrarUsuario = new java.awt.Button();
        btnSalirRegistrarUsuario1 = new java.awt.Button();
        lbUsuarioImagen = new javax.swing.JLabel();
        lbSalirSistemaRegistro = new javax.swing.JLabel();
        lbMinimizarRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jpRegistro.setBackground(new java.awt.Color(102, 102, 255));

        lbNombreUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreUsuario.setText("Nombre Usuario");

        lbContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseña.setText("Contraseña");

        lbConfirmarContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbConfirmarContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbConfirmarContraseña.setText("Confirmar Contraseña");

        lbPuesto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPuesto.setForeground(new java.awt.Color(0, 0, 0));
        lbPuesto.setText("Puesto");

        jcbPuestoRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Nutricionista" }));

        btnRegistrarUsuario.setEnabled(false);
        btnRegistrarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarUsuario.setLabel("Registrar");

        lbContraseñaPuesto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbContraseñaPuesto.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseñaPuesto.setText("Contraseña de Puesto");

        btnCargarImagenUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargarImagenUsuario.setLabel("Cargar Imagen");

        btnAtras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAtras.setLabel("Atras");

        btnSalirRegistrarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalirRegistrarUsuario.setLabel("Salir");

        btnSalirRegistrarUsuario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalirRegistrarUsuario1.setLabel("Ayuda");

        lbUsuarioImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbSalirSistemaRegistro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirSistemaRegistro.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirSistemaRegistro.setText("x");

        lbMinimizarRegistro.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbMinimizarRegistro.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimizarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimizarRegistro.setText("-");
        lbMinimizarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalirRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalirRegistrarUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbConfirmarContraseña)
                                    .addComponent(lbPuesto)
                                    .addComponent(lbContraseñaPuesto)
                                    .addComponent(lbContraseña)
                                    .addComponent(lbNombreUsuario))
                                .addGap(24, 24, 24)
                                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbPuestoRegistro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtContraseñaConfirmarRegistrar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContraseñaUsuarioRegistrar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreUsuarioRegistrar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContraseñaPuestoRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCargarImagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbUsuarioImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addComponent(lbSalirSistemaRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbMinimizarRegistro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalirSistemaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMinimizarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombreUsuario)
                            .addComponent(txtNombreUsuarioRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContraseña)
                            .addComponent(ContraseñaUsuarioRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseñaConfirmarRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbConfirmarContraseña))
                        .addGap(14, 14, 14)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPuestoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPuesto)))
                    .addComponent(lbUsuarioImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContraseñaPuestoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbContraseñaPuesto))
                    .addComponent(btnCargarImagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirRegistrarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(363, 363, 363))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMinimizarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarRegistroMouseClicked
       this.setState(ICONIFIED);
    }//GEN-LAST:event_lbMinimizarRegistroMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ContraseñaUsuarioRegistrar;
    public java.awt.Button btnAtras;
    public java.awt.Button btnCargarImagenUsuario;
    public java.awt.Button btnRegistrarUsuario;
    public java.awt.Button btnSalirRegistrarUsuario;
    public java.awt.Button btnSalirRegistrarUsuario1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> jcbPuestoRegistro;
    public javax.swing.JPanel jpRegistro;
    public javax.swing.JLabel lbConfirmarContraseña;
    public javax.swing.JLabel lbContraseña;
    public javax.swing.JLabel lbContraseñaPuesto;
    public javax.swing.JLabel lbMinimizarRegistro;
    public javax.swing.JLabel lbNombreUsuario;
    public javax.swing.JLabel lbPuesto;
    public javax.swing.JLabel lbSalirSistemaRegistro;
    public javax.swing.JLabel lbUsuarioImagen;
    public javax.swing.JTextField txtContraseñaConfirmarRegistrar;
    public javax.swing.JTextField txtContraseñaPuestoRegistrar;
    public javax.swing.JTextField txtNombreUsuarioRegistrar;
    // End of variables declaration//GEN-END:variables
}

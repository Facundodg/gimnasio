package Controlador;

import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_GREEN;
import static Controlador.Crl_cliente.ANSI_RED;
import static Controlador.Crl_cliente.ANSI_RESET;
import static Controlador.Crl_cliente.ANSI_YELLOW;
import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Crud_cliente;
import Modelo.Crud_usuario;
import Modelo.Imagen;
import Modelo.RenderImagen;
import Modelo.Usuario;
import Vista.Frm_Ingreso;
import Vista.Frm_Pantalla_Principal;
import Vista.Frm_registro;
import Vista.Frm_usuario_info;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Crl_usuario implements ActionListener, KeyListener, MouseListener {

    Frm_Ingreso frm_ingreso;
    Frm_Pantalla_Principal frm_pantalla_principal;
    Frm_registro frm_registro;
    Usuario usuario;
    Crud_usuario mod_usuario;
    Cliente cliente;
    Crud_cliente mod_cliente;
    Frm_usuario_info frm_usuario_info;
    String Ruta = "C:\\Users\\Claudia\\Documents\\Gimnasio_main\\imagenes\\blanco.png";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Crl_usuario(Frm_Ingreso frm_ingreso, Usuario usuario, Crud_usuario mod_usuario, Frm_Pantalla_Principal frm_pantalla_principal, Frm_registro frm_registro, Frm_usuario_info frm_usuario_info) {

        this.frm_ingreso = frm_ingreso;
        this.usuario = usuario;
        this.mod_usuario = mod_usuario;
        this.frm_pantalla_principal = frm_pantalla_principal;
        this.frm_registro = frm_registro;
        this.frm_usuario_info = frm_usuario_info;

        frm_ingreso.btnIngresar.addActionListener(this);
        frm_ingreso.btnRegistroIngreso.addActionListener(this);
        frm_registro.btnAtras.addActionListener(this);
        frm_registro.btnSalirRegistrarUsuario.addActionListener(this);
        frm_registro.btnCargarImagenUsuario.addActionListener(this);
        frm_registro.btnRegistrarUsuario.addActionListener(this);
        frm_pantalla_principal.btnModoNocturno.addActionListener(this);

        frm_registro.txtContraseñaConfirmarRegistrar.addKeyListener(this);
        frm_registro.txtContraseñaPuestoRegistrar.addKeyListener(this);
        frm_registro.txtNombreUsuarioRegistrar.addKeyListener(this);
        frm_registro.txtContraseñaPuestoRegistrar.addKeyListener(this);

        frm_pantalla_principal.lbCerrarSesion.addMouseListener(this);
        frm_pantalla_principal.lbSalirSistema.addMouseListener(this);
        frm_ingreso.lbSalirSistemaIngreso.addMouseListener(this);
        frm_registro.lbSalirSistemaRegistro.addMouseListener(this);
        frm_pantalla_principal.lbNombreUsuario.addMouseListener(this);
        frm_usuario_info.lbSalirUsuarioInfo.addMouseListener(this);

        refrescarTablaCliente();
        CargarImagen();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //REGISTRAR USUARIO
        if (e.getSource() == frm_registro.btnRegistrarUsuario) {

            usuario.setNombre_usuario(frm_registro.txtNombreUsuarioRegistrar.getText());

            if (mod_usuario.UsuarioRepetido(usuario) == false) {

                String contraseña = frm_registro.ContraseñaUsuarioRegistrar.getText();
                String contraseñaConfirmar = frm_registro.txtContraseñaConfirmarRegistrar.getText();

                if (contraseña.equals(contraseñaConfirmar)) {

                    String puesto = frm_registro.jcbPuestoRegistro.getSelectedItem().toString();

                    if ((puesto.equals("Nutricionista") || puesto.equals("Usuario")) && frm_registro.txtContraseñaPuestoRegistrar.getText().equals("321")) {

                        usuario.setPuesto_usuario(puesto);
                        usuario.setImagen(getImagen(Ruta));
                        usuario.setContraseña_usuario(contraseña);
                        if (mod_usuario.guardar(usuario)) {

                            JOptionPane.showMessageDialog(null, "Se guardo el usuario nuevo.");
                            CargarImagen();

                        } else {

                            JOptionPane.showMessageDialog(null, "LA CONTRASEÑA NO COINCIDE CON EL PUESTO.");
                            System.out.println("-No se guardo el usuario.");

                        }

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO COINCIDEN ");

                }

            } else {

                JOptionPane.showMessageDialog(null, "Nombre de usuario ya esta en el sistema.");

            }

        }

        //INGRESO AL SISTEMA 
        if (e.getSource() == frm_ingreso.btnIngresar) {

            usuario.setNombre_usuario(frm_ingreso.txtUsuario.getText());

            usuario.setContraseña_usuario(String.valueOf(frm_ingreso.txtContraseña.getPassword()));
            String usuarioNombre = frm_ingreso.txtUsuario.getText();
            String usuarioContraseña = String.valueOf(frm_ingreso.txtContraseña.getPassword());

            System.out.println(ANSI_GREEN + "-Nombre de Usuario es: " + ANSI_RESET + usuarioNombre);
            System.out.println(ANSI_GREEN + "-Contraseña de Usuario es: " + ANSI_RESET + usuarioContraseña);
            System.out.println(ANSI_CYAN + "----------------------------------------------------------");

            if (mod_usuario.buscar(usuario)) {

                frm_ingreso.setVisible(false);
                frm_pantalla_principal.setVisible(true);
                frm_pantalla_principal.setTitle("Bienvenido " + usuarioNombre + "!!!" + " V1.4");
                frm_pantalla_principal.lbNombreUsuario.setText(" " + usuarioNombre.toUpperCase());
                frm_usuario_info.lbNombreUsuarioInfo.setText(" " + usuarioNombre.toUpperCase());
                cargarImagenPerfil();
                CargarPuestoPerfil();
                CargarIdPerfil();
                frm_pantalla_principal.jTabbedPaneMain.setSelectedIndex(5);

                System.out.println(ANSI_GREEN + "-Entro con exito.");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

            } else {

                System.out.println(ANSI_RED + "-No entro el usuario.");

                JOptionPane.showMessageDialog(null, "El Usuario o Contraseña estan Erroneos." + "\n"
                        + "Por favor vuelva a intentar.");
            }

        }

        if (e.getSource() == frm_pantalla_principal.btnModoNocturno) {

            frm_pantalla_principal.panel_salir_sistema.setBackground(Color.GRAY);
            frm_pantalla_principal.jPanel2.setBackground(Color.GRAY);
            frm_pantalla_principal.jPanel1.setBackground(Color.GRAY);
            frm_pantalla_principal.TBTienda.setBackground(Color.GRAY);
            frm_pantalla_principal.TBCliente.setBackground(Color.GRAY);
            frm_pantalla_principal.TBRutina.setBackground(Color.GRAY);
            frm_pantalla_principal.TBUsuario.setBackground(Color.GRAY);
            frm_pantalla_principal.TBDieta.setBackground(Color.GRAY);
            frm_pantalla_principal.TBAtencionAlCliente.setBackground(Color.GRAY);
            frm_pantalla_principal.TBTienda.setForeground(Color.WHITE);
            frm_pantalla_principal.TBCliente.setForeground(Color.WHITE);
            frm_pantalla_principal.TBRutina.setForeground(Color.WHITE);
            frm_pantalla_principal.TBUsuario.setForeground(Color.WHITE);
            frm_pantalla_principal.TBDieta.setForeground(Color.WHITE);
            frm_pantalla_principal.TBAtencionAlCliente.setForeground(Color.WHITE);
            frm_pantalla_principal.lbSalirSistema.setForeground(Color.WHITE);
            frm_pantalla_principal.lbMinimizarVentana.setForeground(Color.WHITE);

            frm_ingreso.jpIngresoUsuario.setBackground(Color.GRAY);
            frm_ingreso.txtUsuario.setBackground(Color.GRAY);
            frm_ingreso.txtContraseña.setBackground(Color.GRAY);
            frm_ingreso.lbUsuario.setForeground(Color.WHITE);
            frm_ingreso.lbContraseña.setForeground(Color.WHITE);
            frm_ingreso.jsUsuario.setBackground(Color.WHITE);
            frm_ingreso.jsContraseña.setBackground(Color.WHITE);
            frm_ingreso.lbSalirSistemaIngreso.setForeground(Color.WHITE);
            frm_ingreso.lbMinimizarVentana.setForeground(Color.WHITE);

            frm_registro.jpRegistro.setBackground(Color.GRAY);
            frm_registro.lbSalirSistemaRegistro.setForeground(Color.WHITE);
            frm_registro.lbMinimizarRegistro.setForeground(Color.WHITE);
            frm_registro.lbNombreUsuario.setForeground(Color.WHITE);
            frm_registro.lbContraseña.setForeground(Color.WHITE);
            frm_registro.lbConfirmarContraseña.setForeground(Color.WHITE);
            frm_registro.lbContraseñaPuesto.setForeground(Color.WHITE);
            frm_registro.lbPuesto.setForeground(Color.WHITE);

        }

        if (e.getSource() == frm_ingreso.btnRegistroIngreso) {

            frm_ingreso.setVisible(false);
            frm_registro.setVisible(true);

        }

        if (e.getSource() == frm_registro.btnAtras) {

            frm_ingreso.setVisible(true);
            frm_registro.setVisible(false);

        }

        if (e.getSource() == frm_registro.btnSalirRegistrarUsuario) {

            System.exit(0);

        }

        if (e.getSource() == frm_registro.btnCargarImagenUsuario) {

            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PNG", "png");
            fc.setFileFilter(filtro);

            if (fc.showOpenDialog(frm_registro.btnCargarImagenUsuario) == JFileChooser.APPROVE_OPTION) {

                Ruta = fc.getSelectedFile().getAbsolutePath();
                Image miImage = new ImageIcon(Ruta).getImage();

                ImageIcon miIcono = new ImageIcon(miImage.getScaledInstance(frm_registro.lbUsuarioImagen.getHeight(), frm_registro.lbUsuarioImagen.getWidth(), 0));
                frm_registro.lbUsuarioImagen.setIcon(miIcono);

            }

        }

    }

    public void iniciar() {
        frm_ingreso.setVisible(true);
    }

    public byte[] getImagen(String Ruta) {

        File imagen = new File(Ruta);

        try {

            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);

            return icono;

        } catch (Exception e) {

            return null;
        }

    }

    public void CargarImagen() {

        DefaultTableModel modelo = new DefaultTableModel();
        frm_pantalla_principal.tlbUsuario.setDefaultRenderer(Object.class, new RenderImagen());

        modelo.addColumn("Puesto");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Imagen");

        if (mod_usuario.conectar()) {

            ArrayList Imagen;
            Object Datos[] = new Object[4];
            Imagen = mod_usuario.CargarImagenes();

            if (Imagen != null) {

                for (int i = 0; i < Imagen.size(); i++) {

                    usuario = (Usuario) Imagen.get(i);
                    Datos[0] = usuario.getPuesto_usuario();
                    Datos[1] = usuario.getNombre_usuario();
                    Datos[2] = usuario.getContraseña_usuario();

                    try {

                        byte[] imagen = usuario.getImagen();
                        BufferedImage bufferedImage = null;
                        InputStream inputStram = new ByteArrayInputStream(imagen);
                        bufferedImage = ImageIO.read(inputStram);
                        ImageIcon imagenIcon = new ImageIcon(bufferedImage.getScaledInstance(60, 60, 0));

                        Datos[3] = new JLabel(imagenIcon);

//                        frm_pantalla_principal.jlNombrePhoto.setIcon(imagenIcon);
                    } catch (Exception e) {

                        Datos[3] = new JLabel("No Imagen.");

                    }

                    modelo.addRow(Datos);

                }

                frm_pantalla_principal.tlbUsuario.setModel(modelo);
                frm_pantalla_principal.tlbUsuario.setRowHeight(60);
                frm_pantalla_principal.tlbUsuario.getColumnModel().getColumn(0).setPreferredWidth(60);
                frm_pantalla_principal.tlbUsuario.getColumnModel().getColumn(1).setPreferredWidth(60);
                frm_pantalla_principal.tlbUsuario.getColumnModel().getColumn(2).setPreferredWidth(60);
                frm_pantalla_principal.tlbUsuario.getColumnModel().getColumn(3).setPreferredWidth(60);

            }

        }

    }

    public void cargarImagenPerfil() {

        if (mod_usuario.conectar()) {

            ArrayList Imagen;
            Object Datos[] = new Object[1];
            usuario.setNombre_usuario(frm_ingreso.txtUsuario.getText());
            Imagen = mod_usuario.ImagenPerfil(usuario);

            if (Imagen != null) {

                for (int i = 0; i < Imagen.size(); i++) {

                    usuario = (Usuario) Imagen.get(i);
//                    Datos[0] = usuario.getPuesto_usuario();
//                    Datos[1] = usuario.getNombre_usuario();
//                    Datos[2] = usuario.getContraseña_usuario();

                    try {

                        byte[] imagen = usuario.getImagen();
                        BufferedImage bufferedImage = null;
                        InputStream inputStram = new ByteArrayInputStream(imagen);
                        bufferedImage = ImageIO.read(inputStram);
                        ImageIcon imagenIcon = new ImageIcon(bufferedImage.getScaledInstance(60, 60, 0));

                        Datos[0] = new JLabel(imagenIcon);

                        frm_pantalla_principal.jlNombrePhoto.setIcon(imagenIcon);
                        frm_usuario_info.lbFotoInfoUsuario.setIcon(imagenIcon);

                    } catch (Exception e) {

                        Datos[3] = new JLabel("No Imagen.");

                    }

                }

            }

        }
    }

    public void CargarPuestoPerfil() {

        usuario.setNombre_usuario(frm_ingreso.txtUsuario.getText());

        if (mod_usuario.PuestoPerfil(usuario)) {

            String puesto = usuario.getPuesto_usuario();

            PermisosDePuestoPerfil(puesto);

            frm_usuario_info.lbPuestoInfo.setText(usuario.getPuesto_usuario().toUpperCase());

        }

    }

    public void PermisosDePuestoPerfil(String puesto) {

        if (puesto.equals("Usuario")) {

            System.out.println("USUARIO");
            frm_pantalla_principal.TBUsuario.setEnabled(false);
            frm_pantalla_principal.TBDieta.setEnabled(false);

            frm_pantalla_principal.TBTienda.setEnabled(true);
            frm_pantalla_principal.TBCliente.setEnabled(true);
            frm_pantalla_principal.TBRutina.setEnabled(true);
            frm_pantalla_principal.TBAtencionAlCliente.setEnabled(true);

        } else if (puesto.equals("Nutricionista")) {

            System.out.println("NUTRICIONISTA");
            frm_pantalla_principal.TBTienda.setEnabled(false);
            frm_pantalla_principal.TBCliente.setEnabled(false);
            frm_pantalla_principal.TBUsuario.setEnabled(false);
            frm_pantalla_principal.TBRutina.setEnabled(false);

            frm_pantalla_principal.TBDieta.setEnabled(true);
            frm_pantalla_principal.TBAtencionAlCliente.setEnabled(true);

        } else if (puesto.equals("admin")) {

            System.out.println("ADMIN");

            frm_pantalla_principal.TBTienda.setEnabled(true);
            frm_pantalla_principal.TBCliente.setEnabled(true);
            frm_pantalla_principal.TBUsuario.setEnabled(true);
            frm_pantalla_principal.TBRutina.setEnabled(true);
            frm_pantalla_principal.TBDieta.setEnabled(true);
            frm_pantalla_principal.TBAtencionAlCliente.setEnabled(true);

        }

    }

    public void CargarIdPerfil() {

        usuario.setNombre_usuario(frm_ingreso.txtUsuario.getText());

        if (mod_usuario.IdPerfil(usuario)) {

            frm_usuario_info.lbId.setText(String.valueOf(usuario.getId_usuario()));

        }

    }

    public void habilitarBoton() {

        if (!frm_registro.txtContraseñaConfirmarRegistrar.getText().isEmpty()
                && !frm_registro.txtContraseñaPuestoRegistrar.getText().isEmpty()
                && !frm_registro.txtNombreUsuarioRegistrar.getText().isEmpty()
                && !frm_registro.txtContraseñaPuestoRegistrar.getText().isEmpty()) {

            frm_registro.btnRegistrarUsuario.setEnabled(true);

        } else {

            frm_registro.btnRegistrarUsuario.setEnabled(false);

        }
    }

    public void LimpiarTodo() {

        frm_pantalla_principal.txtApiNom.setText("");
        frm_pantalla_principal.txtBuscarProducto.setText("");
        frm_pantalla_principal.txtCantidadProducto.setText("");
        frm_pantalla_principal.txtCodigoProducto.setText("");
        frm_pantalla_principal.txtCorreo.setText("");
        frm_pantalla_principal.txtCostoProducto.setText("");
        frm_pantalla_principal.txtDireccion.setText("");
        frm_pantalla_principal.txtDni.setText("");
        frm_pantalla_principal.txtEnfermedad.setText("");
        frm_pantalla_principal.txtIdCliente.setText("");
        frm_pantalla_principal.txtIdCliente.setText("");
        frm_pantalla_principal.jdFechaFinMes.setDateFormatString("");
        frm_pantalla_principal.jdFechaNacimiento.setDateFormatString("");
        frm_pantalla_principal.txtPago.setText("");
        frm_pantalla_principal.txtNumTelefono.setText("");
        frm_pantalla_principal.txtCantidadProducto.setText("");
        frm_pantalla_principal.txtCostoProducto.setText("");
        frm_pantalla_principal.txtVentaProducto.setText("");
        frm_pantalla_principal.txtNombreProducto.setText("");

        System.out.println(ANSI_YELLOW + "---LIMPIEZA DE TODOS LOS CAMPOS DE TEXTO---");
        System.out.println(ANSI_CYAN + "----------------------------------------------------------");

    }

    public void refrescarTablaCliente() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();

            frm_pantalla_principal.tlbCliente_IC.setModel(modelo);

            PreparedStatement ps = null;

            ResultSet rs = null;

            Conexion conn = new Conexion();

            Connection con = conn.getConexion();

            String sql = "SELECT Id,NomApe,Correo,Dni,Edad,FechaFinMes,Dias,Pago FROM cliente ORDER BY NomApe";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

            int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

            modelo.addColumn("Id"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
            modelo.addColumn("Nombre y Apellido");//por eso los tenemos que reasignar.
            modelo.addColumn("Correo");
            modelo.addColumn("DNI");
            modelo.addColumn("Edad");
            modelo.addColumn("Fin Mes");
            modelo.addColumn("Dias");
            modelo.addColumn("Pago");

            while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1); //trae fila por fila

                }

                modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

            }

        } catch (SQLException e) {

            System.out.println(e);

        }

        System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA---");
        System.out.println(ANSI_CYAN + "----------------------------------------------------------");

        TamañoColumnasCliente();

    }

    public void TamañoColumnasCliente() {

        TableColumnModel columnModel = frm_pantalla_principal.tlbCliente_IC.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(15);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(60);
        columnModel.getColumn(4).setPreferredWidth(30);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(6).setPreferredWidth(30);
        columnModel.getColumn(7).setPreferredWidth(25);

        System.out.println(ANSI_YELLOW + "---ACOMODANDO TAMAÑO COLUMNAS TABLA---");
        System.out.println(ANSI_CYAN + "----------------------------------------------------------");

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        habilitarBoton();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_pantalla_principal.lbCerrarSesion) {

            frm_pantalla_principal.jTabbedPaneMain.setSelectedIndex(5);
            int p = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir de la cuenta?", "Elija una de las opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE); //devuelve un valor entero si=0, no=1, calcel=2

            if (p == 0) {

                frm_pantalla_principal.jTabbedPaneMain.setSelectedIndex(5);
                frm_pantalla_principal.jlNombrePhoto.setText(null);
                frm_usuario_info.lbFotoInfoUsuario.setText(null);
                frm_ingreso.setVisible(true);
                frm_pantalla_principal.setVisible(false);
                frm_ingreso.txtUsuario.setText("");
                frm_ingreso.txtContraseña.setText("");
                
                frm_pantalla_principal.TBUsuario.setSelected(false);
                frm_pantalla_principal.TBDieta.setSelected(false);
                frm_pantalla_principal.TBTienda.setSelected(false);
                frm_pantalla_principal.TBCliente.setSelected(false);
                frm_pantalla_principal.TBRutina.setSelected(false);
                frm_pantalla_principal.TBAtencionAlCliente.setSelected(false);

                LimpiarTodo();
                CargarImagen();
                refrescarTablaCliente();

            }

        }
        if (e.getSource() == frm_pantalla_principal.lbNombreUsuario) {

            frm_usuario_info.setVisible(true);

        }

        if (e.getSource() == frm_usuario_info.lbSalirUsuarioInfo) {

            frm_usuario_info.setVisible(false);

        }

        if (e.getSource() == frm_pantalla_principal.lbSalirSistema) {

            int p = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir del Sistema?", "Elija una de las opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE); //devuelve un valor entero si=0, no=1, calcel=2

            if (p == 0) {

                System.exit(0);

            }

        }

        if (e.getSource() == frm_ingreso.lbSalirSistemaIngreso) {

            int p = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir del Sistema?", "Elija una de las opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE); //devuelve un valor entero si=0, no=1, calcel=2

            if (p == 0) {

                System.exit(0);

            }

        }

        if (e.getSource() == frm_registro.lbSalirSistemaRegistro) {

            int p = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir del Sistema?", "Elija una de las opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE); //devuelve un valor entero si=0, no=1, calcel=2

            if (p == 0) {

                System.exit(0);

            }

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

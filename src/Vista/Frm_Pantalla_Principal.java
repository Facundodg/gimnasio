package Vista;

import Controlador.Crl_producto;
import Modelo.Conexion;
import Modelo.Crud_Pdf;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Frm_Pantalla_Principal extends javax.swing.JFrame {

    public Frm_Pantalla_Principal() {

        initComponents();

        this.setLocationRelativeTo(null);
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaAc = sdf.format(fechaActual);
        txtFecha.setText(fechaAc);
        setIconImage(new ImageIcon(getClass().getResource("../img/icono_gym.png")).getImage());

        buttonGroup_Genero.add(jrbOtro); // me permite elegir solo uno de los jrbuttons del genero
        buttonGroup_Genero.add(jrbHombre);// me permite elegir solo uno de los jrbuttons del genero
        buttonGroup_Genero.add(jrbMujer);// me permite elegir solo uno de los jrbuttons del genero

        buttonGroup1.add(jrbhombreIMC);
        buttonGroup1.add(jrbmujerIMC);

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/btn-man.png")); //pones la ruta de la imagen
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jrbhombreIMC.getWidth(), jrbhombreIMC.getHeight(), Image.SCALE_DEFAULT));
        jrbhombreIMC.setIcon(fondo1);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/img/btn-woman.png")); //pones la ruta de la imagen
        Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(jrbmujerIMC.getWidth(), jrbmujerIMC.getHeight(), Image.SCALE_DEFAULT));
        jrbmujerIMC.setIcon(fondo2);

        //ImageIcon imagen3 = new ImageIcon(getClass().getResource("/img/bmi-bar.png")); //pones la ruta de la imagen
        //Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lbBarraIMC.getWidth(), lbBarraIMC.getHeight(), Image.SCALE_DEFAULT));
        //lbBarraIMC.setIcon(fondo3);

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/img/discord_icon.png")); //pones la ruta de la imagen
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(48, 38, Image.SCALE_DEFAULT));
        jlDiscord.setIcon(fondo4);

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/img/instagram_logo_icon.png")); //pones la ruta de la imagen
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        jlnstagram.setIcon(fondo5);

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/img/fb_icon.png")); //pones la ruta de la imagen
        Icon fondo6 = new ImageIcon(imagen6.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        jlFacebook.setIcon(fondo6);

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/img/icon-web.png")); //pones la ruta de la imagen
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(43, 48, Image.SCALE_DEFAULT));
        jlWeb.setIcon(fondo7);

        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Genero = new javax.swing.ButtonGroup();
        jPopupTablaProducto = new javax.swing.JPopupMenu();
        popuItemEliminarProducto = new javax.swing.JMenuItem();
        popuItemModificarProducto = new javax.swing.JMenuItem();
        popuItemPdfProducto = new javax.swing.JMenuItem();
        popuItemLimpiarProducto = new javax.swing.JMenuItem();
        jPopupPanelProducto = new javax.swing.JPopupMenu();
        popuItemGuardarProductoPanel = new javax.swing.JMenuItem();
        popuItemPdfProductoPanel = new javax.swing.JMenuItem();
        popuItemLimpiarProductoPanel = new javax.swing.JMenuItem();
        jPopupTableCliente = new javax.swing.JPopupMenu();
        popuItemGuardarCliente = new javax.swing.JMenuItem();
        popuItemModificarCliente = new javax.swing.JMenuItem();
        popuItemEliminarCliente = new javax.swing.JMenuItem();
        popuItemPdfCliente = new javax.swing.JMenuItem();
        popuItemLimpiarCliente = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TBTienda = new javax.swing.JToggleButton();
        TBCliente = new javax.swing.JToggleButton();
        TBRutina = new javax.swing.JToggleButton();
        TBUsuario = new javax.swing.JToggleButton();
        TBAtencionAlCliente = new javax.swing.JToggleButton();
        TBDieta = new javax.swing.JToggleButton();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtCostoProducto = new javax.swing.JTextField();
        txtVentaProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tlbProductos = new Vista.ColorCeldaProducto();
        txtBuscarProducto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jcbBusquedas = new javax.swing.JComboBox<>();
        txtIdProducto = new javax.swing.JTextField();
        lbGuardarProducto = new javax.swing.JLabel();
        lbModificarProducto = new javax.swing.JLabel();
        lbGenerarPDFProducto = new javax.swing.JLabel();
        lbEliminarrProducto = new javax.swing.JLabel();
        lbLimpiarProducto = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jcbFiltrar = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        lbCapital = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        lbVender = new javax.swing.JLabel();
        lbCantidadDeProductos = new javax.swing.JLabel();
        lbHistorial2 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtApiNom = new javax.swing.JTextField();
        txtNumTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtEnfermedad = new javax.swing.JTextField();
        JcbMedicaSiNo = new javax.swing.JComboBox<>();
        jdFechaFinMes = new com.toedter.calendar.JDateChooser();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        btnGuardaCliente_IC = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        jrbHombre = new javax.swing.JRadioButton();
        jrbMujer = new javax.swing.JRadioButton();
        jrbOtro = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbCliente_IC = new ColorCeldaCliente();
        jLabel13 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        JcbNombreDni = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        lbGuardarCliente = new javax.swing.JLabel();
        lbModificarCliente = new javax.swing.JLabel();
        lbModificarProducto6 = new javax.swing.JLabel();
        lbLimpiarCliente = new javax.swing.JLabel();
        jcbFiltrar1 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        lbEliminarCliente = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TxtNombreRutina = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tlbRutinas = new javax.swing.JTable();
        lbguardarRutina = new javax.swing.JLabel();
        lbModificarRutina = new javax.swing.JLabel();
        lbEliminarRutina = new javax.swing.JLabel();
        lbEliminarrProducto3 = new javax.swing.JLabel();
        btnseleccionar = new javax.swing.JButton();
        lbIdRutina = new javax.swing.JLabel();
        lbIdRutina1 = new javax.swing.JLabel();
        txtBuscarRutina = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tlbUsuario = new javax.swing.JTable();
        lbGuardarProducto2 = new javax.swing.JLabel();
        lbModificarProducto2 = new javax.swing.JLabel();
        lbModificarProducto4 = new javax.swing.JLabel();
        lbEliminarrProducto4 = new javax.swing.JLabel();
        lbEliminarrProducto5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel46 = new javax.swing.JLabel();
        lbUsuarioImagen = new javax.swing.JLabel();
        btnCargarImagenUsuario = new java.awt.Button();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jlDiscord = new javax.swing.JLabel();
        jlnstagram = new javax.swing.JLabel();
        jlFacebook = new javax.swing.JLabel();
        jlWeb = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lbFechaPrueba = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        lbGuardarTurno = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtDniTurno = new javax.swing.JTextField();
        txtNombreTurno = new javax.swing.JTextField();
        txtDniTurno1 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtDireccionTurno = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtSexoTurno = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtMotivoTurno = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtEdadTurno = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tlbTurnos = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tlbClientesTurno = new javax.swing.JTable();
        lbIrCalculadora = new javax.swing.JLabel();
        lbEliminarrProducto6 = new javax.swing.JLabel();
        lbLimpiarTurno = new javax.swing.JLabel();
        lbModificarProducto7 = new javax.swing.JLabel();
        txtTelefonoTurno = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        txtDniTurno7 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        jSlAltura = new javax.swing.JSlider();
        jLabel31 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        pnlCalcularIMC = new javax.swing.JLabel();
        jSlPeso = new javax.swing.JSlider();
        jrbhombreIMC = new javax.swing.JRadioButton();
        lbMasculinoColor = new javax.swing.JLabel();
        lbFemeninoColor = new javax.swing.JLabel();
        jrbmujerIMC = new javax.swing.JRadioButton();
        jSlEdad = new javax.swing.JSlider();
        jLabel41 = new javax.swing.JLabel();
        txtEdadCalculadora = new javax.swing.JTextField();
        txtCC = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jSlCC = new javax.swing.JSlider();
        jcbIntencidadEntrenamiento = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jcbObjetivo = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        lbAyudaCalculadora = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        lbLimpiarCamposCalculadora = new javax.swing.JLabel();
        jPGraficaPastel = new javax.swing.JPanel();
        lbVolverTurno = new javax.swing.JLabel();
        lbResultadoIMC = new javax.swing.JLabel();
        lbResultadoTMB = new javax.swing.JLabel();
        lbResultadoTMBObjetivo = new javax.swing.JLabel();
        lbResultadoGC = new javax.swing.JLabel();
        lbCaloriasCarbono = new javax.swing.JLabel();
        lbCaloriasGrasa = new javax.swing.JLabel();
        lbCaloriasProteina = new javax.swing.JLabel();
        lbGramosCarbohidrato = new javax.swing.JLabel();
        lbGramosGrasa = new javax.swing.JLabel();
        lbGramosProteina = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        btnModoNocturno = new java.awt.Button();
        jPanel17 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        panel_salir_sistema = new javax.swing.JPanel();
        lbSalirSistema = new javax.swing.JLabel();
        lbMinimizarVentana = new javax.swing.JLabel();
        jlNombrePhoto = new com.bolivia.label.CLabel();
        lbNombreUsuario = new javax.swing.JLabel();
        lbCerrarSesion = new javax.swing.JLabel();

        popuItemEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        popuItemEliminarProducto.setText("Eliminar Producto");
        jPopupTablaProducto.add(popuItemEliminarProducto);

        popuItemModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        popuItemModificarProducto.setText("Modificar Producto");
        jPopupTablaProducto.add(popuItemModificarProducto);

        popuItemPdfProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        popuItemPdfProducto.setText("Generar PDF");
        jPopupTablaProducto.add(popuItemPdfProducto);

        popuItemLimpiarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        popuItemLimpiarProducto.setText("Limpiar Textos");
        jPopupTablaProducto.add(popuItemLimpiarProducto);

        jPopupPanelProducto.setComponentPopupMenu(jPopupPanelProducto);

        popuItemGuardarProductoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        popuItemGuardarProductoPanel.setText("Guardar");
        jPopupPanelProducto.add(popuItemGuardarProductoPanel);

        popuItemPdfProductoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        popuItemPdfProductoPanel.setText("Generar PDF");
        jPopupPanelProducto.add(popuItemPdfProductoPanel);

        popuItemLimpiarProductoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        popuItemLimpiarProductoPanel.setText("Limpiar Texto");
        jPopupPanelProducto.add(popuItemLimpiarProductoPanel);

        popuItemGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        popuItemGuardarCliente.setText("Guardar");
        jPopupTableCliente.add(popuItemGuardarCliente);

        popuItemModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        popuItemModificarCliente.setText("Modificar");
        jPopupTableCliente.add(popuItemModificarCliente);

        popuItemEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        popuItemEliminarCliente.setText("Eliminar");
        jPopupTableCliente.add(popuItemEliminarCliente);

        popuItemPdfCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        popuItemPdfCliente.setText("PDF");
        jPopupTableCliente.add(popuItemPdfCliente);

        popuItemLimpiarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        popuItemLimpiarCliente.setText("Limpiar");
        jPopupTableCliente.add(popuItemLimpiarCliente);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBTienda.setBackground(new java.awt.Color(102, 102, 255));
        TBTienda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TBTienda.setForeground(new java.awt.Color(0, 0, 0));
        TBTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Venta_ico.png"))); // NOI18N
        TBTienda.setText("TIENDA");
        TBTienda.setToolTipText("Tienda (Stock,Ventas)");
        TBTienda.setBorder(null);
        TBTienda.setFocusPainted(false);
        TBTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBTiendaActionPerformed(evt);
            }
        });
        jPanel2.add(TBTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

        TBCliente.setBackground(new java.awt.Color(102, 102, 255));
        TBCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TBCliente.setForeground(new java.awt.Color(0, 0, 0));
        TBCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agreg_ico.png"))); // NOI18N
        TBCliente.setText("CLIENTE");
        TBCliente.setToolTipText("Clientes (administracion)");
        TBCliente.setBorder(null);
        TBCliente.setFocusPainted(false);
        TBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBClienteActionPerformed(evt);
            }
        });
        jPanel2.add(TBCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, -1));

        TBRutina.setBackground(new java.awt.Color(102, 102, 255));
        TBRutina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TBRutina.setForeground(new java.awt.Color(0, 0, 0));
        TBRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rutinas.png"))); // NOI18N
        TBRutina.setText("RUTINAS");
        TBRutina.setToolTipText("Rutinas (agregar,eliminar,buscar,modificar)");
        TBRutina.setBorder(null);
        TBRutina.setFocusPainted(false);
        TBRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBRutinaActionPerformed(evt);
            }
        });
        jPanel2.add(TBRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 70));

        TBUsuario.setBackground(new java.awt.Color(102, 102, 255));
        TBUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TBUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TBUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Admi_ico.png"))); // NOI18N
        TBUsuario.setText("USUARIO");
        TBUsuario.setToolTipText("Usuario (administracion)");
        TBUsuario.setBorder(null);
        TBUsuario.setFocusPainted(false);
        TBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(TBUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 70));

        TBAtencionAlCliente.setBackground(new java.awt.Color(102, 102, 255));
        TBAtencionAlCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TBAtencionAlCliente.setForeground(new java.awt.Color(0, 0, 0));
        TBAtencionAlCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AtCli_ico.png"))); // NOI18N
        TBAtencionAlCliente.setText("AYUDA");
        TBAtencionAlCliente.setToolTipText("Ayuda (contacto, redes)");
        TBAtencionAlCliente.setBorder(null);
        TBAtencionAlCliente.setFocusPainted(false);
        TBAtencionAlCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBAtencionAlClienteActionPerformed(evt);
            }
        });
        jPanel2.add(TBAtencionAlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 210, 70));

        TBDieta.setBackground(new java.awt.Color(102, 102, 255));
        TBDieta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TBDieta.setForeground(new java.awt.Color(0, 0, 0));
        TBDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rut_ico.png"))); // NOI18N
        TBDieta.setText("DIETAS");
        TBDieta.setToolTipText("Dietas (administracion de turnos)");
        TBDieta.setBorder(null);
        TBDieta.setFocusPainted(false);
        TBDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBDietaActionPerformed(evt);
            }
        });
        jPanel2.add(TBDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 70));

        txtFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setText("dd/mm/yyyy");
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 80, -1));

        txtHora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHora.setText("00:00:00");
        jPanel2.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 510));

        jTabbedPaneMain.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setComponentPopupMenu(jPopupPanelProducto);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("CODIGO");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("NOMBRE");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("COSTO");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("VENTA");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, 20));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("CANT");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 30));
        jPanel3.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, -1));
        jPanel3.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, -1));
        jPanel3.add(txtCostoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, -1));
        jPanel3.add(txtVentaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, -1));
        jPanel3.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, -1));

        tlbProductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tlbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Costo", "Venta", "Cantidad"
            }
        ));
        tlbProductos.setComponentPopupMenu(jPopupTablaProducto);
        tlbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tlbProductos);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 151, 820, 390));
        jPanel3.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 150, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("BUSCAR");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jcbBusquedas.setBackground(new java.awt.Color(204, 204, 255));
        jcbBusquedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        jPanel3.add(jcbBusquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 80, -1));

        txtIdProducto.setEnabled(false);
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        jPanel3.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 60, -1));

        lbGuardarProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbGuardarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        lbGuardarProducto.setText("GUARDAR");
        lbGuardarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbGuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 150, 40));

        lbModificarProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarProducto.setText("MODIFICAR");
        lbModificarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 150, 40));

        lbGenerarPDFProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbGenerarPDFProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGenerarPDFProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lbGenerarPDFProducto.setText("PDF");
        lbGenerarPDFProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbGenerarPDFProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbGenerarPDFProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 550, 130, 40));

        lbEliminarrProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarrProducto.setText("ELIMINAR");
        lbEliminarrProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbEliminarrProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 130, 40));

        lbLimpiarProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbLimpiarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLimpiarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbLimpiarProducto.setText("LIMPIAR");
        lbLimpiarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbLimpiarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbLimpiarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 140, 40));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("ID");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 20, 20));

        jcbFiltrar.setBackground(new java.awt.Color(204, 204, 255));
        jcbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE(DES)", "NOMBRE(ACE)", "CANTIDAD(DES)", "CANTIDAD(ACE)", "COSTO(DES)", "COSTO(ACE)", "VENTA(DES)", "VENTA(ACE)" }));
        jPanel3.add(jcbFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 120, -1));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("ORDENAR POR");
        jPanel3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 110, 20));

        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("VENDIDOS EN EL MES:");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 240, 20));

        lbCapital.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCapital.setForeground(new java.awt.Color(0, 0, 0));
        lbCapital.setText("CAPITAL:");
        jPanel3.add(lbCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, 20));

        jLabel62.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("CAJA: 1");
        jPanel3.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, 20));

        lbVender.setForeground(new java.awt.Color(0, 0, 0));
        lbVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        lbVender.setText("VENDER");
        lbVender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 103, 115, 40));

        lbCantidadDeProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCantidadDeProductos.setForeground(new java.awt.Color(0, 0, 0));
        lbCantidadDeProductos.setText("CANT DE PRODUCTOS:");
        jPanel3.add(lbCantidadDeProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 240, 20));

        lbHistorial2.setForeground(new java.awt.Color(0, 0, 0));
        lbHistorial2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHistorial2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        lbHistorial2.setText("AYUDA");
        lbHistorial2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbHistorial2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbHistorial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 103, 120, 40));

        jLabel60.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("GANANCIA DEL MES:");
        jPanel3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 240, 20));

        jLabel63.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("VENDIDO HOY:");
        jPanel3.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, 20));

        jTabbedPaneMain.addTab("TIENDA", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE Y APELLIDO");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NRO TELEFONO");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DIRECCION");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ENFERMEDAD O ALERGIA");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FCH FIN DE MES");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 29));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("SE MEDICA");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CORREO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));
        jPanel4.add(txtApiNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 181, -1));
        jPanel4.add(txtNumTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 181, -1));
        jPanel4.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 181, -1));
        jPanel4.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 181, -1));
        jPanel4.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 181, -1));
        jPanel4.add(txtEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 150, -1));

        JcbMedicaSiNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel4.add(JcbMedicaSiNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, -1));
        jPanel4.add(jdFechaFinMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 130, -1));
        jPanel4.add(jdFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 130, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("FCH NACIMIENTO");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 29));

        btnGuardaCliente_IC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardaCliente_IC.setLabel("Guardar");
        btnGuardaCliente_IC.setName(""); // NOI18N
        btnGuardaCliente_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaCliente_ICActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardaCliente_IC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 118, -1));
        btnGuardaCliente_IC.getAccessibleContext().setAccessibleDescription("Guardar Cliente");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("SEXO");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 28));

        jrbHombre.setBackground(new java.awt.Color(204, 204, 255));
        jrbHombre.setForeground(new java.awt.Color(0, 0, 0));
        jrbHombre.setText("Hombre");
        jrbHombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jrbHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jrbMujer.setBackground(new java.awt.Color(204, 204, 255));
        jrbMujer.setForeground(new java.awt.Color(0, 0, 0));
        jrbMujer.setText("Mujer");
        jrbMujer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jrbMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMujerActionPerformed(evt);
            }
        });
        jPanel4.add(jrbMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jrbOtro.setBackground(new java.awt.Color(204, 204, 255));
        jrbOtro.setForeground(new java.awt.Color(0, 0, 0));
        jrbOtro.setText("Otro");
        jrbOtro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jrbOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOtroActionPerformed(evt);
            }
        });
        jPanel4.add(jrbOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PAGO");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));
        jPanel4.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 130, -1));

        tlbCliente_IC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tlbCliente_IC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre y Apellido", "Correo", "Edad", "Fecha Fin de Mes", "Dias Restantes", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tlbCliente_IC.setComponentPopupMenu(jPopupTableCliente);
        tlbCliente_IC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbCliente_ICMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlbCliente_IC);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 810, 280));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, 20));

        txtIdCliente.setEnabled(false);
        jPanel4.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 40, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("BUSCAR");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel4.add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 154, -1));

        JcbNombreDni.setBackground(new java.awt.Color(204, 204, 255));
        JcbNombreDni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "DNI" }));
        jPanel4.add(JcbNombreDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 125, -1));
        jPanel4.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 41, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Edad");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));
        jPanel4.add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 41, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Dias");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, 20));

        lbGuardarCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbGuardarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        lbGuardarCliente.setText("GUARDAR");
        lbGuardarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 130, 40));

        lbModificarCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarCliente.setText("MODIFICAR");
        lbModificarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 130, 40));

        lbModificarProducto6.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lbModificarProducto6.setText("PDF");
        lbModificarProducto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbModificarProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 130, 40));

        lbLimpiarCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbLimpiarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLimpiarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbLimpiarCliente.setText("LIMPIAR");
        lbLimpiarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbLimpiarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbLimpiarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 130, 40));

        jcbFiltrar1.setBackground(new java.awt.Color(204, 204, 255));
        jcbFiltrar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE(DES)", "NOMBRE(ACE)", "CANTIDAD(DES)", "CANTIDAD(ACE)", "COSTO(DES)", "COSTO(ACE)", "VENTA(DES)", "VENTA(ACE)" }));
        jPanel4.add(jcbFiltrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 130, -1));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("ORDENAR POR");
        jPanel4.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 110, 20));

        lbEliminarCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarCliente.setText("ELIMINAR");
        lbEliminarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 130, 40));

        jTabbedPaneMain.addTab("CLIENTE", jPanel4);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre del PDF");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, -1, -1));

        TxtNombreRutina.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(TxtNombreRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 6, 183, -1));

        tlbRutinas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tlbRutinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "PDF"
            }
        ));
        tlbRutinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbRutinasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tlbRutinas);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 75, -1, 460));

        lbguardarRutina.setForeground(new java.awt.Color(0, 0, 0));
        lbguardarRutina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbguardarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        lbguardarRutina.setText("GUARDAR");
        lbguardarRutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbguardarRutina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(lbguardarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 110, 40));

        lbModificarRutina.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarRutina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarRutina.setText("MODIFICAR");
        lbModificarRutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarRutina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(lbModificarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 110, 40));

        lbEliminarRutina.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarRutina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarRutina.setText("ELIMINAR");
        lbEliminarRutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarRutina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(lbEliminarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 100, 40));

        lbEliminarrProducto3.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbEliminarrProducto3.setText("LIMPIAR");
        lbEliminarrProducto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(lbEliminarrProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 100, 40));

        btnseleccionar.setText("Seleccionar...");
        jPanel6.add(btnseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 200, 30));

        lbIdRutina.setText("Id:");
        jPanel6.add(lbIdRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 20));

        lbIdRutina1.setForeground(new java.awt.Color(0, 0, 0));
        lbIdRutina1.setText("BUSCAR");
        jPanel6.add(lbIdRutina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 40));

        txtBuscarRutina.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(txtBuscarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("RUTINAS", jPanel5);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));

        tlbUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tlbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puesto", "Nombre", "Contraseña", "Imagen"
            }
        ));
        jScrollPane4.setViewportView(tlbUsuario);

        lbGuardarProducto2.setForeground(new java.awt.Color(0, 0, 0));
        lbGuardarProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardarProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        lbGuardarProducto2.setText("GUARDAR");
        lbGuardarProducto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbGuardarProducto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbModificarProducto2.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lbModificarProducto2.setText("PDF");
        lbModificarProducto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbModificarProducto4.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarProducto4.setText("MODIFICAR");
        lbModificarProducto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbEliminarrProducto4.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarrProducto4.setText("ELIMINAR");
        lbEliminarrProducto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbEliminarrProducto5.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbEliminarrProducto5.setText("LIMPIAR");
        lbEliminarrProducto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("NOMBRE");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("PUESTO");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Nutricionista" }));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("CONTRASEÑA");

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("CONFIRMAR CONTRASEÑA");

        lbUsuarioImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuarioImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCargarImagenUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargarImagenUsuario.setLabel("Cargar Imagen");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsuarioImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargarImagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbModificarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbGuardarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEliminarrProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbModificarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(lbEliminarrProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(lbUsuarioImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCargarImagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lbEliminarrProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModificarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGuardarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModificarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEliminarrProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("USUARIOS", jPanel8);

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));

        jlDiscord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDiscord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlDiscord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlDiscordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlDiscordMouseExited(evt);
            }
        });

        jlnstagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlnstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlnstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlnstagramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlnstagramMouseExited(evt);
            }
        });

        jlFacebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlFacebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlFacebookMouseExited(evt);
            }
        });

        jlWeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlWebMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlWebMouseExited(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Contactanos");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Motivo");

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Consulta");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Discord");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Instagram");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Facebook");

        jLabel38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("FDG.COM");

        jLabel39.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Portales");

        jPanel23.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jLabel40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("ENVIAR");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDiscord, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlnstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGap(0, 148, Short.MAX_VALUE)
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(jTextField2))
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDiscord, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlnstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("AYUDA", jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("imagen fdgSistem");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("soporte tecnico");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("pagina web");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("V1.9.8");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(23, 23, 23))
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("INICIO", jPanel7);

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFechaPrueba.setForeground(new java.awt.Color(0, 0, 0));
        lbFechaPrueba.setText("FECHA Y HORADE TURNO");
        jPanel16.add(lbFechaPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, -1, 30));

        jdcFecha.setDateFormatString("yyyy/MM/dd HH:mm");
        jPanel16.add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, -1));

        lbGuardarTurno.setForeground(new java.awt.Color(0, 0, 0));
        lbGuardarTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fecha.png"))); // NOI18N
        lbGuardarTurno.setText("GUARDAR");
        lbGuardarTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.add(lbGuardarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 110, 40));

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("DNI");
        jPanel16.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("NOMBRE Y APELLIDO");
        jPanel16.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));
        jPanel16.add(txtDniTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 160, -1));
        jPanel16.add(txtNombreTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 160, -1));
        jPanel16.add(txtDniTurno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 250, -1));

        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("ORDENAR POR");
        jPanel16.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 40));
        jPanel16.add(txtDireccionTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, -1));

        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("DIRECCION");
        jPanel16.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 30));
        jPanel16.add(txtSexoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, -1));

        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("SEXO");
        jPanel16.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 30));
        jPanel16.add(txtMotivoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 120, -1));

        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("MOTIVO");
        jPanel16.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, 30));

        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("EDAD");
        jPanel16.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 30));
        jPanel16.add(txtEdadTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 120, -1));

        tlbTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dni", "Telefono", "Direccion", "Sexo", "Edad", "Motivo", "Fecha", "Hora"
            }
        ));
        jScrollPane5.setViewportView(tlbTurnos);

        jPanel16.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, 810, 290));

        tlbClientesTurno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dni"
            }
        ));
        jScrollPane6.setViewportView(tlbClientesTurno);

        jPanel16.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 310, 200));

        lbIrCalculadora.setForeground(new java.awt.Color(0, 0, 0));
        lbIrCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIrCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculadora.png"))); // NOI18N
        lbIrCalculadora.setText("CALCULAR MEDIDAS");
        lbIrCalculadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbIrCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lbIrCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 170, 40));

        lbEliminarrProducto6.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarrProducto6.setText("ELIMINAR");
        lbEliminarrProducto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lbEliminarrProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, 40));

        lbLimpiarTurno.setForeground(new java.awt.Color(0, 0, 0));
        lbLimpiarTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLimpiarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbLimpiarTurno.setText("LIMPIAR");
        lbLimpiarTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbLimpiarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lbLimpiarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 40));

        lbModificarProducto7.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarProducto7.setText("MODIFICAR");
        lbModificarProducto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lbModificarProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 110, 40));
        jPanel16.add(txtTelefonoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, -1));

        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("TELEFONO");
        jPanel16.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel16.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 110, -1));

        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("BUSCAR");
        jPanel16.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));
        jPanel16.add(txtDniTurno7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));

        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setText("BUSCAR");
        jPanel16.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, 40));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("TURNOS", jPanel15);

        jPanel19.setBackground(new java.awt.Color(204, 204, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(102, 102, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Peso(Kg)");
        jPanel24.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 80, 20));

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setBorder(null);
        jPanel24.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 60, 20));

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltura.setBorder(null);
        jPanel24.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 60, 20));

        jSlAltura.setBackground(new java.awt.Color(102, 102, 255));
        jSlAltura.setForeground(new java.awt.Color(255, 255, 255));
        jSlAltura.setMaximum(250);
        jSlAltura.setMinimum(130);
        jSlAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.add(jSlAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Altura(Mt)");
        jPanel24.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 20));

        jPanel25.setBackground(new java.awt.Color(51, 255, 51));

        pnlCalcularIMC.setForeground(new java.awt.Color(0, 0, 0));
        pnlCalcularIMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlCalcularIMC.setText("CALCULAR ");
        pnlCalcularIMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCalcularIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCalcularIMC, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 200, 30));

        jSlPeso.setBackground(new java.awt.Color(102, 102, 255));
        jSlPeso.setForeground(new java.awt.Color(255, 255, 255));
        jSlPeso.setMaximum(200);
        jSlPeso.setMinimum(40);
        jSlPeso.setValue(40);
        jSlPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.add(jSlPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, -1));

        jrbhombreIMC.setBackground(new java.awt.Color(102, 102, 255));
        jrbhombreIMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbhombreIMC.setName("H"); // NOI18N
        jPanel24.add(jrbhombreIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        lbMasculinoColor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMasculinoColor.setForeground(new java.awt.Color(0, 0, 0));
        lbMasculinoColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMasculinoColor.setText("Masculino");
        jPanel24.add(lbMasculinoColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        lbFemeninoColor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbFemeninoColor.setForeground(new java.awt.Color(0, 0, 0));
        lbFemeninoColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFemeninoColor.setText("Femenino");
        jPanel24.add(lbFemeninoColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 30));

        jrbmujerIMC.setBackground(new java.awt.Color(102, 102, 255));
        jrbmujerIMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbmujerIMC.setName("F"); // NOI18N
        jPanel24.add(jrbmujerIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 100));

        jSlEdad.setBackground(new java.awt.Color(102, 102, 255));
        jSlEdad.setForeground(new java.awt.Color(255, 255, 255));
        jSlEdad.setMinimum(5);
        jSlEdad.setValue(5);
        jSlEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.add(jSlEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Edad");
        jPanel24.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 20));

        txtEdadCalculadora.setBackground(new java.awt.Color(255, 255, 255));
        txtEdadCalculadora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEdadCalculadora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdadCalculadora.setBorder(null);
        jPanel24.add(txtEdadCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 60, 20));

        txtCC.setBackground(new java.awt.Color(255, 255, 255));
        txtCC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCC.setBorder(null);
        jPanel24.add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 60, 20));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Intencidad de Entrenamiento");
        jPanel24.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 20));

        jSlCC.setBackground(new java.awt.Color(102, 102, 255));
        jSlCC.setForeground(new java.awt.Color(255, 255, 255));
        jSlCC.setMinimum(20);
        jSlCC.setValue(0);
        jSlCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.add(jSlCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, -1));

        jcbIntencidadEntrenamiento.setBackground(new java.awt.Color(255, 255, 255));
        jcbIntencidadEntrenamiento.setForeground(new java.awt.Color(0, 0, 0));
        jcbIntencidadEntrenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Ligero", "Ligero", "Moderado", "Activo", "Muy Activo" }));
        jPanel24.add(jcbIntencidadEntrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, 30));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("CC(Cm)");
        jPanel24.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 80, 20));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Objetivo");
        jPanel24.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, 20));

        jcbObjetivo.setBackground(new java.awt.Color(255, 255, 255));
        jcbObjetivo.setForeground(new java.awt.Color(0, 0, 0));
        jcbObjetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajar Peso", "Subir Peso", "Mantener Peso" }));
        jPanel24.add(jcbObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 210, 30));

        jPanel14.setBackground(new java.awt.Color(51, 255, 51));

        lbAyudaCalculadora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbAyudaCalculadora.setForeground(new java.awt.Color(0, 0, 0));
        lbAyudaCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAyudaCalculadora.setText("AYUDA");
        lbAyudaCalculadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAyudaCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAyudaCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 70, -1));

        jPanel20.setBackground(new java.awt.Color(51, 255, 51));

        lbLimpiarCamposCalculadora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbLimpiarCamposCalculadora.setForeground(new java.awt.Color(0, 0, 0));
        lbLimpiarCamposCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLimpiarCamposCalculadora.setText("LIMPIAR CAMPOS");
        lbLimpiarCamposCalculadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLimpiarCamposCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLimpiarCamposCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 120, -1));

        jPanel19.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 240, 610));

        jPGraficaPastel.setBackground(new java.awt.Color(204, 204, 255));
        jPGraficaPastel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPGraficaPastelLayout = new javax.swing.GroupLayout(jPGraficaPastel);
        jPGraficaPastel.setLayout(jPGraficaPastelLayout);
        jPGraficaPastelLayout.setHorizontalGroup(
            jPGraficaPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPGraficaPastelLayout.setVerticalGroup(
            jPGraficaPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel19.add(jPGraficaPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 200));

        lbVolverTurno.setForeground(new java.awt.Color(0, 0, 0));
        lbVolverTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVolverTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        lbVolverTurno.setText("VOLVER A TURNOS");
        lbVolverTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbVolverTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel19.add(lbVolverTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 170, 40));

        lbResultadoIMC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoIMC.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoIMC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbResultadoIMC.setText("txt IMC");
        jPanel19.add(lbResultadoIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 350, 30));

        lbResultadoTMB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoTMB.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoTMB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbResultadoTMB.setText("txt TMB");
        jPanel19.add(lbResultadoTMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 350, 30));

        lbResultadoTMBObjetivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoTMBObjetivo.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoTMBObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbResultadoTMBObjetivo.setText("txt TMB OBJETIVO");
        jPanel19.add(lbResultadoTMBObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 280, 30));

        lbResultadoGC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoGC.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoGC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbResultadoGC.setText("txt GC");
        jPanel19.add(lbResultadoGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 270, 30));

        lbCaloriasCarbono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCaloriasCarbono.setForeground(new java.awt.Color(102, 204, 0));
        lbCaloriasCarbono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCaloriasCarbono.setText("txt Calorias carbohidratos");
        jPanel19.add(lbCaloriasCarbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 220, 30));

        lbCaloriasGrasa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCaloriasGrasa.setForeground(new java.awt.Color(102, 204, 0));
        lbCaloriasGrasa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCaloriasGrasa.setText("txt Calorias grasa");
        jPanel19.add(lbCaloriasGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 220, 30));

        lbCaloriasProteina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCaloriasProteina.setForeground(new java.awt.Color(102, 204, 0));
        lbCaloriasProteina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCaloriasProteina.setText("txt Calorias proteina");
        jPanel19.add(lbCaloriasProteina, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 250, 30));

        lbGramosCarbohidrato.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGramosCarbohidrato.setForeground(new java.awt.Color(102, 204, 0));
        lbGramosCarbohidrato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbGramosCarbohidrato.setText("txt Gramos cabohidratos");
        jPanel19.add(lbGramosCarbohidrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 220, 30));

        lbGramosGrasa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGramosGrasa.setForeground(new java.awt.Color(102, 204, 0));
        lbGramosGrasa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbGramosGrasa.setText("txt Gramos grasas");
        jPanel19.add(lbGramosGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 270, 30));

        lbGramosProteina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGramosProteina.setForeground(new java.awt.Color(102, 204, 0));
        lbGramosProteina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbGramosProteina.setText("txt Gramos proteina");
        jPanel19.add(lbGramosProteina, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 260, 20));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Gramos Proteina:");
        jPanel19.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 20));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("IMC:");
        jPanel19.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("TMB:");
        jPanel19.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        jLabel50.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("TMB Objetivo:");
        jPanel19.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 30));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Grasa Corporal:");
        jPanel19.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 30));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Calorias Carbohidratos:");
        jPanel19.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 30));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Calorias Carbohidratos:");
        jPanel19.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 30));

        jLabel56.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Calorias Proteina:");
        jPanel19.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 30));

        jLabel64.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Gramos Carbohidratos:");
        jPanel19.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, 30));

        jLabel74.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Gramos Grasas:");
        jPanel19.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, 30));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("CALCULADORA", jPanel18);

        jPanel22.setBackground(new java.awt.Color(204, 204, 255));

        btnModoNocturno.setLabel("Modo oscuro");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModoNocturno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(635, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModoNocturno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(560, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("CONFIG", jPanel21);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("CALCULOS REGISTRO", jPanel17);

        jPanel1.add(jTabbedPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 0, 830, 630));

        panel_salir_sistema.setBackground(new java.awt.Color(102, 102, 255));

        lbSalirSistema.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSalirSistema.setForeground(new java.awt.Color(0, 0, 0));
        lbSalirSistema.setText("x");

        lbMinimizarVentana.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbMinimizarVentana.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimizarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimizarVentana.setText("-");
        lbMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarVentanaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_salir_sistemaLayout = new javax.swing.GroupLayout(panel_salir_sistema);
        panel_salir_sistema.setLayout(panel_salir_sistemaLayout);
        panel_salir_sistemaLayout.setHorizontalGroup(
            panel_salir_sistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salir_sistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSalirSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMinimizarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(975, Short.MAX_VALUE))
        );
        panel_salir_sistemaLayout.setVerticalGroup(
            panel_salir_sistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMinimizarVentana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(lbSalirSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(panel_salir_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        jlNombrePhoto.setText("");
        jPanel1.add(jlNombrePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 47, 60, 60));

        lbNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreUsuario.setText("NAME");
        lbNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNombreUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbNombreUsuarioMouseExited(evt);
            }
        });
        jPanel1.add(lbNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 91, -1));

        lbCerrarSesion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lbCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        lbCerrarSesion.setText("CERRAR SESION");
        lbCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCerrarSesionMouseExited(evt);
            }
        });
        jPanel1.add(lbCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 91, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //----------------METODOS BASICOS-------------------------
    public void traerID() {

        PreparedStatement ps = null;

        ResultSet rs = null;

        Conexion conn = new Conexion();

        Connection con = conn.getConexion();

        int Fila = tlbRutinas.getSelectedRow();

        String codigo = tlbRutinas.getValueAt(Fila, 0).toString();

            String sql = "SELECT Id FROM rutina WHERE Id = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, codigo);

            rs = ps.executeQuery();

            while (rs.next()) {

                lbIdRutina.setText(rs.getString("Id"));
                
            }


        } catch (SQLException ex) {
            Logger.getLogger(Crl_producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    

    }

    private void TBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBClienteActionPerformed

        jTabbedPaneMain.setSelectedIndex(1);

        TBTienda.setSelected(false);
        TBRutina.setSelected(false);
        TBUsuario.setSelected(false);
        TBUsuario.setSelected(false);
        TBDieta.setSelected(false);
        TBAtencionAlCliente.setSelected(false);
    }//GEN-LAST:event_TBClienteActionPerformed

    private void TBTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBTiendaActionPerformed

        jTabbedPaneMain.setSelectedIndex(0);
        TBCliente.setSelected(false);
        TBRutina.setSelected(false);
        TBUsuario.setSelected(false);
        TBUsuario.setSelected(false);
        TBDieta.setSelected(false);
        TBAtencionAlCliente.setSelected(false);

    }//GEN-LAST:event_TBTiendaActionPerformed

    private void TBRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBRutinaActionPerformed
        jTabbedPaneMain.setSelectedIndex(2);
        TBCliente.setSelected(false);
        TBTienda.setSelected(false);
        TBUsuario.setSelected(false);
        TBUsuario.setSelected(false);
        TBDieta.setSelected(false);
        TBAtencionAlCliente.setSelected(false);
    }//GEN-LAST:event_TBRutinaActionPerformed

    private void TBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBUsuarioActionPerformed
        jTabbedPaneMain.setSelectedIndex(3);
        TBCliente.setSelected(false);
        TBTienda.setSelected(false);
        TBRutina.setSelected(false);
        TBDieta.setSelected(false);
        TBAtencionAlCliente.setSelected(false);
    }//GEN-LAST:event_TBUsuarioActionPerformed

    private void lbNombreUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNombreUsuarioMouseEntered
        lbNombreUsuario.setForeground(Color.BLUE);
    }//GEN-LAST:event_lbNombreUsuarioMouseEntered

    private void lbNombreUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNombreUsuarioMouseExited
        lbNombreUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbNombreUsuarioMouseExited

    private void lbCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarSesionMouseEntered
        lbCerrarSesion.setForeground(Color.BLUE);
    }//GEN-LAST:event_lbCerrarSesionMouseEntered

    private void lbCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarSesionMouseExited
        lbCerrarSesion.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbCerrarSesionMouseExited

    private void TBDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBDietaActionPerformed

        jTabbedPaneMain.setSelectedIndex(6);
        TBCliente.setSelected(false);
        TBTienda.setSelected(false);
        TBRutina.setSelected(false);
        TBUsuario.setSelected(false);
        TBAtencionAlCliente.setSelected(false);

    }//GEN-LAST:event_TBDietaActionPerformed

    private void TBAtencionAlClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBAtencionAlClienteActionPerformed

        jTabbedPaneMain.setSelectedIndex(4);
        TBCliente.setSelected(false);
        TBTienda.setSelected(false);
        TBRutina.setSelected(false);
        TBUsuario.setSelected(false);
        TBDieta.setSelected(false);

    }//GEN-LAST:event_TBAtencionAlClienteActionPerformed

    private void lbMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarVentanaMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lbMinimizarVentanaMouseClicked

    private void jlWebMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlWebMouseExited

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/img/icon-web.png")); //pones la ruta de la imagen
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(43, 48, Image.SCALE_DEFAULT));
        jlWeb.setIcon(fondo7);
    }//GEN-LAST:event_jlWebMouseExited

    private void jlWebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlWebMouseEntered

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/img/icon-web-64px.png")); //pones la ruta de la imagen
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(57, 64, Image.SCALE_DEFAULT));
        jlWeb.setIcon(fondo7);
    }//GEN-LAST:event_jlWebMouseEntered

    private void jlFacebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFacebookMouseExited

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/img/fb_icon.png")); //pones la ruta de la imagen
        Icon fondo6 = new ImageIcon(imagen6.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        jlFacebook.setIcon(fondo6);
    }//GEN-LAST:event_jlFacebookMouseExited

    private void jlFacebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFacebookMouseEntered

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/img/fb_icon-64px.png")); //pones la ruta de la imagen
        Icon fondo6 = new ImageIcon(imagen6.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        jlFacebook.setIcon(fondo6);
    }//GEN-LAST:event_jlFacebookMouseEntered

    private void jlnstagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlnstagramMouseExited

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/img/instagram_logo_icon.png")); //pones la ruta de la imagen
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        jlnstagram.setIcon(fondo5);
    }//GEN-LAST:event_jlnstagramMouseExited

    private void jlnstagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlnstagramMouseEntered

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/img/instagram_logo_icon_64px.png")); //pones la ruta de la imagen
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        jlnstagram.setIcon(fondo5);
    }//GEN-LAST:event_jlnstagramMouseEntered

    private void jlDiscordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDiscordMouseExited

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/img/discord_icon.png")); //pones la ruta de la imagen
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(48, 38, Image.SCALE_DEFAULT));
        jlDiscord.setIcon(fondo4);
    }//GEN-LAST:event_jlDiscordMouseExited

    private void jlDiscordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDiscordMouseEntered

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/img/discord_icon_64px.png")); //pones la ruta de la imagen
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(64, 51, Image.SCALE_DEFAULT));
        jlDiscord.setIcon(fondo4);
    }//GEN-LAST:event_jlDiscordMouseEntered

    private void tlbRutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbRutinasMouseClicked

        traerID();

        int column = tlbRutinas.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tlbRutinas.getRowHeight();

        if (row < tlbRutinas.getRowCount() && row >= 0 && column < tlbRutinas.getColumnCount() && column >= 0) {
            int id = (int) tlbRutinas.getValueAt(row, 0);
            Object value = tlbRutinas.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    Crud_Pdf pd = new Crud_Pdf();
                    pd.ejecutar_archivoPDF(id);
                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception ex) {
                    }
                }

            } else {
                String name = "" + tlbRutinas.getValueAt(row, 1);
                TxtNombreRutina.setText(name);
            }
        }
    }//GEN-LAST:event_tlbRutinasMouseClicked

    private void tlbCliente_ICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbCliente_ICMouseClicked

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        PreparedStatement ps = null;

        ResultSet rs = null;

        Conexion conn = new Conexion();

        Connection con = conn.getConexion();

        int Fila = tlbCliente_IC.getSelectedRow();

        String codigo = tlbCliente_IC.getValueAt(Fila, 3).toString();

        String sql = "SELECT Id,NomApe,Telefono,Direccion,Correo,Enfermedad,Dni,FechaNacimientos,FechaFinMes,Pago FROM cliente WHERE Dni=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, codigo);

            rs = ps.executeQuery();

            while (rs.next()) {

                txtIdCliente.setText(rs.getString("Id"));
                txtApiNom.setText(rs.getString("NomApe"));
                txtNumTelefono.setText(rs.getString("Telefono"));
                txtDireccion.setText(rs.getString("Direccion"));
                txtCorreo.setText(rs.getString("Correo"));
                txtEnfermedad.setText(rs.getString("Enfermedad"));
                txtDni.setText(rs.getString("Dni"));

                Date fechaNacimiento = sdf.parse(rs.getString("FechaNacimientos"));
                jdFechaNacimiento.setDate(fechaNacimiento);

                Date fechaMes = sdf.parse(rs.getString("FechaFinMes"));
                jdFechaFinMes.setDate(fechaMes);

                txtPago.setText(rs.getString("Pago"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Crl_producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Frm_Pantalla_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tlbCliente_ICMouseClicked

    private void jrbOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOtroActionPerformed

    private void jrbMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMujerActionPerformed

    private void btnGuardaCliente_ICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaCliente_ICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardaCliente_ICActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void tlbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbProductosMouseClicked

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion conn = new Conexion();

        Connection con = conn.getConexion();

        int Fila = tlbProductos.getSelectedRow();

        String codigo = tlbProductos.getValueAt(Fila, 1).toString();

        String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad FROM producto WHERE Codigo=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, codigo);

            rs = ps.executeQuery();

            while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                txtIdProducto.setText(rs.getString("Id"));
                txtCodigoProducto.setText(rs.getString("Codigo"));
                txtNombreProducto.setText(rs.getString("Nombre"));
                txtCostoProducto.setText(rs.getString("Costo"));
                txtVentaProducto.setText(rs.getString("Venta"));
                txtCantidadProducto.setText(rs.getString("Cantidad"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Crl_producto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tlbProductosMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> JcbMedicaSiNo;
    public javax.swing.JComboBox<String> JcbNombreDni;
    public javax.swing.JToggleButton TBAtencionAlCliente;
    public javax.swing.JToggleButton TBCliente;
    public javax.swing.JToggleButton TBDieta;
    public javax.swing.JToggleButton TBRutina;
    public javax.swing.JToggleButton TBTienda;
    public javax.swing.JToggleButton TBUsuario;
    public javax.swing.JTextField TxtNombreRutina;
    public java.awt.Button btnCargarImagenUsuario;
    public java.awt.Button btnGuardaCliente_IC;
    public java.awt.Button btnModoNocturno;
    public javax.swing.JButton btnseleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup_Genero;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPGraficaPastel;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPopupMenu jPopupPanelProducto;
    public javax.swing.JPopupMenu jPopupTablaProducto;
    public javax.swing.JPopupMenu jPopupTableCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JSlider jSlAltura;
    public javax.swing.JSlider jSlCC;
    public javax.swing.JSlider jSlEdad;
    public javax.swing.JSlider jSlPeso;
    public javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JComboBox<String> jcbBusquedas;
    public javax.swing.JComboBox<String> jcbFiltrar;
    public javax.swing.JComboBox<String> jcbFiltrar1;
    public javax.swing.JComboBox<String> jcbIntencidadEntrenamiento;
    public javax.swing.JComboBox<String> jcbObjetivo;
    public com.toedter.calendar.JDateChooser jdFechaFinMes;
    public com.toedter.calendar.JDateChooser jdFechaNacimiento;
    public com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlDiscord;
    private javax.swing.JLabel jlFacebook;
    public com.bolivia.label.CLabel jlNombrePhoto;
    private javax.swing.JLabel jlWeb;
    private javax.swing.JLabel jlnstagram;
    public javax.swing.JRadioButton jrbHombre;
    public javax.swing.JRadioButton jrbMujer;
    public javax.swing.JRadioButton jrbOtro;
    public javax.swing.JRadioButton jrbhombreIMC;
    public javax.swing.JRadioButton jrbmujerIMC;
    public javax.swing.JLabel lbAyudaCalculadora;
    public javax.swing.JLabel lbCaloriasCarbono;
    public javax.swing.JLabel lbCaloriasGrasa;
    public javax.swing.JLabel lbCaloriasProteina;
    public javax.swing.JLabel lbCantidadDeProductos;
    public javax.swing.JLabel lbCapital;
    public javax.swing.JLabel lbCerrarSesion;
    public javax.swing.JLabel lbEliminarCliente;
    public javax.swing.JLabel lbEliminarRutina;
    public javax.swing.JLabel lbEliminarrProducto;
    public javax.swing.JLabel lbEliminarrProducto3;
    public javax.swing.JLabel lbEliminarrProducto4;
    public javax.swing.JLabel lbEliminarrProducto5;
    public javax.swing.JLabel lbEliminarrProducto6;
    public javax.swing.JLabel lbFechaPrueba;
    public javax.swing.JLabel lbFemeninoColor;
    public javax.swing.JLabel lbGenerarPDFProducto;
    public javax.swing.JLabel lbGramosCarbohidrato;
    public javax.swing.JLabel lbGramosGrasa;
    public javax.swing.JLabel lbGramosProteina;
    public javax.swing.JLabel lbGuardarCliente;
    public javax.swing.JLabel lbGuardarProducto;
    public javax.swing.JLabel lbGuardarProducto2;
    public javax.swing.JLabel lbGuardarTurno;
    public javax.swing.JLabel lbHistorial2;
    public javax.swing.JLabel lbIdRutina;
    public javax.swing.JLabel lbIdRutina1;
    public javax.swing.JLabel lbIrCalculadora;
    public javax.swing.JLabel lbLimpiarCamposCalculadora;
    public javax.swing.JLabel lbLimpiarCliente;
    public javax.swing.JLabel lbLimpiarProducto;
    public javax.swing.JLabel lbLimpiarTurno;
    public javax.swing.JLabel lbMasculinoColor;
    public javax.swing.JLabel lbMinimizarVentana;
    public javax.swing.JLabel lbModificarCliente;
    public javax.swing.JLabel lbModificarProducto;
    public javax.swing.JLabel lbModificarProducto2;
    public javax.swing.JLabel lbModificarProducto4;
    public javax.swing.JLabel lbModificarProducto6;
    public javax.swing.JLabel lbModificarProducto7;
    public javax.swing.JLabel lbModificarRutina;
    public javax.swing.JLabel lbNombreUsuario;
    public javax.swing.JLabel lbResultadoGC;
    public javax.swing.JLabel lbResultadoIMC;
    public javax.swing.JLabel lbResultadoTMB;
    public javax.swing.JLabel lbResultadoTMBObjetivo;
    public javax.swing.JLabel lbSalirSistema;
    public javax.swing.JLabel lbUsuarioImagen;
    public javax.swing.JLabel lbVender;
    public javax.swing.JLabel lbVolverTurno;
    public javax.swing.JLabel lbguardarRutina;
    public javax.swing.JPanel panel_salir_sistema;
    public javax.swing.JLabel pnlCalcularIMC;
    public javax.swing.JMenuItem popuItemEliminarCliente;
    public javax.swing.JMenuItem popuItemEliminarProducto;
    public javax.swing.JMenuItem popuItemGuardarCliente;
    private javax.swing.JMenuItem popuItemGuardarProductoPanel;
    public javax.swing.JMenuItem popuItemLimpiarCliente;
    public javax.swing.JMenuItem popuItemLimpiarProducto;
    public javax.swing.JMenuItem popuItemLimpiarProductoPanel;
    public javax.swing.JMenuItem popuItemModificarCliente;
    public javax.swing.JMenuItem popuItemModificarProducto;
    public javax.swing.JMenuItem popuItemPdfCliente;
    private javax.swing.JMenuItem popuItemPdfProducto;
    private javax.swing.JMenuItem popuItemPdfProductoPanel;
    public javax.swing.JTable tlbCliente_IC;
    public javax.swing.JTable tlbClientesTurno;
    public javax.swing.JTable tlbProductos;
    public javax.swing.JTable tlbRutinas;
    public javax.swing.JTable tlbTurnos;
    public javax.swing.JTable tlbUsuario;
    public javax.swing.JTextField txtAltura;
    public javax.swing.JTextField txtApiNom;
    public javax.swing.JTextField txtBuscarCliente;
    public javax.swing.JTextField txtBuscarProducto;
    public javax.swing.JTextField txtBuscarRutina;
    public javax.swing.JTextField txtCC;
    public javax.swing.JTextField txtCantidadProducto;
    public javax.swing.JTextField txtCodigoProducto;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtCostoProducto;
    public javax.swing.JTextField txtDias;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDireccionTurno;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtDniTurno;
    public javax.swing.JTextField txtDniTurno1;
    public javax.swing.JTextField txtDniTurno7;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtEdadCalculadora;
    public javax.swing.JTextField txtEdadTurno;
    public javax.swing.JTextField txtEnfermedad;
    public javax.swing.JLabel txtFecha;
    public javax.swing.JLabel txtHora;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtMotivoTurno;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtNombreTurno;
    public javax.swing.JTextField txtNumTelefono;
    public javax.swing.JTextField txtPago;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtSexoTurno;
    public javax.swing.JTextField txtTelefonoTurno;
    public javax.swing.JTextField txtVentaProducto;
    // End of variables declaration//GEN-END:variables
}

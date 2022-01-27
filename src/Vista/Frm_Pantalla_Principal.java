package Vista;

import Controlador.Crl_producto;
import Modelo.Conexion;
import java.awt.Color;
import java.awt.Image;
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

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/img/bmi-bar.png")); //pones la ruta de la imagen
        Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lbBarraIMC.getWidth(), lbBarraIMC.getHeight(), Image.SCALE_DEFAULT));
        lbBarraIMC.setIcon(fondo3);

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
        jLabel24 = new javax.swing.JLabel();
        lbGuardarProducto = new javax.swing.JLabel();
        lbModificarProducto = new javax.swing.JLabel();
        lbModificarProducto1 = new javax.swing.JLabel();
        lbEliminarrProducto = new javax.swing.JLabel();
        lbEliminarrProducto1 = new javax.swing.JLabel();
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
        lbGuardarProducto3 = new javax.swing.JLabel();
        lbModificarProducto5 = new javax.swing.JLabel();
        lbModificarProducto6 = new javax.swing.JLabel();
        lbEliminarrProducto6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbGuardarProducto1 = new javax.swing.JLabel();
        lbModificarProducto3 = new javax.swing.JLabel();
        lbEliminarrProducto2 = new javax.swing.JLabel();
        lbEliminarrProducto3 = new javax.swing.JLabel();
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
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        lbBarraIMC = new javax.swing.JLabel();
        lbCaloriasProteina = new javax.swing.JLabel();
        lbCaloriasGrasa = new javax.swing.JLabel();
        lbCaloriasCarbono = new javax.swing.JLabel();
        lbGramosProteina = new javax.swing.JLabel();
        lbGramosGrasa = new javax.swing.JLabel();
        lbGramosCarbohidrato = new javax.swing.JLabel();
        jPGraficaPastel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lbResultadoIMC = new javax.swing.JLabel();
        lbResultadoGC = new javax.swing.JLabel();
        lbResultadoTMB = new javax.swing.JLabel();
        lbResultadoTMBObjetivo = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        btnModoNocturno = new java.awt.Button();
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
        jLabel14.setText("Codigo");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombre");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, -1, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Costo");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Venta");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Cantidad");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 30));
        jPanel3.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 181, -1));
        jPanel3.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 181, -1));
        jPanel3.add(txtCostoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 67, -1));
        jPanel3.add(txtVentaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 68, -1));
        jPanel3.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 60, -1));

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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 820, 450));
        jPanel3.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Buscar");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        jcbBusquedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        jPanel3.add(jcbBusquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 120, -1));

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        jPanel3.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 60, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("ID");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 20, 30));

        lbGuardarProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbGuardarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        lbGuardarProducto.setText("GUARDAR");
        lbGuardarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbGuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 130, 40));

        lbModificarProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarProducto.setText("MODIFICAR");
        lbModificarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 130, 40));

        lbModificarProducto1.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lbModificarProducto1.setText("PDF");
        lbModificarProducto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbModificarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 130, 40));

        lbEliminarrProducto.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbEliminarrProducto.setText("LIMPIAR");
        lbEliminarrProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbEliminarrProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 130, 40));

        lbEliminarrProducto1.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarrProducto1.setText("ELIMINAR");
        lbEliminarrProducto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbEliminarrProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 130, 40));

        jTabbedPaneMain.addTab("TIENDA", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre y Apellido");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Numero de Telefono");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Direccion");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Enfermedad o Alergia");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha de Fin de Mes");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 57, -1, 29));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Se medica");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 80, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Correo electronico");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));
        jPanel4.add(txtApiNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 23, 181, -1));
        jPanel4.add(txtNumTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 53, 181, -1));
        jPanel4.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 113, 181, -1));
        jPanel4.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 83, 181, -1));
        jPanel4.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 143, 181, -1));
        jPanel4.add(txtEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 173, 181, -1));

        JcbMedicaSiNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel4.add(JcbMedicaSiNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 160, 130, -1));
        jPanel4.add(jdFechaFinMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 57, 130, -1));
        jPanel4.add(jdFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 92, 130, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de Nacimiento");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 92, -1, 29));

        btnGuardaCliente_IC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardaCliente_IC.setLabel("Guardar");
        btnGuardaCliente_IC.setName(""); // NOI18N
        btnGuardaCliente_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaCliente_ICActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardaCliente_IC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 519, 118, -1));
        btnGuardaCliente_IC.getAccessibleContext().setAccessibleDescription("Guardar Cliente");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sexo");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 28));

        jrbHombre.setBackground(new java.awt.Color(204, 204, 255));
        jrbHombre.setForeground(new java.awt.Color(0, 0, 0));
        jrbHombre.setText("Hombre");
        jPanel4.add(jrbHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jrbMujer.setBackground(new java.awt.Color(204, 204, 255));
        jrbMujer.setForeground(new java.awt.Color(0, 0, 0));
        jrbMujer.setText("Mujer");
        jrbMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMujerActionPerformed(evt);
            }
        });
        jPanel4.add(jrbMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jrbOtro.setBackground(new java.awt.Color(204, 204, 255));
        jrbOtro.setForeground(new java.awt.Color(0, 0, 0));
        jrbOtro.setText("Otro");
        jrbOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOtroActionPerformed(evt);
            }
        });
        jPanel4.add(jrbOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Pago");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));
        jPanel4.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 130, 130, -1));

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, 802, 268));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, 20));
        jPanel4.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 29, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("BUSCAR");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, -1, -1));
        jPanel4.add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 210, 154, -1));

        JcbNombreDni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "DNI" }));
        jPanel4.add(JcbNombreDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 209, 125, -1));
        jPanel4.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 209, 41, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Edad");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 213, -1, -1));
        jPanel4.add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 209, 41, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Dias");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 213, -1, -1));

        lbGuardarProducto3.setForeground(new java.awt.Color(0, 0, 0));
        lbGuardarProducto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardarProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        lbGuardarProducto3.setText("GUARDAR");
        lbGuardarProducto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbGuardarProducto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbGuardarProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 130, 40));

        lbModificarProducto5.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarProducto5.setText("MODIFICAR");
        lbModificarProducto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbModificarProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 130, 40));

        lbModificarProducto6.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lbModificarProducto6.setText("PDF");
        lbModificarProducto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbModificarProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 130, 40));

        lbEliminarrProducto6.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarrProducto6.setText("ELIMINAR");
        lbEliminarrProducto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lbEliminarrProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 130, 40));

        jTabbedPaneMain.addTab("CLIENTE", jPanel4);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre del PDF");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        button1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button1.setLabel("Buscar PDF");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "PDF"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        lbGuardarProducto1.setForeground(new java.awt.Color(0, 0, 0));
        lbGuardarProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardarProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        lbGuardarProducto1.setText("GUARDAR");
        lbGuardarProducto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbGuardarProducto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbModificarProducto3.setForeground(new java.awt.Color(0, 0, 0));
        lbModificarProducto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModificarProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificarProducto.png"))); // NOI18N
        lbModificarProducto3.setText("MODIFICAR");
        lbModificarProducto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbModificarProducto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbEliminarrProducto2.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarProducto.png"))); // NOI18N
        lbEliminarrProducto2.setText("ELIMINAR");
        lbEliminarrProducto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbEliminarrProducto3.setForeground(new java.awt.Color(0, 0, 0));
        lbEliminarrProducto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminarrProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        lbEliminarrProducto3.setText("LIMPIAR");
        lbEliminarrProducto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbEliminarrProducto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbGuardarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEliminarrProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbModificarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(lbEliminarrProducto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(504, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGuardarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbModificarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEliminarrProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEliminarrProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lbGuardarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbModificarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEliminarrProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbModificarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEliminarrProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGuardarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbModificarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEliminarrProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbModificarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEliminarrProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
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
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
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
        jLabel23.setText("V1.9.5");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
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

        jDayChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.add(jDayChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 290));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Fecha", "Hora"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 430, 290));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("DIETAS USUARIO", jPanel15);

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

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCalcularIMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCalcularIMC, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 200, 30));

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
        jPanel24.add(jcbIntencidadEntrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 220, 30));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("CC(Cm)");
        jPanel24.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 80, 20));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Objetivo");
        jPanel24.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 220, 20));

        jcbObjetivo.setBackground(new java.awt.Color(255, 255, 255));
        jcbObjetivo.setForeground(new java.awt.Color(0, 0, 0));
        jcbObjetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajar Peso", "Subir Peso", "Mantener Peso" }));
        jPanel24.add(jcbObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 220, 30));

        jPanel19.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 240, 600));

        lbBarraIMC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbBarraIMC.setForeground(new java.awt.Color(102, 255, 0));
        lbBarraIMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBarraIMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbBarraIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 250, 30));

        lbCaloriasProteina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCaloriasProteina.setForeground(new java.awt.Color(102, 204, 0));
        lbCaloriasProteina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCaloriasProteina.setText("txt Calorias proteina");
        lbCaloriasProteina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbCaloriasProteina, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 250, 30));

        lbCaloriasGrasa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCaloriasGrasa.setForeground(new java.awt.Color(102, 204, 0));
        lbCaloriasGrasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCaloriasGrasa.setText("txt Calorias grasa");
        lbCaloriasGrasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbCaloriasGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 250, 30));

        lbCaloriasCarbono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCaloriasCarbono.setForeground(new java.awt.Color(102, 204, 0));
        lbCaloriasCarbono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCaloriasCarbono.setText("txt Calorias carbohidratos");
        lbCaloriasCarbono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbCaloriasCarbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 250, 30));

        lbGramosProteina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGramosProteina.setForeground(new java.awt.Color(102, 204, 0));
        lbGramosProteina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGramosProteina.setText("txt Gramos proteina");
        lbGramosProteina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbGramosProteina, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 220, 30));

        lbGramosGrasa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGramosGrasa.setForeground(new java.awt.Color(102, 204, 0));
        lbGramosGrasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGramosGrasa.setText("txt Gramos grasas");
        lbGramosGrasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbGramosGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 140, 30));

        lbGramosCarbohidrato.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGramosCarbohidrato.setForeground(new java.awt.Color(102, 204, 0));
        lbGramosCarbohidrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGramosCarbohidrato.setText("txt Gramos cabohidratos");
        lbGramosCarbohidrato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbGramosCarbohidrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 250, 30));

        jPGraficaPastel.setBackground(new java.awt.Color(204, 204, 255));
        jPGraficaPastel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPGraficaPastelLayout = new javax.swing.GroupLayout(jPGraficaPastel);
        jPGraficaPastel.setLayout(jPGraficaPastelLayout);
        jPGraficaPastelLayout.setHorizontalGroup(
            jPGraficaPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        jPGraficaPastelLayout.setVerticalGroup(
            jPGraficaPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        jPanel19.add(jPGraficaPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 200));

        jScrollPane8.setBackground(new java.awt.Color(204, 204, 255));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("GC:");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("IMC:");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("TBM OBJETIVO:");

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("TMB:");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("jLabel25");

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("jLabel25");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("jLabel25");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("jLabel25");

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("jLabel25");

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("jLabel25");

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("jLabel25");

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("jLabel25");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)))
                    .addComponent(jLabel54))
                .addGap(18, 18, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel27)
                .addGap(19, 19, 19)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(37, 37, 37)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel55))))
        );

        jScrollPane8.setViewportView(jPanel14);

        jPanel19.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 270, 370));

        lbResultadoIMC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoIMC.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoIMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoIMC.setText("txt IMC");
        lbResultadoIMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbResultadoIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 192, 30));

        lbResultadoGC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoGC.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoGC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoGC.setText("txt GC");
        lbResultadoGC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbResultadoGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 192, 30));

        lbResultadoTMB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoTMB.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoTMB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTMB.setText("txt TMB");
        lbResultadoTMB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbResultadoTMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 192, 30));

        lbResultadoTMBObjetivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResultadoTMBObjetivo.setForeground(new java.awt.Color(102, 204, 0));
        lbResultadoTMBObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTMBObjetivo.setText("txt TMB OBJETIVO");
        lbResultadoTMBObjetivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(lbResultadoTMBObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, 30));

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
                .addContainerGap(550, Short.MAX_VALUE))
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

        jPanel1.add(jTabbedPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 10, 830, 620));

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

    private void jrbMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMujerActionPerformed

    private void jrbOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOtroActionPerformed

    private void btnGuardaCliente_ICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaCliente_ICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardaCliente_ICActionPerformed

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

    private void jlDiscordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDiscordMouseEntered

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/img/discord_icon_64px.png")); //pones la ruta de la imagen
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(64, 51, Image.SCALE_DEFAULT));
        jlDiscord.setIcon(fondo4);

    }//GEN-LAST:event_jlDiscordMouseEntered

    private void jlDiscordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDiscordMouseExited

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/img/discord_icon.png")); //pones la ruta de la imagen
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(48, 38, Image.SCALE_DEFAULT));
        jlDiscord.setIcon(fondo4);

    }//GEN-LAST:event_jlDiscordMouseExited

    private void jlnstagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlnstagramMouseEntered

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/img/instagram_logo_icon_64px.png")); //pones la ruta de la imagen
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        jlnstagram.setIcon(fondo5);

    }//GEN-LAST:event_jlnstagramMouseEntered

    private void jlnstagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlnstagramMouseExited

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/img/instagram_logo_icon.png")); //pones la ruta de la imagen
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        jlnstagram.setIcon(fondo5);

    }//GEN-LAST:event_jlnstagramMouseExited

    private void jlFacebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFacebookMouseEntered

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/img/fb_icon-64px.png")); //pones la ruta de la imagen
        Icon fondo6 = new ImageIcon(imagen6.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        jlFacebook.setIcon(fondo6);

    }//GEN-LAST:event_jlFacebookMouseEntered

    private void jlFacebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFacebookMouseExited

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/img/fb_icon.png")); //pones la ruta de la imagen
        Icon fondo6 = new ImageIcon(imagen6.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        jlFacebook.setIcon(fondo6);

    }//GEN-LAST:event_jlFacebookMouseExited

    private void jlWebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlWebMouseEntered

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/img/icon-web-64px.png")); //pones la ruta de la imagen
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(57, 64, Image.SCALE_DEFAULT));
        jlWeb.setIcon(fondo7);
    }//GEN-LAST:event_jlWebMouseEntered

    private void jlWebMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlWebMouseExited

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/img/icon-web.png")); //pones la ruta de la imagen
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(43, 48, Image.SCALE_DEFAULT));
        jlWeb.setIcon(fondo7);

    }//GEN-LAST:event_jlWebMouseExited

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

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
    public java.awt.Button btnGuardaCliente_IC;
    public java.awt.Button btnModoNocturno;
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup_Genero;
    private com.toedter.calendar.JDayChooser jDayChooser1;
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
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupPanelProducto;
    public javax.swing.JPopupMenu jPopupTablaProducto;
    public javax.swing.JPopupMenu jPopupTableCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JSlider jSlAltura;
    public javax.swing.JSlider jSlCC;
    public javax.swing.JSlider jSlEdad;
    public javax.swing.JSlider jSlPeso;
    public javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JComboBox<String> jcbBusquedas;
    public javax.swing.JComboBox<String> jcbIntencidadEntrenamiento;
    public javax.swing.JComboBox<String> jcbObjetivo;
    public com.toedter.calendar.JDateChooser jdFechaFinMes;
    public com.toedter.calendar.JDateChooser jdFechaNacimiento;
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
    public javax.swing.JLabel lbBarraIMC;
    public javax.swing.JLabel lbCaloriasCarbono;
    public javax.swing.JLabel lbCaloriasGrasa;
    public javax.swing.JLabel lbCaloriasProteina;
    public javax.swing.JLabel lbCerrarSesion;
    public javax.swing.JLabel lbEliminarrProducto;
    public javax.swing.JLabel lbEliminarrProducto1;
    public javax.swing.JLabel lbEliminarrProducto2;
    public javax.swing.JLabel lbEliminarrProducto3;
    public javax.swing.JLabel lbEliminarrProducto4;
    public javax.swing.JLabel lbEliminarrProducto5;
    public javax.swing.JLabel lbEliminarrProducto6;
    public javax.swing.JLabel lbFemeninoColor;
    public javax.swing.JLabel lbGramosCarbohidrato;
    public javax.swing.JLabel lbGramosGrasa;
    public javax.swing.JLabel lbGramosProteina;
    public javax.swing.JLabel lbGuardarProducto;
    public javax.swing.JLabel lbGuardarProducto1;
    public javax.swing.JLabel lbGuardarProducto2;
    public javax.swing.JLabel lbGuardarProducto3;
    public javax.swing.JLabel lbMasculinoColor;
    public javax.swing.JLabel lbMinimizarVentana;
    public javax.swing.JLabel lbModificarProducto;
    public javax.swing.JLabel lbModificarProducto1;
    public javax.swing.JLabel lbModificarProducto2;
    public javax.swing.JLabel lbModificarProducto3;
    public javax.swing.JLabel lbModificarProducto4;
    public javax.swing.JLabel lbModificarProducto5;
    public javax.swing.JLabel lbModificarProducto6;
    public javax.swing.JLabel lbNombreUsuario;
    public javax.swing.JLabel lbResultadoGC;
    public javax.swing.JLabel lbResultadoIMC;
    public javax.swing.JLabel lbResultadoTMB;
    public javax.swing.JLabel lbResultadoTMBObjetivo;
    public javax.swing.JLabel lbSalirSistema;
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
    public javax.swing.JTable tlbProductos;
    public javax.swing.JTable tlbUsuario;
    public javax.swing.JTextField txtAltura;
    public javax.swing.JTextField txtApiNom;
    public javax.swing.JTextField txtBuscarCliente;
    public javax.swing.JTextField txtBuscarProducto;
    public javax.swing.JTextField txtCC;
    public javax.swing.JTextField txtCantidadProducto;
    public javax.swing.JTextField txtCodigoProducto;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtCostoProducto;
    public javax.swing.JTextField txtDias;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtEdadCalculadora;
    public javax.swing.JTextField txtEnfermedad;
    public javax.swing.JLabel txtFecha;
    public javax.swing.JLabel txtHora;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtNumTelefono;
    public javax.swing.JTextField txtPago;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtVentaProducto;
    // End of variables declaration//GEN-END:variables
}

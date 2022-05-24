package Controlador;

import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_GREEN;
import static Controlador.Crl_cliente.ANSI_RESET;
import static Controlador.Crl_cliente.ANSI_YELLOW;
import Modelo.Conexion;
import Modelo.Crud_producto;
import Modelo.Producto;
import Vista.Frm_Pantalla_Principal;
import Vista.Frm_venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Crl_producto implements ActionListener, KeyListener, MouseListener, ItemListener {

    Frm_Pantalla_Principal frm_pantalla_principal;
    Frm_venta frm_venta;
    Producto producto;
    Crud_producto mod_producto;

    public Crl_producto(Frm_Pantalla_Principal frm_pantalla_principal, Frm_venta frm_venta, Producto producto, Crud_producto mod_producto) {

        this.frm_pantalla_principal = frm_pantalla_principal;
        this.frm_venta = frm_venta;
        this.producto = producto;
        this.mod_producto = mod_producto;

        this.frm_pantalla_principal.txtBuscarProducto.addKeyListener(this);
        this.frm_pantalla_principal.jcbFiltrar.addItemListener(this);

        this.frm_venta.txtBuscadorProductosVentas.addKeyListener(this);

        frm_pantalla_principal.lbCerrarSesion.addMouseListener(this);
        frm_pantalla_principal.lbVender.addMouseListener(this);
        frm_pantalla_principal.popuItemEliminarProducto.addMouseListener(this);
        frm_pantalla_principal.popuItemModificarProducto.addMouseListener(this);
        frm_pantalla_principal.popuItemLimpiarProducto.addMouseListener(this);
        frm_pantalla_principal.popuItemLimpiarProductoPanel.addMouseListener(this);
        frm_pantalla_principal.lbGuardarProducto.addMouseListener(this);
        frm_pantalla_principal.lbModificarProducto.addMouseListener(this);
        frm_pantalla_principal.lbEliminarrProducto.addMouseListener(this);
        frm_pantalla_principal.lbGenerarPDFProducto.addMouseListener(this);
        frm_pantalla_principal.lbLimpiarProducto.addMouseListener(this);

        frm_venta.lbSalirVenta.addMouseListener(this);

        refrescarTabla();
        capital();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public java.sql.Date FechaActual() {

        //FECHA ACTUAL
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaActual;

        try {

            fechaActual = formato.parse(frm_pantalla_principal.txtFecha.getText());

            long fechaActualDia = fechaActual.getTime();
            java.sql.Date fechaActualDiaDate = new java.sql.Date(fechaActualDia);

            return fechaActualDiaDate;

        } catch (ParseException ex) {

            Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }

    //capital de la tienda
    public void capital() {

        PreparedStatement ps = null;

        ResultSet rs = null;

        ResultSetMetaData rmtd = null;

        Conexion conn = new Conexion();

        Connection con = conn.getConexion();

        String sql = "SELECT SUM(Cantidad*Costo) as resultado FROM producto";

        try {
            //SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Nombre
            //SELECT SUM(cantidad*precio) as resultado FROM productos_carrito_compra

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rmtd = rs.getMetaData();

            while (rs.next()) {

                double totalCapital = rs.getDouble(1);

                System.out.println("Capital Total: " + totalCapital);

                frm_pantalla_principal.lbCapital.setText("CAPITAL: " + String.valueOf(totalCapital) + "$");

            }

        } catch (SQLException ex) {

            Logger.getLogger(Crl_producto.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    //Cantidad de produtos
    public void cantidadDeProcutos() {

        PreparedStatement ps = null;

        ResultSet rs = null;

        ResultSetMetaData rmtd = null;

        Conexion conn = new Conexion();

        Connection con = conn.getConexion();

        String sql = "SELECT SUM(Cantidad) as resultado FROM producto";

        try {
            //SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Nombre
            //SELECT SUM(cantidad*precio) as resultado FROM productos_carrito_compra

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rmtd = rs.getMetaData();

            while (rs.next()) {

                int totalCantidad = rs.getInt(1);

                System.out.println("Cantidad de productos: " + totalCantidad);

                frm_pantalla_principal.lbCantidadDeProductos.setText("CANT PRODUCTOS: " + String.valueOf(totalCantidad));

            }

        } catch (SQLException ex) {

            Logger.getLogger(Crl_producto.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    //refresca la tabla
    public void refrescarTabla() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();

            frm_pantalla_principal.tlbProductos.setModel(modelo);
            frm_venta.tlbStockPantallaVenta.setModel(modelo); // tabla de la interfaz de ventas

            PreparedStatement ps = null;

            ResultSet rs = null;

            Conexion conn = new Conexion();

            Connection con = conn.getConexion();

            String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Nombre";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

            int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

            modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
            modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
            modelo.addColumn("Nombre");
            modelo.addColumn("Costo");
            modelo.addColumn("Venta");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Fecha");

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

        System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
        System.out.println(ANSI_CYAN + "----------------------------------------------------------");

        TamañoColumnasCliente();
        capital();
        cantidadDeProcutos();
    }

    //cuando se refresca se hace llamado a este metodo para que la tabla adquiera un tamaño fijo 
    public void TamañoColumnasCliente() {

        TableColumnModel columnModel = frm_pantalla_principal.tlbProductos.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(15);
        columnModel.getColumn(1).setPreferredWidth(60);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(40);
        columnModel.getColumn(4).setPreferredWidth(40);
        columnModel.getColumn(5).setPreferredWidth(40);
        columnModel.getColumn(6).setPreferredWidth(40);

        TableColumnModel columnModelVentas = frm_venta.tlbStockPantallaVenta.getColumnModel();

        columnModelVentas.getColumn(0).setPreferredWidth(15);
        columnModelVentas.getColumn(1).setPreferredWidth(60);
        columnModelVentas.getColumn(2).setPreferredWidth(100);
        columnModelVentas.getColumn(3).setPreferredWidth(40);
        columnModelVentas.getColumn(4).setPreferredWidth(40);
        columnModelVentas.getColumn(5).setPreferredWidth(40);
        columnModelVentas.getColumn(6).setPreferredWidth(40);

        System.out.println(ANSI_YELLOW + "---ACOMODANDO TAMAÑO COLUMNAS TABLA: producto---");
        System.out.println(ANSI_YELLOW + "---ACOMODANDO TAMAÑO COLUMNAS TABLA: ventas---");
        System.out.println(ANSI_CYAN + "----------------------------------------------------------");

    }

    //a la hora de la busqueda dependiendo del tipo de busqueda filtra por "NOMBRE"
    public void FiltrarDatosNombre(String valor) {

        String[] titulos = {"Id", "Codigo", "Nombre", "Costo", "Venta", "Cantidad", "Fecha"};
        String[] registros = new String[8];

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from producto where Nombre like '%" + valor + "%'    ";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Codigo");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Costo");
                registros[4] = rs.getString("Venta");
                registros[5] = rs.getString("Cantidad");
                registros[6] = rs.getString("Fecha");

                modelo.addRow(registros);

            }

            frm_pantalla_principal.tlbProductos.setModel(modelo);
            TamañoColumnasCliente();
            
            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    //a la hora de la busqueda dependiendo del tipo de busqueda filtra por "CODIGO"
    public void FiltrarDatosCodigo(String valor) {

        String[] titulos = {"Id", "Codigo", "Nombre", "Costo", "Venta", "Cantidad", "Fecha"};
        String[] registros = new String[8];

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from producto where Codigo like '%" + valor + "%'    ";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Codigo");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Costo");
                registros[4] = rs.getString("Venta");
                registros[5] = rs.getString("Cantidad");
                registros[6] = rs.getString("Fecha");

                modelo.addRow(registros);

            }

            frm_pantalla_principal.tlbProductos.setModel(modelo);
            TamañoColumnasCliente();
            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    //a la hora de buscar dependiendo del tipo de busqueda filtra por "NOMBRE" en la ventana "VENTAS"
    public void FiltrarDatosNombreVentas(String valor) {

        String[] titulos = {"Id", "Codigo", "Nombre", "Costo", "Venta", "Cantidad", "Fecha"};
        String[] registros = new String[8];

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from producto where Nombre like '%" + valor + "%'    ";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Codigo");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Costo");
                registros[4] = rs.getString("Venta");
                registros[5] = rs.getString("Cantidad");
                registros[6] = rs.getString("Fecha");

                modelo.addRow(registros);

            }

            frm_venta.tlbStockPantallaVenta.setModel(modelo);
            TamañoColumnasCliente();
            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void FiltrarDatosCodigoVentas(String valor) {

        String[] titulos = {"Id", "Codigo", "Nombre", "Costo", "Venta", "Cantidad", "Fecha"};
        String[] registros = new String[8];

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from producto where Codigo like '%" + valor + "%'    ";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Codigo");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Costo");
                registros[4] = rs.getString("Venta");
                registros[5] = rs.getString("Cantidad");
                registros[6] = rs.getString("Fecha");

                modelo.addRow(registros);

            }

            frm_venta.tlbStockPantallaVenta.setModel(modelo);
            TamañoColumnasCliente();
            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    //limpia los campos de texto
    public void limpiarProductos() {
        frm_pantalla_principal.txtNombreProducto.setText("");
        frm_pantalla_principal.txtCodigoProducto.setText("");
        frm_pantalla_principal.txtCostoProducto.setText("");
        frm_pantalla_principal.txtVentaProducto.setText("");
        frm_pantalla_principal.txtCantidadProducto.setText("");
        frm_pantalla_principal.txtIdProducto.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        String metodoBusqueda = frm_pantalla_principal.jcbBusquedas.getSelectedItem().toString();

        if (metodoBusqueda.equals("Codigo")) {

            System.out.println(".......esta buscando por codigo..........");
            FiltrarDatosCodigo(frm_pantalla_principal.txtBuscarProducto.getText());
            System.out.println(ANSI_GREEN + "Buscando Producto: " + ANSI_RESET + frm_pantalla_principal.txtBuscarProducto.getText());

        } else if (metodoBusqueda.equals("Nombre")) {
            System.out.println(".......esta buscando por nombre..........");
            FiltrarDatosNombre(frm_pantalla_principal.txtBuscarProducto.getText());
            System.out.println(ANSI_GREEN + "Buscando Producto: " + ANSI_RESET + frm_pantalla_principal.txtBuscarProducto.getText());
        }

        //Nombre Producto, Codigo
        String metodoBusquedaVenta = frm_venta.jcbTipoDeBusqueda.getSelectedItem().toString();

        if (metodoBusquedaVenta.equals("Nombre Producto")) {

            System.out.println(".......esta buscando por nombre en la ventana ventas..........");
            FiltrarDatosNombreVentas(frm_venta.txtBuscadorProductosVentas.getText());
            System.out.println(ANSI_GREEN + "Buscando Producto: " + ANSI_RESET + frm_venta.txtBuscadorProductosVentas.getText());

        } else if (metodoBusquedaVenta.equals("Codigo de Barra")) {

            System.out.println(".......esta buscando por codigo en la ventana ventas..........");
            FiltrarDatosCodigoVentas(frm_venta.txtBuscadorProductosVentas.getText());
            System.out.println(ANSI_GREEN + "Buscando Producto: " + ANSI_RESET + frm_venta.txtBuscadorProductosVentas.getText());

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_venta.lbSalirVenta) {

            frm_venta.setVisible(false);

        }

        if (e.getSource() == frm_pantalla_principal.lbVender) {

            frm_venta.setVisible(true);
            frm_venta.setLocationRelativeTo(null);

        }

        if (e.getSource() == frm_pantalla_principal.lbGuardarProducto) {

            producto.setCodigo_producto(frm_pantalla_principal.txtCodigoProducto.getText());
            producto.setNombre_producto(frm_pantalla_principal.txtNombreProducto.getText());
            producto.setCosto_producto(Double.parseDouble(frm_pantalla_principal.txtCostoProducto.getText()));
            producto.setVenta_producto(Double.parseDouble(frm_pantalla_principal.txtVentaProducto.getText()));
            producto.setCantidad_producto(Integer.parseInt(frm_pantalla_principal.txtCantidadProducto.getText()));
            producto.setFecha_producto(FechaActual());

            if (mod_producto.guardar(producto)) {

                System.out.println(ANSI_GREEN + "-Producto Guardado." + ANSI_RESET);

                System.out.println(ANSI_YELLOW + "---PRODUCTO---");

                JOptionPane.showMessageDialog(null, "SE GUARDO EL PRODUCTO.");

                System.out.println(ANSI_GREEN + "-Codigo: " + ANSI_RESET + frm_pantalla_principal.txtCodigoProducto.getText()
                        + ANSI_GREEN + " Nombre: " + ANSI_RESET + frm_pantalla_principal.txtNombreProducto.getText());
                System.out.println(ANSI_GREEN + "-Costo: " + ANSI_RESET + frm_pantalla_principal.txtCostoProducto.getText()
                        + ANSI_GREEN + " Venta: " + ANSI_RESET + frm_pantalla_principal.txtVentaProducto.getText());
                System.out.println(ANSI_GREEN + "-Cantidad: " + ANSI_RESET + frm_pantalla_principal.txtCantidadProducto.getText()
                        + ANSI_GREEN + " Fecha: " + ANSI_RESET + FechaActual());

                System.out.println(ANSI_CYAN + "----------------------------------------------------------");
                refrescarTabla();
                limpiarProductos();

            } else {

                System.out.println("Producto NO Guardado.");

            }

        }

        if (e.getSource() == frm_pantalla_principal.lbModificarProducto) {

            producto.setCodigo_producto(frm_pantalla_principal.txtCodigoProducto.getText());
            producto.setNombre_producto(frm_pantalla_principal.txtNombreProducto.getText());
            producto.setCosto_producto(Double.parseDouble(frm_pantalla_principal.txtCostoProducto.getText()));
            producto.setVenta_producto(Double.parseDouble(frm_pantalla_principal.txtVentaProducto.getText()));
            producto.setCantidad_producto(Integer.parseInt(frm_pantalla_principal.txtCantidadProducto.getText()));
            producto.setFecha_producto(FechaActual());
            producto.setId_producto(Integer.parseInt(frm_pantalla_principal.txtIdProducto.getText()));

            if (mod_producto.modificar(producto)) {

                System.out.println("se modifico");

                limpiarProductos();

            } else {

                System.out.println("no se modifico");

                limpiarProductos();
            }

        }

        if (e.getSource() == frm_pantalla_principal.lbEliminarrProducto) {

            String id = frm_pantalla_principal.txtIdProducto.getText();

            int p = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere borrar este producto?", "Elija una de las opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE); //devuelve un valor entero si=0, no=1, calcel=2

            if (p == 0) {

                producto.setId_producto(Integer.parseInt(frm_pantalla_principal.txtIdProducto.getText()));

                if (mod_producto.eliminar(producto)) {

                    System.out.println("se elimino con exito el producto");
                    limpiarProductos();

                } else {

                    System.out.println("no paso un choto");
                    limpiarProductos();

                }

            }

        }

        if (e.getSource() == frm_pantalla_principal.lbGenerarPDFProducto) {

        }

        if (e.getSource() == frm_pantalla_principal.lbLimpiarProducto) {

            limpiarProductos();

        }

        if (e.getSource() == frm_pantalla_principal.popuItemLimpiarProductoPanel) {
            limpiarProductos();
        }

        if (e.getSource() == frm_pantalla_principal.popuItemLimpiarProducto) {
            limpiarProductos();
        }

        if (e.getSource() == frm_pantalla_principal.popuItemEliminarProducto) {

            String id = frm_pantalla_principal.txtIdProducto.getText();

            int p = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere borrar este producto?", "Elija una de las opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE); //devuelve un valor entero si=0, no=1, calcel=2

            if (p == 0) {

                producto.setId_producto(Integer.parseInt(frm_pantalla_principal.txtIdProducto.getText()));

                if (mod_producto.eliminar(producto)) {

                    System.out.println("Se elimino con exito.");
                    limpiarProductos();

                } else {

                    System.out.println("No se pudo eliminar.");
                    limpiarProductos();

                }

            }

        }

        if (e.getSource() == frm_pantalla_principal.popuItemModificarProducto) {

            producto.setCodigo_producto(frm_pantalla_principal.txtCodigoProducto.getText());
            producto.setNombre_producto(frm_pantalla_principal.txtNombreProducto.getText());
            producto.setCosto_producto(Double.parseDouble(frm_pantalla_principal.txtCostoProducto.getText()));
            producto.setVenta_producto(Double.parseDouble(frm_pantalla_principal.txtVentaProducto.getText()));
            producto.setCantidad_producto(Integer.parseInt(frm_pantalla_principal.txtCantidadProducto.getText()));
            producto.setFecha_producto(FechaActual());
            producto.setId_producto(Integer.parseInt(frm_pantalla_principal.txtIdProducto.getText()));

            if (mod_producto.modificar(producto)) {

                System.out.println("Se modifico con exito.");

                limpiarProductos();

            } else {

                System.out.println("No se pudo modificar.");

                limpiarProductos();
            }

        }

        refrescarTabla();

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

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == frm_pantalla_principal.jcbFiltrar) {

            String filtro = frm_pantalla_principal.jcbFiltrar.getSelectedItem().toString();

            System.out.println(filtro);

            //NOMBRE(DES), NOMBRE(ACE), CANTIDAD(DES), CANTIDAD(ACE), COSTO(DES), COSTO(ACE), VENTA(DES), VENTA(ACE)
            if (filtro.equals("NOMBRE(DES)")) {

                System.out.println("NOMBRE DESENDENTE");

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Nombre DESC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            } else if (filtro.equals("NOMBRE(ACE)")) {

                System.out.println("NOMBRE ACENDENTE");

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Nombre ASC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            } else if (filtro.equals("CANTIDAD(DES)")) {

                System.out.println("CANTIDAD DESENDENTE");

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Cantidad DESC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            } else if (filtro.equals("CANTIDAD(ACE)")) {

                System.out.println("CANTIDAD ACENDENTE");

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Cantidad ASC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            } else if (filtro.equals("COSTO(DES)")) {

                System.out.println("COSTO DECENDENTE");

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Costo DESC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            } else if (filtro.equals("COSTO(ACE)")) {

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Costo ASC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            } else if (filtro.equals("VENTA(DES)")) {

                System.out.println("VENTA DECENDENTE");

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Venta DESC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            } else if (filtro.equals("VENTA(ACE)")) {

                System.out.println("VENTA ACENDENTE");

                try {

                    DefaultTableModel modelo = new DefaultTableModel();

                    frm_pantalla_principal.tlbProductos.setModel(modelo);

                    PreparedStatement ps = null;

                    ResultSet rs = null;

                    Conexion conn = new Conexion();

                    Connection con = conn.getConexion();

                    String sql = "SELECT Id,Codigo,Nombre,Costo,Venta,Cantidad,Fecha FROM producto ORDER BY Venta ASC";

                    ps = con.prepareStatement(sql);

                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

                    int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

                    modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
                    modelo.addColumn("Codigo");//por eso los tenemos que reasignar.
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Costo");
                    modelo.addColumn("Venta");
                    modelo.addColumn("Cantidad");
                    modelo.addColumn("Fecha");

                    while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {

                            filas[i] = rs.getObject(i + 1); //trae fila por fila

                        }

                        modelo.addRow(filas); //guarda en la tabla el vector que guardo todos los datos de la base de datos

                    }

                } catch (SQLException r) {

                    System.out.println(r);

                }

                System.out.println(ANSI_YELLOW + "---TABLA REFRESCADA: producto---");
                System.out.println(ANSI_CYAN + "----------------------------------------------------------");

                TamañoColumnasCliente();

            }

        }

    }

}

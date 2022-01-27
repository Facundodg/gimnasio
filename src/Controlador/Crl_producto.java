package Controlador;

import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_GREEN;
import static Controlador.Crl_cliente.ANSI_RESET;
import static Controlador.Crl_cliente.ANSI_YELLOW;
import Modelo.Conexion;
import Modelo.Crud_producto;
import Modelo.Producto;
import Vista.Frm_Pantalla_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class Crl_producto implements ActionListener, KeyListener, MouseListener {

    Frm_Pantalla_Principal frm_pantalla_principal;
    Producto producto;
    Crud_producto mod_producto;

    public Crl_producto(Frm_Pantalla_Principal frm_pantalla_principal, Producto producto, Crud_producto mod_producto) {
        this.frm_pantalla_principal = frm_pantalla_principal;
        this.producto = producto;
        this.mod_producto = mod_producto;

        this.frm_pantalla_principal.txtBuscarProducto.addKeyListener(this);

        frm_pantalla_principal.lbCerrarSesion.addMouseListener(this);
        frm_pantalla_principal.popuItemEliminarProducto.addMouseListener(this);
        frm_pantalla_principal.popuItemModificarProducto.addMouseListener(this);
        frm_pantalla_principal.popuItemLimpiarProducto.addMouseListener(this);
        frm_pantalla_principal.popuItemLimpiarProductoPanel.addMouseListener(this);
        frm_pantalla_principal.lbGuardarProducto.addMouseListener(this);

        refrescarTabla();
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

    public void refrescarTabla() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();

            frm_pantalla_principal.tlbProductos.setModel(modelo);

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
    }

    public void TamañoColumnasCliente() {

        TableColumnModel columnModel = frm_pantalla_principal.tlbProductos.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(15);
        columnModel.getColumn(1).setPreferredWidth(60);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(40);
        columnModel.getColumn(4).setPreferredWidth(40);
        columnModel.getColumn(5).setPreferredWidth(40);
        columnModel.getColumn(6).setPreferredWidth(40);

        System.out.println(ANSI_YELLOW + "---ACOMODANDO TAMAÑO COLUMNAS TABLA: producto---");
        System.out.println(ANSI_CYAN + "----------------------------------------------------------");

    }

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

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

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

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

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

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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

                    System.out.println("se elimino con exito el producto");
                    limpiarProductos();

                } else {

                    System.out.println("no paso un choto");
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

                System.out.println("se modifico");

                limpiarProductos();

            } else {

                System.out.println("no se modifico");

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

}
package Controlador;

import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_YELLOW;
import Modelo.Carrito;
import Modelo.Conexion;
import Servicios.Crud_carrito;
import Servicios.Crud_producto;
import Modelo.Producto;
import Vista.Frm_Pantalla_Principal;
import Vista.Frm_factura;
import Vista.Frm_venta;
import Vista.impresion;
import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Crl_carrito implements MouseListener {

    Frm_Pantalla_Principal frm_pantalla_principal;
    Frm_factura frm_factura;
    impresion imp;
    Frm_venta frm_venta;
    Producto producto;
    Crud_producto mod_producto;
    Crud_carrito crud_carrito;
    Carrito carrito;

    Button b1 = new Button("Imprimir");
    Button b2 = new Button("Salir");

    public Crl_carrito(Frm_Pantalla_Principal frm_pantalla_principal,
            Frm_factura frm_factura,
            impresion imp,
            Frm_venta frm_venta, Producto producto,
            Crud_producto mod_producto,
            Crud_carrito crud_carrito, Carrito carrito) {

        this.frm_pantalla_principal = frm_pantalla_principal;
        this.frm_factura = frm_factura;
        this.imp = imp;
        this.frm_venta = frm_venta;
        this.producto = producto;
        this.mod_producto = mod_producto;
        this.crud_carrito = crud_carrito;
        this.carrito = carrito;

        frm_venta.lbVenderProductos.addMouseListener(this);

        b1.addMouseListener(this);
        b1.setBounds(260, 570, 260, 50);
        b1.setVisible(true);

        b2.addMouseListener(this);
        b2.setBounds(0, 570, 260, 50);
        b2.setVisible(true);

    }

    //ESTE METODO HACE CONTACTO CON EL SERVICIO CRUD_CARRITO
    public void generarVenta() {

        String codigo;
        int cantidad;
        String nombre;
        double venta, total;

        int contar = frm_venta.tlbCarrito.getRowCount();

        System.out.println("---------------------TICKET-------------------------");

        for (int i = 0; i < contar; i++) {

            codigo = frm_venta.tlbCarrito.getValueAt(i, 0).toString();
            nombre = frm_venta.tlbCarrito.getValueAt(i, 1).toString();
            cantidad = Integer.parseInt(frm_venta.tlbCarrito.getValueAt(i, 2).toString());
            venta = Double.parseDouble(frm_venta.tlbCarrito.getValueAt(i, 3).toString());
            total = Double.parseDouble(frm_venta.tlbCarrito.getValueAt(i, 4).toString());

            if (crud_carrito.restarCantidad(cantidad, codigo)) {

                System.out.println("se resto con exito del stock.");

            } else {

                JOptionPane.showMessageDialog(null, "ALGO PASO!! NO SE PUDO RESTAR LOS PRODUCTOS");

            }

        }

        System.out.println(frm_venta.lbGananciaTotalVenta.getText());
        System.out.println(frm_venta.lbTotal.getText());

        refrescarTabla();
        //limpiaCarrito();

        System.out.println("----------------------------------------------");

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

    //METODO PARA LIMPIAR CARRITO
    public void limpiaCarrito() {

        DefaultTableModel m = new DefaultTableModel();

        int filas = m.getRowCount();

        m.addColumn("Codigo");
        m.addColumn("Nombre");
        m.addColumn("Cantidad");
        m.addColumn("Costo");
        m.addColumn("Venta");
        m.addColumn("Total");

        for (int i = 0; i < filas; i++) {

            m.removeRow(0);

        }

        frm_venta.tlbCarrito.setModel(m);
        frm_venta.lbTotal.setText("TOTAL: " + ActualizaTotal() + "$");
        frm_venta.lbGananciaTotalVenta.setText("GANANCIA: " + ActualizarGanancia() + "$");
        frm_venta.txtCantidadProductosVentas.setText("1");

    }

    //METODO PARA LIMPIAR FACTURA
    public void limpiaFactura() {

        DefaultTableModel m = new DefaultTableModel();

        int filas = m.getRowCount();

        m.addColumn("Nombre");
        m.addColumn("Cantidad");
        m.addColumn("Precio");
        m.addColumn("Total");

        for (int i = 0; i < filas; i++) {

            m.removeRow(0);

        }

        imp.tlbFactura.setModel(m);

    }

    //METODO DE ACTUALIZAR LA GANANCIA
    public double ActualizarGanancia() {

        int contar = frm_venta.tlbCarrito.getRowCount();

        double gananciaTotal = 0.0;

        double ganancia = 0.0;

        double costo = 0.0;

        int cantidad = 0;

        for (int i = 0; i < contar; i++) {

            //ganancia = ganancia + Double.parseDouble(frm_venta.tlbCarrito.getValueAt(i, 5).toString());
            cantidad = Integer.parseInt(frm_venta.tlbCarrito.getValueAt(i, 2).toString());

            costo = Double.parseDouble(frm_venta.tlbCarrito.getValueAt(i, 3).toString());

            ganancia = Double.parseDouble(frm_venta.tlbCarrito.getValueAt(i, 4).toString());

            gananciaTotal = gananciaTotal + ((ganancia - costo) * cantidad);

            ganancia = 0.0;

            costo = 0.0;

            cantidad = 0;

        }

        return gananciaTotal;

    }

    //METODO DE ACTUALIZAR TOTAL
    public double ActualizaTotal() {

        int contar = frm_venta.tlbCarrito.getRowCount();

        double suma = 0.0;

        for (int i = 0; i < contar; i++) {

            suma = suma + Double.parseDouble(frm_venta.tlbCarrito.getValueAt(i, 5).toString());

        }

        return suma;

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

        //TamañoColumnasCliente();
        capital();
        cantidadDeProcutos();
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

    //mostrar factura
    public void factura() {

        DefaultTableModel m;
        m = (DefaultTableModel) imp.tlbFactura.getModel();

        imp.lbTotalFactura.setText(frm_venta.lbTotal.getText());
        imp.lbFechaFactura.setText(frm_pantalla_principal.txtFecha.getText());
        imp.lbHoraFactura.setText(frm_pantalla_principal.txtHora.getText());

        int contar = frm_venta.tlbCarrito.getRowCount();

        String[] fila = new String[4];

        for (int i = 0; i < contar; i++) {

            fila[0] = frm_venta.tlbCarrito.getValueAt(i, 1).toString();
            fila[1] = frm_venta.tlbCarrito.getValueAt(i, 2).toString();
            fila[2] = frm_venta.tlbCarrito.getValueAt(i, 4).toString();
            fila[3] = frm_venta.tlbCarrito.getValueAt(i, 5).toString();

            System.out.println("fila " + i + ":" + fila[i]);

            m.addRow(fila);

        }

        frm_factura.setContentPane(imp);
        frm_factura.add(b1);
        frm_factura.add(b2);

        frm_factura.setVisible(true);
        frm_factura.setLocationRelativeTo(null);

    }

    //IMPRIMIR FACTURA
    public void imprimir() {

        PrinterJob job = PrinterJob.getPrinterJob();

        job.setPrintable(imp);
        
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Crl_carrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
            JOptionPane.showMessageDialog(null, "No se pudo imprimir.");
            
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_venta.lbVenderProductos) {

            limpiaFactura();
            generarVenta();
            JOptionPane.showMessageDialog(null, "SE GENERO LA COMPRA");
            factura();
            limpiaCarrito();

        }

        if (e.getSource() == b1) {
            
            imprimir(); 

        }

        if (e.getSource() == b2) {

            limpiaFactura();
            frm_factura.setVisible(false);

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

package Controlador;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Crud_cliente;
import Modelo.Crud_dias;
import Modelo.Crud_fecha;
import Modelo.Dia;
import Modelo.Fecha;
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
import static java.time.Instant.now;
import static java.time.Instant.now;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Crl_cliente implements ActionListener, KeyListener, MouseListener {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    Frm_Pantalla_Principal frm_pantalla_principal;
    Cliente cliente;
    Crud_cliente mod_cliente;
    Crud_dias mod_dias;
    Crud_fecha mod_fecha;
    Fecha fecha;
    Dia dia;

    public Crl_cliente(Frm_Pantalla_Principal frm_pantalla_principal, Cliente cliente, Crud_cliente mod_cliente, Crud_dias mod_dias, Crud_fecha mod_fecha, Fecha fecha, Dia dia) {

        this.frm_pantalla_principal = frm_pantalla_principal;
        this.cliente = cliente;
        this.mod_cliente = mod_cliente;
        this.mod_dias = mod_dias;
        this.mod_fecha = mod_fecha;
        this.fecha = fecha;
        this.dia = dia;

        frm_pantalla_principal.btnGuardaCliente_IC.addActionListener(this);

        frm_pantalla_principal.txtBuscarCliente.addKeyListener(this);
        frm_pantalla_principal.popuItemEliminarCliente.addMouseListener(this);
        frm_pantalla_principal.popuItemLimpiarCliente.addMouseListener(this);
        frm_pantalla_principal.popuItemGuardarCliente.addMouseListener(this);

        RestarDiasCliente();
        traerFechaHoyAyer();
        refrescarTabla();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //GUARDAR CLIENTE
        if (e.getSource() == frm_pantalla_principal.btnGuardaCliente_IC) {

            //APELLIDO Y NOMBRE
            cliente.setNomApi(frm_pantalla_principal.txtApiNom.getText());

            //TELEFONO
            cliente.setTelefono(Integer.parseInt(frm_pantalla_principal.txtNumTelefono.getText()));

            //DNI
            cliente.setDni(Integer.parseInt(frm_pantalla_principal.txtDni.getText()));

            //DIRECCION DE CASA
            cliente.setDireccion(frm_pantalla_principal.txtDireccion.getText());

            //CORREO ELECTRONICO
            cliente.setCorreo(frm_pantalla_principal.txtCorreo.getText());

            //ENFERMEDAD
            cliente.setEnfermedad(frm_pantalla_principal.txtEnfermedad.getText());

            //SI SE MEDICA O NO
            String medicaSiNo = frm_pantalla_principal.JcbMedicaSiNo.getSelectedItem().toString();
            cliente.setMedicaSiNo(medicaSiNo);

            //SEXO
            String genero = "";
            if (frm_pantalla_principal.jrbHombre.getLabel().equals("Hombre")) {
                genero = "Hombre";
                cliente.setSexo(genero);
            } else if (frm_pantalla_principal.jrbHombre.getLabel().equals("Mujer")) {
                genero = "Mujer";
                cliente.setSexo(genero);
            } else if (frm_pantalla_principal.jrbHombre.getLabel().equals("Otro")) {
                genero = "Otro";
                cliente.setSexo(genero);
            }

            //FECHA ACTUAL
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            Date fechaActual;

            try {

                fechaActual = formato.parse(frm_pantalla_principal.txtFecha.getText());

                long fechaActualDia = fechaActual.getTime();
                java.sql.Date fechaActualDiaDate = new java.sql.Date(fechaActualDia);

                cliente.setFechaActual(fechaActualDiaDate);

            } catch (ParseException ex) {

                Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

            }

            //FECHA DE FIN DE MES
            Date fechaFinMes = (Date) frm_pantalla_principal.jdFechaFinMes.getDate();
            long finmes = fechaFinMes.getTime();
            java.sql.Date fecha = new java.sql.Date(finmes);
            cliente.setFechafinDeMes(fecha);

            //DIAS QUE LE QUEDAN DE LA CUOTA
            Date fechaActualCompara;

            try {
                fechaActualCompara = formato.parse(frm_pantalla_principal.txtFecha.getText());

                cliente.setDias(calcularDias(fechaActualCompara, fechaFinMes));

            } catch (ParseException ex) {

                Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

            }

            //FECHA DE NACIMIENTO
            Date fechaDeNacimiento = (Date) frm_pantalla_principal.jdFechaNacimiento.getDate();
            long nacimiento = fechaDeNacimiento.getTime();
            java.sql.Date fechaNacimiento = new java.sql.Date(nacimiento);
            cliente.setFechaNacimiento(fechaNacimiento);

            //EDAD
            try {

                fechaActualCompara = formato.parse(frm_pantalla_principal.txtFecha.getText());
                cliente.setEdad(calcularEdad(fechaActualCompara, fechaDeNacimiento));

            } catch (ParseException ex) {

                Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

            }

            //PAGO
            cliente.setPago(Double.parseDouble(frm_pantalla_principal.txtPago.getText()));

            if (mod_cliente.guardar(cliente)) {

                System.out.println(ANSI_GREEN + "-Cliente Guardado Con Exito." + ANSI_RESET);
                JOptionPane.showMessageDialog(null, "Cliente Guardado Con Exito.");

            } else {
                System.out.println(ANSI_RED + "-No se Pudo Guardar Cliente." + ANSI_RESET);
                JOptionPane.showMessageDialog(null, "No se Pudo Guardar Cliente.");
            }

            imprimeCliente(frm_pantalla_principal.txtApiNom.getText(),
                    Integer.parseInt(frm_pantalla_principal.txtNumTelefono.getText()),
                    Integer.parseInt(frm_pantalla_principal.txtDni.getText()),
                    frm_pantalla_principal.txtDireccion.getText(),
                    frm_pantalla_principal.txtCorreo.getText(),
                    frm_pantalla_principal.txtEnfermedad.getText(),
                    medicaSiNo,
                    sexo(),
                    fechaActual(),
                    frm_pantalla_principal.jdFechaFinMes.getDate(),
                    calcularDias(fechaActual(), frm_pantalla_principal.jdFechaFinMes.getDate()),
                    frm_pantalla_principal.jdFechaNacimiento.getDate(),
                    calcularEdad(fechaActual(), frm_pantalla_principal.jdFechaNacimiento.getDate()),
                    Double.parseDouble(frm_pantalla_principal.txtPago.getText()));

            refrescarTabla();
            Limpiar();

        }

    }

    //----------------------METODOS BASICOS-------------------------------------
    public int calcularDias(Date inicio, Date termina) {
        return (int) Math.abs((inicio.getTime() - termina.getTime()) / (1000 * 60 * 60 * 24));

    }

    public int calcularEdad(Date inicio, Date FechaNacimiento) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        String inicioString = sdf.format(inicio);
        String fechaNacimiento = sdf.format(FechaNacimiento);

        int inicioInt = Integer.parseInt(inicioString.substring(6, 10));
        int fechaNamientoInt = Integer.parseInt(fechaNacimiento.substring(6, 10));

        return Math.abs(inicioInt - fechaNamientoInt);

    }

    public void imprimeCliente(String NombApi, int telefono, int dni, String direccion, String correo,
            String enfermedad, String seMedicaSiNo, String sexo, Date fechaActual, Date FechaFinMes, int dias,
            Date fechaNacimiento, int edad, double pago) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaActualString = sdf.format(fechaActual);
        String fechaFinMesString = sdf.format(FechaFinMes);
        String fechaNacimientoString = sdf.format(fechaNacimiento);

        System.out.println(ANSI_YELLOW + "---DATOS CLIENTE---");
        System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + NombApi + ANSI_GREEN + " Telefono: " + ANSI_RESET + telefono + ANSI_GREEN + " Direccion: " + ANSI_RESET + direccion);
        System.out.println(ANSI_GREEN + "Correo: " + ANSI_RESET + correo + ANSI_GREEN + " Enfermedades: : " + ANSI_RESET + enfermedad + ANSI_GREEN + " Se medico SI/NO: " + ANSI_RESET + seMedicaSiNo);
        System.out.println(ANSI_GREEN + "Sexo: " + ANSI_RESET + sexo + ANSI_GREEN + " Fecha Actual: " + ANSI_RESET + fechaActualString);
        System.out.println(ANSI_GREEN + "Fecha Fin Mes: " + ANSI_RESET + fechaFinMesString + ANSI_GREEN + " Cant Dias: " + ANSI_RESET + dias);
        System.out.println(ANSI_GREEN + "Fecha Nacimiento: " + ANSI_RESET + fechaNacimientoString + ANSI_GREEN + " Edad: " + ANSI_RESET + edad);
        System.out.println(ANSI_GREEN + "Pago: " + ANSI_RESET + pago + "$");
        System.out.println(ANSI_CYAN + "----------------------------------------------------------");

    }

    public Date fechaActual() {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date fechAc = null;
        String fechaString = "";

        try {

            fechAc = formato.parse(frm_pantalla_principal.txtFecha.getText());
            fechaString = formato.format(fechAc);

        } catch (ParseException ex) {

            Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fechAc;

    }

    public String sexo() {

        String genero = "";
        if (frm_pantalla_principal.jrbHombre.getLabel().equals("Hombre")) {
            genero = "Hombre";
            cliente.setSexo(genero);
        } else if (frm_pantalla_principal.jrbHombre.getLabel().equals("Mujer")) {
            genero = "Mujer";
            cliente.setSexo(genero);
        } else if (frm_pantalla_principal.jrbHombre.getLabel().equals("Otro")) {
            genero = "Otro";
            cliente.setSexo(genero);
        }

        return genero;

    }

    public void refrescarTabla() {

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

    public void RestarDiasCliente() {

        int diasArestar = RestarDiazClientePrueba();

        for (int i = 0; i < diasArestar; i++) {

            mod_dias.DescontarDiasCliente();
            System.out.println("se desconto: " + i + " dias");

        }

    }

    public int RestarDiazClientePrueba() {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        Date FechaActualParaComparar = fechaActual();

        formato.format(FechaActualParaComparar);

        Date fechAc;

        PreparedStatement ps = null;

        ResultSet rs = null;

        Conexion conn = new Conexion();

        Connection con = conn.getConexion();

        String sql = "SELECT *FROM fecha";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            String[] fechas = new String[2];

            while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                fechas[0] = rs.getString("Fecha_ayer");
                fechas[1] = rs.getString("Fecha_hoy");

            }

            System.out.println(ANSI_GREEN + "-Fecha de hoy: " + ANSI_RESET + fechas[1]);
            System.out.println(ANSI_GREEN + "-Fecha dia anterior: " + ANSI_RESET + FechaActualParaComparar);

            try {

                fechAc = formato.parse(fechas[1]);

                System.out.println("fechaAC ES: " + fechAc);

                System.out.println(calcularDias(fechAc, FechaActualParaComparar));

                return calcularDias(FechaActualParaComparar, fechAc);

            } catch (Exception ex) {

                Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

            }

            System.out.println(ANSI_CYAN + "----------------------------------------------------------");

        } catch (SQLException e) {

            System.out.println("no anda bd");

        }

        return 0;

    }

    public void FechaActual() {

        //FECHA ACTUAL
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaActual;

        try {

            fechaActual = formato.parse(frm_pantalla_principal.txtFecha.getText());

            long fechaActualDia = fechaActual.getTime();
            java.sql.Date fechaActualDiaDate = new java.sql.Date(fechaActualDia);

            SubirFechaActual(fechaActualDiaDate);

        } catch (ParseException ex) {

            Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void SubirFechaActual(java.sql.Date fechaActual) {

        fecha.setFecha_hoy(fechaActual);
        fecha.setId(1);

        if (mod_fecha.modificar_fecha_hoy(fecha)) {

            System.out.println(ANSI_YELLOW + "---ACTUALIZO FECHA ACTUAL---");
            System.out.println(ANSI_CYAN + "----------------------------------------------------------");

        } else {

            System.out.println(ANSI_RED + "-No se Pudo Modificar Fecha Actual." + ANSI_RESET);

        }

    }

    public void traerFechaHoyAyer() {

        PreparedStatement ps = null;

        ResultSet rs = null;

        int i = 0;

        Conexion conn = new Conexion();

        Connection con = conn.getConexion();

        String sql = "SELECT *FROM fecha";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            String[] fechas = new String[2];

            System.out.println(ANSI_YELLOW + "---FECHAS TRAIDAS TABLA: FECHA---");
            while (rs.next()) { //va a ir recorriendo los datos y los ira trayendo fila por fila el ciclo while.

                fechas[i] = rs.getString("Fecha_ayer");
                fechas[i + 1] = rs.getString("Fecha_hoy");

            }

            System.out.println(ANSI_GREEN + "-Fecha de ayer: " + ANSI_RESET + fechas[0]);

            System.out.println(ANSI_GREEN + "-Fecha de hoy: " + ANSI_RESET + fechas[1]);

            System.out.println(ANSI_CYAN + "----------------------------------------------------------");

            compilaFechaActualFechaHoyFechaAyer(fechas);

        } catch (SQLException e) {

            System.out.println("no anda");

        }

    }

    public void compilaFechaActualFechaHoyFechaAyer(String fechas[]) {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        String fechaActualString = "";
        String newString2 = "";

        try {

            System.out.println(ANSI_YELLOW + "---FECHAS PARA COMPARAR---");
            Date fechaActual = formato.parse(frm_pantalla_principal.txtFecha.getText());
            fechaActualString = formato.format(fechaActual);
            String newString1 = fechaActualString.replaceFirst("/", "-");
            newString2 = newString1.replaceFirst("/", "-");

        } catch (ParseException ex) {

            Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

        }

        System.out.println(ANSI_GREEN + "-Fecha Actual: " + ANSI_RESET + newString2);
        System.out.println(ANSI_GREEN + "-Fecha de ayer: " + ANSI_RESET + fechas[0]);
        System.out.println(ANSI_GREEN + "-Fecha de hoy: " + ANSI_RESET + fechas[1]);

        comparaFechas(fechas, newString2);

    }

    public void comparaFechas(String fechas[], String newString2) {

        if (!fechas[1].equals(newString2)) {

            mod_fecha.intercambiarFechas(fecha);
            FechaActual();
            RestarDiasCliente();

        } else {

            System.out.println(ANSI_GREEN + "-NO SE DESCUENTAN DIAS NI INTERCAMBIO DE FECHAS");

        }

    }

    public void FiltrarDatosNombre(String valor) {

        String[] titulos = {"Id", "NomApe", "Correo", "DNI", "Edad", "FechaFinMes", "Dias", "Pago"};
        String[] registros = new String[8];

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from cliente where NomApe like '%" + valor + "%'    ";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("NomApe");
                registros[2] = rs.getString("Correo");
                registros[3] = rs.getString("Dni");
                registros[4] = rs.getString("Edad");
                registros[5] = rs.getString("FechaFinMes");
                registros[6] = rs.getString("Dias");
                registros[7] = rs.getString("Pago");

                modelo.addRow(registros);

            }

            frm_pantalla_principal.tlbCliente_IC.setModel(modelo);
            TamañoColumnasCliente();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void FiltrarDatosDNI(String valor) {

        String[] titulos = {"Id", "NomApe", "Correo", "DNI", "Edad", "FechaFinMes", "Dias", "Pago"};
        String[] registros = new String[8];

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from cliente where Dni like '%" + valor + "%'    ";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("NomApe");
                registros[2] = rs.getString("Correo");
                registros[3] = rs.getString("Dni");
                registros[4] = rs.getString("Edad");
                registros[5] = rs.getString("FechaFinMes");
                registros[6] = rs.getString("Dias");
                registros[7] = rs.getString("Pago");

                modelo.addRow(registros);

            }

            frm_pantalla_principal.tlbCliente_IC.setModel(modelo);
            TamañoColumnasCliente();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void Limpiar() {

        frm_pantalla_principal.txtApiNom.setText("");
        frm_pantalla_principal.txtNumTelefono.setText("");
        frm_pantalla_principal.txtDni.setText("");
        frm_pantalla_principal.txtDireccion.setText("");
        frm_pantalla_principal.txtCorreo.setText("");
        frm_pantalla_principal.txtEnfermedad.setText("");
        frm_pantalla_principal.jdFechaFinMes.setDate(null);
        frm_pantalla_principal.jdFechaNacimiento.setDate(null);
        frm_pantalla_principal.txtPago.setText("");
        frm_pantalla_principal.txtIdCliente.setText("");

    }

    //---------------------FIN DE LOS METODOS BASICOS---------------------------
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        String metodoBusqueda = frm_pantalla_principal.JcbNombreDni.getSelectedItem().toString();

        if (metodoBusqueda.equals("Nombre")) {

            System.out.println(".......Esta buscando por Nombre..........");
            FiltrarDatosNombre(frm_pantalla_principal.txtBuscarCliente.getText());
            System.out.println(ANSI_GREEN + "Buscando Producto: " + ANSI_RESET + frm_pantalla_principal.txtBuscarProducto.getText());

        } else if (metodoBusqueda.equals("DNI")) {
            System.out.println(".......Esta buscando por DNI..........");
            FiltrarDatosDNI(frm_pantalla_principal.txtBuscarCliente.getText());
            System.out.println(ANSI_GREEN + "Buscando Producto: " + ANSI_RESET + frm_pantalla_principal.txtBuscarProducto.getText());
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_pantalla_principal.popuItemEliminarCliente) {

            cliente.setDni(Integer.parseInt(frm_pantalla_principal.txtDni.getText()));

            if (mod_cliente.eliminar(cliente)) {
                JOptionPane.showMessageDialog(null, "Se Elimino Cliente.");
                refrescarTabla();
                Limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "No se elimino.");
            }

        }

        if (e.getSource() == frm_pantalla_principal.popuItemLimpiarCliente) {
            Limpiar();
        }
        
                //GUARDAR CLIENTE
        if (e.getSource() == frm_pantalla_principal.popuItemGuardarCliente) {

            //APELLIDO Y NOMBRE
            cliente.setNomApi(frm_pantalla_principal.txtApiNom.getText());

            //TELEFONO
            cliente.setTelefono(Integer.parseInt(frm_pantalla_principal.txtNumTelefono.getText()));

            //DNI
            cliente.setDni(Integer.parseInt(frm_pantalla_principal.txtDni.getText()));

            //DIRECCION DE CASA
            cliente.setDireccion(frm_pantalla_principal.txtDireccion.getText());

            //CORREO ELECTRONICO
            cliente.setCorreo(frm_pantalla_principal.txtCorreo.getText());

            //ENFERMEDAD
            cliente.setEnfermedad(frm_pantalla_principal.txtEnfermedad.getText());

            //SI SE MEDICA O NO
            String medicaSiNo = frm_pantalla_principal.JcbMedicaSiNo.getSelectedItem().toString();
            cliente.setMedicaSiNo(medicaSiNo);

            //SEXO
            String genero = "";
            if (frm_pantalla_principal.jrbHombre.getLabel().equals("Hombre")) {
                genero = "Hombre";
                cliente.setSexo(genero);
            } else if (frm_pantalla_principal.jrbHombre.getLabel().equals("Mujer")) {
                genero = "Mujer";
                cliente.setSexo(genero);
            } else if (frm_pantalla_principal.jrbHombre.getLabel().equals("Otro")) {
                genero = "Otro";
                cliente.setSexo(genero);
            }

            //FECHA ACTUAL
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            Date fechaActual;

            try {

                fechaActual = formato.parse(frm_pantalla_principal.txtFecha.getText());

                long fechaActualDia = fechaActual.getTime();
                java.sql.Date fechaActualDiaDate = new java.sql.Date(fechaActualDia);

                cliente.setFechaActual(fechaActualDiaDate);

            } catch (ParseException ex) {

                Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

            }

            //FECHA DE FIN DE MES
            Date fechaFinMes = (Date) frm_pantalla_principal.jdFechaFinMes.getDate();
            long finmes = fechaFinMes.getTime();
            java.sql.Date fecha = new java.sql.Date(finmes);
            cliente.setFechafinDeMes(fecha);

            //DIAS QUE LE QUEDAN DE LA CUOTA
            Date fechaActualCompara;

            try {
                fechaActualCompara = formato.parse(frm_pantalla_principal.txtFecha.getText());

                cliente.setDias(calcularDias(fechaActualCompara, fechaFinMes));

            } catch (ParseException ex) {

                Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

            }

            //FECHA DE NACIMIENTO
            Date fechaDeNacimiento = (Date) frm_pantalla_principal.jdFechaNacimiento.getDate();
            long nacimiento = fechaDeNacimiento.getTime();
            java.sql.Date fechaNacimiento = new java.sql.Date(nacimiento);
            cliente.setFechaNacimiento(fechaNacimiento);

            //EDAD
            try {

                fechaActualCompara = formato.parse(frm_pantalla_principal.txtFecha.getText());
                cliente.setEdad(calcularEdad(fechaActualCompara, fechaDeNacimiento));

            } catch (ParseException ex) {

                Logger.getLogger(Crl_cliente.class.getName()).log(Level.SEVERE, null, ex);

            }

            //PAGO
            cliente.setPago(Double.parseDouble(frm_pantalla_principal.txtPago.getText()));

            if (mod_cliente.guardar(cliente)) {

                System.out.println(ANSI_GREEN + "-Cliente Guardado Con Exito." + ANSI_RESET);
                JOptionPane.showMessageDialog(null, "Cliente Guardado Con Exito.");

            } else {
                System.out.println(ANSI_RED + "-No se Pudo Guardar Cliente." + ANSI_RESET);
                JOptionPane.showMessageDialog(null, "No se Pudo Guardar Cliente.");
            }

            imprimeCliente(frm_pantalla_principal.txtApiNom.getText(),
                    Integer.parseInt(frm_pantalla_principal.txtNumTelefono.getText()),
                    Integer.parseInt(frm_pantalla_principal.txtDni.getText()),
                    frm_pantalla_principal.txtDireccion.getText(),
                    frm_pantalla_principal.txtCorreo.getText(),
                    frm_pantalla_principal.txtEnfermedad.getText(),
                    medicaSiNo,
                    sexo(),
                    fechaActual(),
                    frm_pantalla_principal.jdFechaFinMes.getDate(),
                    calcularDias(fechaActual(), frm_pantalla_principal.jdFechaFinMes.getDate()),
                    frm_pantalla_principal.jdFechaNacimiento.getDate(),
                    calcularEdad(fechaActual(), frm_pantalla_principal.jdFechaNacimiento.getDate()),
                    Double.parseDouble(frm_pantalla_principal.txtPago.getText()));

            refrescarTabla();
            Limpiar();

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

package Controlador;

import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_YELLOW;
import Modelo.Conexion;
import Servicios.Crud_turno;
import Modelo.Turno;
import Vista.Frm_Pantalla_Principal;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.table.DefaultTableModel;

public class Crl_turno implements MouseListener, ItemListener {

    Frm_Pantalla_Principal frm_Pantalla_Principal;
    Crud_turno crud_turno;
    Turno turno;

    public Crl_turno(Frm_Pantalla_Principal frm_Pantalla_Principal, Crud_turno crud_turno, Turno turno) {
        this.frm_Pantalla_Principal = frm_Pantalla_Principal;
        this.crud_turno = crud_turno;
        this.turno = turno;

        frm_Pantalla_Principal.lbGuardarTurno.addMouseListener(this);
        frm_Pantalla_Principal.lbIrCalculadora.addMouseListener(this);
        frm_Pantalla_Principal.lbVolverTurno.addMouseListener(this);
        frm_Pantalla_Principal.lbLimpiarTurno.addMouseListener(this);
        
        refrescarTablaTurno();
        limpiarCamposTexto();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_Pantalla_Principal.lbGuardarTurno) {

            //TELEFONO
            turno.setTelefonoTurno(Long.valueOf(frm_Pantalla_Principal.txtTelefonoTurno.getText()));
            //DIRECCION
            turno.setDireccionTurno(frm_Pantalla_Principal.txtDireccionTurno.getText());
            //SEXO
            turno.setSexoTurno(frm_Pantalla_Principal.txtSexoTurno.getText());
            //EDAD
            turno.setEdadTurno(Integer.parseInt(frm_Pantalla_Principal.txtEdadTurno.getText()));
            //MOTIVO
            turno.setMotivoTurno(frm_Pantalla_Principal.txtMotivoTurno.getText());

            Date fecha = null;
            java.sql.Time hora = null;
            SimpleDateFormat sdfh = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            SimpleDateFormat sdh = new SimpleDateFormat("HH:mm");
            Date fechaTurno = (Date) frm_Pantalla_Principal.jdcFecha.getDate();

            String TurnoConFechaHora = sdfh.format(fechaTurno);
            System.out.println("Fecha y Hora: " + TurnoConFechaHora);

            String[] partes = TurnoConFechaHora.split(" ");
            String fechaString = partes[0];
            System.out.println("Fecha: " + fechaString);
            String horaString = partes[1];
            System.out.println("Hora: " + horaString);

            try {

                fecha = sdf.parse(fechaString);
                long finmes = fecha.getTime();
                java.sql.Date fechaSubir = new java.sql.Date(finmes);

                turno.setFechaTurno(fechaSubir);

                java.sql.Time horaSubir = new java.sql.Time(sdh.parse(horaString).getTime());
                turno.setHoraTurno(horaSubir);

            } catch (ParseException ex) {

                Logger.getLogger(Crl_turno.class.getName()).log(Level.SEVERE, null, ex);

            }

            turno.setNombreTurno(frm_Pantalla_Principal.txtNombreTurno.getText());
            turno.setDniTurno(Integer.parseInt(frm_Pantalla_Principal.txtDniTurno.getText()));

            crud_turno.guardar(turno);
            refrescarTablaTurno();
            limpiarCamposTexto();

        }

        if (e.getSource() == frm_Pantalla_Principal.lbIrCalculadora) {

            frm_Pantalla_Principal.jTabbedPaneMain.setSelectedIndex(7);

        }

        if (e.getSource() == frm_Pantalla_Principal.lbVolverTurno) {

            frm_Pantalla_Principal.jTabbedPaneMain.setSelectedIndex(6);

        }
        
        if(e.getSource() == frm_Pantalla_Principal.lbLimpiarTurno){
            
            limpiarCamposTexto();

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

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    //-----------------METODOS BASICOS----------------
    public void refrescarTablaTurno() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();

            frm_Pantalla_Principal.tlbTurnos.setModel(modelo);

            PreparedStatement ps = null;

            ResultSet rs = null;

            Conexion conn = new Conexion();

            Connection con = conn.getConexion();

            String sql = "SELECT Id,Nombre,Dni,Telefono,Direccion,Sexo,Edad,Motivo,Fecha,Hora FROM turno ORDER BY Fecha DESC";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData(); //le damos los datos de la consulta a la tabla.

            int cantidadColumnas = rsMd.getColumnCount(); // nos dira la cantidad de columnas.

            modelo.addColumn("ID"); //cada vuelta que reinicie la tabla perdera los nombres de las columnas
            modelo.addColumn("Nombre");//por eso los tenemos que reasignar.
            modelo.addColumn("Dni");
            modelo.addColumn("Telefono");
            modelo.addColumn("Direccion");
            modelo.addColumn("Sexo");
            modelo.addColumn("Edad");
            modelo.addColumn("Motivo");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");

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

    }
    
    public void limpiarCamposTexto(){
        
        frm_Pantalla_Principal.jdcFecha.setDate(null);
        frm_Pantalla_Principal.txtNombreTurno.setText(null);
        frm_Pantalla_Principal.txtDniTurno.setText(null);
        frm_Pantalla_Principal.txtTelefonoTurno.setText(null);
        frm_Pantalla_Principal.txtDireccionTurno.setText(null);
        frm_Pantalla_Principal.txtSexoTurno.setText(null);
        frm_Pantalla_Principal.txtEdadTurno.setText(null);
        frm_Pantalla_Principal.txtMotivoTurno.setText(null);
        
    }
}

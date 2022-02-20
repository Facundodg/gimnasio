package Controlador;

import Modelo.Crud_turno;
import Modelo.Turno;
import Vista.Frm_Pantalla_Principal;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Crl_turno implements MouseListener, ItemListener {

    Frm_Pantalla_Principal frm_Pantalla_Principal;
    Crud_turno crud_turno;
    Turno turno;

    public Crl_turno(Frm_Pantalla_Principal frm_Pantalla_Principal, Crud_turno crud_turno, Turno turno) {
        this.frm_Pantalla_Principal = frm_Pantalla_Principal;
        this.crud_turno = crud_turno;
        this.turno = turno;

        frm_Pantalla_Principal.lbGuardarTurno.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_Pantalla_Principal.lbGuardarTurno) {

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
}

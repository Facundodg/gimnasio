package Modelo;

import java.sql.Date;
import java.sql.Time;

public class Turno {
    
    private int id;
    private String nombreTurno;
    private int dniTurno;
    private Date fechaTurno;
    private Time horaTurno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }

    public int getDniTurno() {
        return dniTurno;
    }

    public void setDniTurno(int dniTurno) {
        this.dniTurno = dniTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Time getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(Time horaTurno) {
        this.horaTurno = horaTurno;
    }
    
    
    
    
    
}

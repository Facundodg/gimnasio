package Modelo;

import java.sql.Date;
import java.sql.Time;

public class Turno {
    
    private int id;
    private String nombreTurno;
    private int dniTurno;
    private Long telefonoTurno;
    private String direccionTurno;
    private String sexoTurno;
    private int edadTurno;
    private String motivoTurno;

    public Long getTelefonoTurno() {
        return telefonoTurno;
    }

    public void setTelefonoTurno(Long telefonoTurno) {
        this.telefonoTurno = telefonoTurno;
    }

    public String getDireccionTurno() {
        return direccionTurno;
    }

    public void setDireccionTurno(String direccionTurno) {
        this.direccionTurno = direccionTurno;
    }

    public String getSexoTurno() {
        return sexoTurno;
    }

    public void setSexoTurno(String sexoTurno) {
        this.sexoTurno = sexoTurno;
    }

    public int getEdadTurno() {
        return edadTurno;
    }

    public void setEdadTurno(int edadTurno) {
        this.edadTurno = edadTurno;
    }

    public String getMotivoTurno() {
        return motivoTurno;
    }

    public void setMotivoTurno(String motivoTurno) {
        this.motivoTurno = motivoTurno;
    }
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

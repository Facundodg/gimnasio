package Modelo;

import java.util.Date;

public class Fecha {
    
    private int id;
    private java.sql.Date fecha_ayer;
    private java.sql.Date fecha_hoy;

    public Fecha(java.sql.Date fecha_ayer, java.sql.Date fecha_hoy,int id) {
        this.fecha_ayer = fecha_ayer;
        this.fecha_hoy = fecha_hoy;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fecha() {

    }

    public java.sql.Date getFecha_ayer() {
        return fecha_ayer;
    }

    public void setFecha_ayer(java.sql.Date fecha_ayer) {
        this.fecha_ayer = fecha_ayer;
    }

    public java.sql.Date getFecha_hoy() {
        return fecha_hoy;
    }

    public void setFecha_hoy(java.sql.Date fecha_hoy) {
        this.fecha_hoy = fecha_hoy;
    }

}

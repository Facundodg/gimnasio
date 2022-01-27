package Modelo;

import java.sql.Date;

public class Producto {

    private int Id_producto;
    private String Codigo_producto;
    private String Nombre_producto;
    private double Costo_producto;
    private double Venta_producto;
    private int Cantidad_producto;
    private java.sql.Date Fecha_producto;

    public Producto(String Codigo_producto, String Nombre_producto, double Costo_producto, double Venta_producto, int Cantidad_producto, java.sql.Date Fecha_producto, int Id_producto) {

        this.Codigo_producto = Codigo_producto;
        this.Nombre_producto = Nombre_producto;
        this.Costo_producto = Costo_producto;
        this.Venta_producto = Venta_producto;
        this.Cantidad_producto = Cantidad_producto;
        this.Fecha_producto = Fecha_producto;
        this.Id_producto = Id_producto;

    }

    public Producto() {

    }

    public int getId_producto() {
        return Id_producto;
    }

    public void setId_producto(int Id_producto) {
        this.Id_producto = Id_producto;
    }

    public java.sql.Date getFecha_producto() {
        return Fecha_producto;
    }

    public void setFecha_producto(java.sql.Date Fecha_producto) {
        this.Fecha_producto = Fecha_producto;
    }

    public String getCodigo_producto() {
        return Codigo_producto;
    }

    public void setCodigo_producto(String Codigo_producto) {
        this.Codigo_producto = Codigo_producto;
    }

    public String getNombre_producto() {
        return Nombre_producto;
    }

    public void setNombre_producto(String Nombre_producto) {
        this.Nombre_producto = Nombre_producto;
    }

    public double getCosto_producto() {
        return Costo_producto;
    }

    public void setCosto_producto(double Costo_producto) {
        this.Costo_producto = Costo_producto;
    }

    public double getVenta_producto() {
        return Venta_producto;
    }

    public void setVenta_producto(double Venta_producto) {
        this.Venta_producto = Venta_producto;
    }

    public int getCantidad_producto() {
        return Cantidad_producto;
    }

    public void setCantidad_producto(int Cantidad_producto) {
        this.Cantidad_producto = Cantidad_producto;
    }

}

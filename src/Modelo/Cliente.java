package Modelo;

import java.util.Date;

public class Cliente {
    
    private String nomApi;
    private int telefono;
    private int dni;
    private String direccion;
    private String correo;
    private String enfermedad;
    private String medicaSiNo;
    private String sexo;
    private java.sql.Date fechaActual;
    private java.sql.Date fechafinDeMes;
    private int dias;
    private java.sql.Date fechaNacimiento;
    private int edad;
    private double pago;

    public Cliente(String nomApi, int telefono, int dni, String direccion, String correo,String enfermedad, String medicaSiNo, String sexo, java.sql.Date fechaActual, java.sql.Date fechafinDeMes,int dias, java.sql.Date fechaNacimiento,int edad, double pago) {
        this.nomApi = nomApi;
        this.telefono = telefono;
        this.dni = dni;
        this.direccion = direccion;
        this.correo = correo;
        this.enfermedad = enfermedad;
        this.medicaSiNo = medicaSiNo;
        this.sexo = sexo;
        this.fechaActual = fechaActual;
        this.fechafinDeMes = fechafinDeMes;
        this.dias = dias;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.pago = pago;
    }

    public Cliente() {
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public java.sql.Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(java.sql.Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getNomApi() {
        return nomApi;
    }

    public void setNomApi(String nomApi) {
        this.nomApi = nomApi;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMedicaSiNo() {
        return medicaSiNo;
    }

    public void setMedicaSiNo(String medicaSiNo) {
        this.medicaSiNo = medicaSiNo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public java.sql.Date getFechafinDeMes() {
        return fechafinDeMes;
    }

    public void setFechafinDeMes(java.sql.Date fechafinDeMes) {
        this.fechafinDeMes = fechafinDeMes;
    }

    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
  }
    


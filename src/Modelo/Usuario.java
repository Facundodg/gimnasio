package Modelo;

public class Usuario {

    private int id_usuario;

    private String Nombre_usuario;
    private String Puesto_usuario;
    private String Contraseña_usuario;
    private byte[] imagen;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
    }

    public String getPuesto_usuario() {
        return Puesto_usuario;
    }

    public void setPuesto_usuario(String Puesto_usuario) {
        this.Puesto_usuario = Puesto_usuario;
    }

    public String getContraseña_usuario() {
        return Contraseña_usuario;
    }

    public void setContraseña_usuario(String Contraseña_usuario) {
        this.Contraseña_usuario = Contraseña_usuario;
    }

}

package Modelo;

public class Configuraciones {

    private int Id;
    private boolean modoNocturno;
    private boolean sonido;
    private String idioma;
    private String usuarioId;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuario) {
        this.usuarioId = usuario;
    }

    public boolean getModoNocturno() {
        return modoNocturno;
    }

    public void setModoNocturno(boolean modoNocturno) {
        this.modoNocturno = modoNocturno;
    }

    public boolean getSonido() {
        return sonido;
    }

    public void setSonido(boolean sonido) {
        this.sonido = sonido;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}

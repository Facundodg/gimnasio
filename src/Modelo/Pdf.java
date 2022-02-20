package Modelo;

public class Pdf {

    /*Todo los atributos*/
    int id;
    String nombrepdf;
    byte[] archivopdf;

    public Pdf() {
        
        
    }

    public int getId() {
        return id;
    }

    public String getNombrepdf() {
        return nombrepdf;
    }

    public byte[] getArchivopdf() {
        return archivopdf;
    }


    /*Todo los codigos set*/
    public void setId(int id) {
        this.id = id;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }

}

package model;

public class Sala {
    
    String identificador;
    String local;

    public Sala(String identificador, String local) {
        this.identificador = identificador;
        this.local = local;
    }

    public Sala() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
}

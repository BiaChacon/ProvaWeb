package model;

import java.util.Date;

public class Reserva {
    
    private Sala sala;
    private Date inicio;

    public Reserva(Sala sala, Date inicio) {
        this.sala = sala;
        this.inicio = inicio;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

}

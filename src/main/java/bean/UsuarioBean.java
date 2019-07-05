package bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Reserva;

import model.Sala;
import model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean {

    private Usuario usuario;    
    private List<Sala> listaSalas;
    private List<Reserva> listaReserva;
    
    public String reservar(Sala s){
        Date data1 = new GregorianCalendar(2012, Calendar.FEBRUARY, 19).getTime(); 
        //Reserva reserva = new Reserva(s, data1);
       // listaReserva.add(reserva);
        return "";
    }
    
    public UsuarioBean() {
        listaReserva = new ArrayList<>();
        listaSalas = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }
    
}

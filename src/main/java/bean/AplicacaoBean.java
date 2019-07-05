package bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import model.Sala;
import model.Usuario;

@ManagedBean(name="aplicacao", eager = true)
@ApplicationScoped
public class AplicacaoBean {

    private List<Usuario> listaUsuarios;
    private List<Sala> listaSalas;

    public AplicacaoBean() {
        
        listaSalas = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        
        Sala sala1 = new Sala("sala 1", "bloco A");
        Sala sala2 = new Sala("sala 2", "bloco A");
        
        listaSalas.add(sala1);
        listaSalas.add(sala2);
        
        Date data1 = new GregorianCalendar(2012, Calendar.FEBRUARY, 19).getTime();
	Date data2 = new GregorianCalendar(2002, Calendar.MAY, 1).getTime();
        
	Usuario u1 = new Usuario("Administrador","999999999",data1,"123456789","admin","admin","admin",true, null);
	Usuario u2 = new Usuario("Bia Chacon", "989999999",data2,"987654321","user","user","user",false, null);
        
	listaUsuarios.add(u1);
	listaUsuarios.add(u2);
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }
    	
}

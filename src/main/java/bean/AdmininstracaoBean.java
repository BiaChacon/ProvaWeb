package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import model.Reserva;
import model.Sala;
import model.Usuario;

@ManagedBean(name="admin", eager = true)
public class AdmininstracaoBean {

    @ManagedProperty(value="#{aplicacao}")
    private AplicacaoBean aplicacao;
     
    private Sala novaSala;
    private List<Usuario> listaUsuarios;
    private List<Sala> listaSalas;
    private List<Reserva> listaReserva;

    public AdmininstracaoBean() {
        novaSala = new Sala();
        listaSalas = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        listaReserva = new ArrayList<>();
    }
    
    public String cadastrarSala(){
        aplicacao.getListaSalas().add(novaSala);
        novaSala = new Sala();
        return "";
    }
    
    public String cancelar(){
        novaSala = new Sala();
        return "";
    }
    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }
    
    public Sala getNovaSala() {
        return novaSala;
    }

    public void setNovaSala(Sala novaSala) {
        this.novaSala = novaSala;
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

    public AplicacaoBean getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(AplicacaoBean aplicacao) {
        this.aplicacao = aplicacao;
    }
	
}

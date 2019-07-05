package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Usuario;

@ManagedBean
@SessionScoped
public class CadastraUsuarioBean {
    
    private Usuario novoUsuario;
    
    @ManagedProperty(value="#{aplicacao}")
    private AplicacaoBean aplicacao;

    public CadastraUsuarioBean() {
        novoUsuario = new Usuario();
    }

    public Usuario getNovoUsuario() {
        return novoUsuario;
    }

    public void setNovoUsuario(Usuario novoUsuario) {
        this.novoUsuario = novoUsuario;
    }

    public AplicacaoBean getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(AplicacaoBean aplicacao) {
        this.aplicacao = aplicacao;
    }
        
    public String cadastrar(){
	FacesContext fc = FacesContext.getCurrentInstance();
	aplicacao.getListaUsuarios().add(novoUsuario);
	FacesMessage mensagem = new FacesMessage("Cadastro efetuado com sucesso");
	mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
	fc.addMessage(null, mensagem);
        novoUsuario = new Usuario();
	return "/index.xhtml";
    }
        
    public String cancelar(){
	return "/index.xhtml";
    }
        

}

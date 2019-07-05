package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import model.*;

@ManagedBean(name="login")
public class LoginBean {
	
    @ManagedProperty(value="#{aplicacao}")
    private AplicacaoBean aplicacao;
        
    private String login;
    private String senha;

    public LoginBean() {
    }

    public AplicacaoBean getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(AplicacaoBean aplicacao) {
        this.aplicacao = aplicacao;
    }

    public String getLogin() {
	return login;
    }
        
    public void setLogin(String login) {
        this.login = login;
    }
        
    public String getSenha() {
	return senha;
    }
        
    public void setSenha(String senha) {
	this.senha = senha;
    }
        
    public String autentica(){
        
	boolean logou = false;
	FacesContext fc = FacesContext.getCurrentInstance();
        System.out.println(login);
        System.out.println(senha);
                        
	for (Usuario u : aplicacao.getListaUsuarios()) {
            
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                
		ExternalContext ec = fc.getExternalContext();
		HttpSession sessao = (HttpSession) ec.getSession(true);
		logou = true;
                
		if(u.getAdmin()){
                    sessao.setAttribute("admin-logado", u);
                    return "/admin/BemVindo.xhtml";
		}else{
                    sessao.setAttribute("usuario-logado", u);
                    return "/user/BemVindo.xhtml";
		}
            }
        }
		
	if(!logou){
            FacesMessage mensagem = new FacesMessage("Usuario ou senha invalidos");
            mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
            fc.addMessage(null, mensagem);
            return null;
	}
        
	return null;
        
    }
	
    public String deslogar(){
            
	FacesContext fc = FacesContext.getCurrentInstance();
	ExternalContext ec = fc.getExternalContext();
	HttpSession sessao = (HttpSession) ec.getSession(true);
	sessao.invalidate();
	FacesMessage mensagem = new FacesMessage("saiu");
	mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
	fc.addMessage(null, mensagem);
	return "/index.xhtml";
        
    }
      
}
	
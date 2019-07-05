package validador;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.primefaces.component.password.Password;

@FacesValidator("validaSenha")
public class ValidaSenha implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
				
		String r = (String) arg2;
		Password uiInputPassword = (Password) arg1.findComponent("fsenha");
		String s = (String) uiInputPassword.getLocalValue();

		if (!r.equals(s)){
		      FacesMessage msg = new FacesMessage("Repita as senhas.","As senhas precisam ser iguais");
		      msg.setSeverity(FacesMessage.SEVERITY_ERROR);    
		      throw new ValidatorException(msg);
		}
		
	}

}

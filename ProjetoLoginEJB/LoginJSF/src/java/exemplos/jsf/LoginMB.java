package exemplos.jsf;

import exemplo.ejb.AutenticacaoRemote;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginMB {
    private String Login;
    private String Senha;
    
    @EJB
    private AutenticacaoRemote ejb;
    
    public String autenticar() {
        
        if (ejb.autenticar(Login, Senha)) {
        return "principal";
        } else {
            FacesMessage fm = new FacesMessage("Login ou senha inválidos");
            FacesContext.getCurrentInstance().addMessage("msg", fm);
            return null;
        }
    }
        

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}

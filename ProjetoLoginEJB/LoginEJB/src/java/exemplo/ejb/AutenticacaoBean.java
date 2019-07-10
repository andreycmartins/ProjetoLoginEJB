package exemplo.ejb;

import javax.ejb.Stateless;

@Stateless
public class AutenticacaoBean implements  AutenticacaoRemote {

    @Override
    public boolean autenticar(String login, String senha) {
       return "admin".equals(login) && "admin".equals(senha);
    }
    
}

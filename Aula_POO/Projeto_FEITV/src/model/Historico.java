
package model;


public class Historico {
    private String usuarioLogin;
    private String nomeFilme;
    
    public Historico(){
        
    }

    public Historico(String usuarioLogin, String nomeFilme) {
        this.usuarioLogin = usuarioLogin;
        this.nomeFilme = nomeFilme;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    
    
}

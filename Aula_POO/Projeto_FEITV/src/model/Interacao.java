
package model;


public class Interacao {
    private String usuarioLogin;
    private String nomeFilme;
    private String tipoInteracao;//vai guardar oq o usu fizer 

    public Interacao() {
    }

    public Interacao(String usuarioLogin, String nomeFilme, String tipoInteracao) {
        this.usuarioLogin = usuarioLogin;
        this.nomeFilme = nomeFilme;
        this.tipoInteracao = tipoInteracao;
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

    public String getTipoInteracao() {
        return tipoInteracao;
    }

    public void setTipoInteracao(String tipoInteracao) {
        this.tipoInteracao = tipoInteracao;
    }

   
    
    
    
}


package model;


public class Interacao {
    private String usuarioLogin;
    private String nomeFilme;
    private String tipointeracao;//vai guardar oq o usu fizer 

    public Interacao() {
    }

    public Interacao(String usuarioLogin, String nomeFilme, String tipointeracao) {
        this.usuarioLogin = usuarioLogin;
        this.nomeFilme = nomeFilme;
        this.tipointeracao = tipointeracao;
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

    public String getTipointeracao() {
        return tipointeracao;
    }

    public void setTipointeracao(String tipointeracao) {
        this.tipointeracao = tipointeracao;
    }
    
    
}


package controller;

import dao.Conexao;
import dao.UsuDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Tela_login;
import view.Tela_principal;

public class ControleLogin {
    private Tela_login tela2;

    public ControleLogin(Tela_login tela2) {
        this.tela2 = tela2;
    }
    
     public void loginUsuario(){
        Usuario usuario = new Usuario(null,tela2.getUsuario().getText(),tela2.getSenha().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuDAO dao = new UsuDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if(res.next()){
                JOptionPane.showMessageDialog(tela2, "Login efetuado", "Aviso", 
                                                JOptionPane.INFORMATION_MESSAGE);
                
                Tela_principal tela3 = new Tela_principal();
                tela3.setVisible(true);
                tela2.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(tela2, "Login não efetuado", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
                
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(tela2, "Erro de conexão", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }
}

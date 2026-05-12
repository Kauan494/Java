package controller;

import dao.Conexao;
import dao.UsuDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Cadastro_usu;

public class ControleCadastro {
    private Cadastro_usu tela1;

    public ControleCadastro(Cadastro_usu tela1) {
        this.tela1 = tela1;
    }
    
     public void salvarUsu(){
        String nome = tela1.getTxt_1().getText();//Nome
        String user = tela1.getTxt_2().getText();//Usuário
        String senha = tela1.getTxt_3().getText();//Senha
        Usuario usuario = new Usuario(nome, user,senha);
        
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            UsuDAO dao = new UsuDAO(conn);
            dao.inserir(usuario);
            JOptionPane.showMessageDialog(tela1, "Usuário Cadastrado!","Aviso", 
                                        JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(tela1, "Usuário já existe","Erro", 
                                        JOptionPane.ERROR_MESSAGE);
        }
    }
}


package controller;

import dao.Conexao;
import dao.InteracaoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import model.Interacao;
import model.Usuario;
import view.Tela_principal;

public class ControlePrincipal {
    private Tela_principal tela3;
    private Usuario usuario;
    private Connection cnn;

    public ControlePrincipal(Tela_principal tela3, Usuario usuario, Connection cnn) {
        this.tela3 = tela3;
        this.usuario = usuario;
        this.cnn = cnn;
        
        try {
            this.cnn = new Conexao().getConnection();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no Controle:" + e.getMessage());
        }
    }
    
    public void reagir(String nomeFilme, String tipoInteracao){
        try {
           
            //Chamar o DAO para inserir no banco
            InteracaoDAO dao = new InteracaoDAO(this.cnn);
            
            //Se curtir remove o descurtido
            if(tipoInteracao.equals("Curtido")){
                dao.remover(usuario.getUser(), nomeFilme, "Descurtido");
            }
            
            //Se descurtir remove o curtir
            if(tipoInteracao.equals("Descurtido")){
                dao.remover(usuario.getUser(), nomeFilme, "Curtido");
            }
            
            Interacao acao = new Interacao(usuario.getUser(), nomeFilme, tipoInteracao);
            dao.inserir(acao);
            
            javax.swing.JOptionPane.showMessageDialog(null, "Voce marcou " + nomeFilme + " como " + tipoInteracao);
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erro ao salvar" + e.getMessage());
        }
    }
    
    public void pesquisarFilme(String nomeDigitado){
        if(nomeDigitado == null || nomeDigitado.trim().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null,"Por favor, digite o nome do filme!");
            return;
        }
        
        try{
            dao.FilmeDAO filmeDao = new dao.FilmeDAO(this.cnn);
            model.Filme filmeEncontrado = filmeDao.buscarFilmePorNome(nomeDigitado);
            
            if(filmeEncontrado != null){
                tela3.mostrarFilme(filmeEncontrado);
            } else{
                javax.swing.JOptionPane.showMessageDialog(null, "Filme nao encontrado, digite o nome corretamente!");
            }
        }catch(SQLException ex){
            javax.swing.JOptionPane.showMessageDialog(null, "Erro na busca" + ex.getMessage());
        }
       
    }
    
    public boolean verificarInteracao(String filme, String tipo){
            try {
                InteracaoDAO dao = new InteracaoDAO(cnn);
                return dao.verificarInteracao(usuario.getUser(), filme, tipo);
            } catch (SQLException e) {
                return false;
            }
    }
    
    public void removerInteracao(String nomeFilme, String tipo){
        try {
            InteracaoDAO dao = new InteracaoDAO(this.cnn);
            
            dao.remover(nomeFilme, nomeFilme, nomeFilme);
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro ao reamover interacao");
        }
    }
     
}   
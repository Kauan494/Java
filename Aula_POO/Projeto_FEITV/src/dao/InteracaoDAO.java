package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Interacao;

public class InteracaoDAO {
    private Connection cnn;

    public InteracaoDAO(Connection cnn) {
        this.cnn = cnn;
    }
    
    public void inserir(Interacao interacao) throws SQLException{
        //Caso já exista (conflito), o DO NOTHING evita erro
        String sql = "INSERT INTO interacoes(usuario_login,nome_filme,tipo_interacao)" +
                " VALUES(?,?,?)" + 
                " ON CONFLICT (usuario_login, nome_filme, tipo_interacao) DO NOTHING";
        
        PreparedStatement statement = cnn.prepareStatement(sql);
        statement.setString(1, interacao.getUsuarioLogin());
        statement.setString(2, interacao.getNomeFilme());
        statement.setString(3,interacao.getTipoInteracao());
        statement.execute();
      
    }
    
    public void remover(String usuario, String filme, String tipo)throws SQLException{
        String sql = "DELETE FROM interacoes " +
                "WHERE usuario_login = ?  " +
                "AND nome_filme = ? " +
                "AND tipo_interacao = ? ";
        
        PreparedStatement statement = cnn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, filme);
        statement.setString(3, tipo);
        statement.execute();
    }
    
    public boolean verificarInteracao(String usuario, String filme, String tipo) throws SQLException{
        String sql = "SELECT * FROM interacoes " +
                "WHERE usuario_login = ?  " +
                "AND nome_filme = ? " +
                "AND tipo_interacao = ? ";
        
        PreparedStatement statement = cnn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, filme);
        statement.setString(3, tipo);
        
        ResultSet rs = statement.executeQuery();
        return rs.next();
    }
    
}

package dao;

import java.sql.Connection;
import model.Historico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class HistoricoDAO {
    private Connection cnn;

    public HistoricoDAO(Connection cnn) {
        this.cnn = cnn;
    }
    
    public void inserir(Historico historico) throws SQLException{
        String sql = "INSERT INTO historico_pesquisa(usuario_login,nome_filme)" +
                " VALUES(?,?)";
        
        PreparedStatement statement = cnn.prepareStatement(sql);
        statement.setString(1, historico.getUsuarioLogin());
        statement.setString(2, historico.getNomeFilme());
        
        statement.execute();
    }
    
    //Busca todas as pesquisas do usu
    public ArrayList<String>buscarHistorico(String usuario)throws SQLException{
        ArrayList lista = new ArrayList<>();
        String sql = "SELECT nome_filme " +
                "FROM historico_pesquisa " +
                "WHERE usuario_login = ?";
        PreparedStatement statement = cnn.prepareStatement(sql);
        statement.setString(1, usuario);
        
        ResultSet rs = statement.executeQuery();
        
        while(rs.next()){
            lista.add(rs.getString("nome_filme"));
        }
        return lista;
    }
}

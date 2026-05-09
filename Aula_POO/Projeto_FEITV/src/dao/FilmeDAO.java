
package dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import model.Filme;


public class FilmeDAO {
    private Connection cnn;

    public FilmeDAO(Connection cnn) {
        this.cnn = cnn;
    }
    
    public Filme buscarFilmePorNome(String nomeBusca) throws SQLException{
        String sql = "SELECT * FROM FILMES WHERE nome ILIKE ?";//o ILIKE busca igmorando maiúsculas e minúsculas
        
        try(PreparedStatement stmt = cnn.prepareStatement(sql)) {
            stmt.setString(1,"%" + nomeBusca + "%");//o % permite buscar partes do nome
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                Filme filme = new Filme();
                filme.setId(rs.getInt("id_filme"));
                filme.setNome(rs.getString("nome"));
                filme.setDescricao(rs.getString("descricao"));
                filme.setImagem(rs.getString("imagem"));
                return filme;
            }
            
        }
        return null;
    }
}

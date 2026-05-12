
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

public class UsuDAO {
   private Connection conn;

    public UsuDAO(Connection conn) {
        this.conn = conn;
    }
    
    //buscar no banco um usuário que tenha o mesmo login e senha que o objeto Usuario
    public ResultSet consultar(Usuario usuario) throws SQLException{
        String sql = "select * from usuarios where usuario = ? and senha = ?";//buscar na tabela onde tudo esteja igual
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getUser());//troca o primeiro ? por usuario
        statement.setString(2, usuario.getSenha());//troca o segundo ? por senha
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserir(Usuario usuario) throws SQLException{
        String sql = "insert into usuarios (nome, usuario, senha) values ('"
                      + usuario.getNome()    + "', '" 
                      + usuario.getUser() + "', '"
                      + usuario.getSenha()   + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
   
}

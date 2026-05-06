package dao;

import com.sun.jdi.connect.spi.Connection;
import model.Interacao;

public class InteracaoDAO {
    private Connection cnn;

    public InteracaoDAO(Connection cnn) {
        this.cnn = cnn;
    }
    
    public void salvar(Interacao interacao){
        String sql = "INSERT INTO interacoes(usuario_login,nome_filme,tipo_interacao)" +
                "VALUES(?,?,?)" + "ON CONFLICT "
    }
    
    
}

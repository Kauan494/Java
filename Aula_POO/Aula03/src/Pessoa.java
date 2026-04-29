
public class Pessoa {
    protected String nome,endereco;
    protected double renda;
    protected ContaComum conta;
    
    public Pessoa(String nome,String endereco,double renda,ContaComum conta){
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
        this.conta = conta;
    }
    public ContaComum getConta(){
        return conta;
    }
    
    public void setConta(ContaComum conta){
        this.conta = conta;
    }
    @Override
    public String toString(){
        return "Nome="+nome+
                ",endereco="+endereco+
                ",renda="+renda+
                ",conta="+conta;
    }
}

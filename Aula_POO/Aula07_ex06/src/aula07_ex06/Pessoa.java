package aula07_ex06;


public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;

    public Pessoa(String nome, String sobrenome, int idade, String CPF) throws CpfException {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        if (CPF.contains(".") || CPF.contains("-")) {
            throw new CpfException("Erro: cpf contem . ou -");
        }
    }
    @Override
    public String toString() {
    return "Nome: " + nome +
           ", Sobrenome: " + sobrenome +
           ", Idade: " + idade +
           ", CPF: " + CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
}

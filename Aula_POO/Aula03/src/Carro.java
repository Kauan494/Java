
public class Carro {
    private String modelo;
    private String cor;
    private int ano, km;
    private double preco;

//Construtor sem parametros
public Carro(){
    
}

//Construtor com parametros
public Carro(String modelo, String cor,int ano,int km,double preco){
    this.modelo = modelo;
    this.cor = cor;
    this.ano = ano;
    this.km = km;
    this.preco = preco;
}
@Override
    public String toString() {
        return "Modelo: " + modelo +
               ", Cor: " + cor +
               ", Ano: " + ano +
               ", Km: " + km +
               ", Preco: " + preco;
    }

// GETTERS

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }

    public double getPreco() {
        return preco;
    }

    // SETTERS

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
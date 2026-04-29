package cursoemvideo_aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(){//Este é o construtor sem parametro, tem q ter o mesmo nome que a classe
        this.tampar();
        this.cor = "Azul";
    }

    public Caneta(String modelo, float ponta, String cor) {//Este é o construtor com parametros
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }
    
    
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre s caneta:");
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Ponta:"+this.ponta);
        System.out.println("Cor:"+this.cor);
        System.out.println("Tampada:"+this.tampada);
    }
}


package aula06_ex02;


public abstract class Formas {
    private String tipo;

    public Formas() {
    }

    public String getTipo() {
        return tipo;
    }
    
    

    public Formas(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double perimetro();
    
    public abstract void print();
}

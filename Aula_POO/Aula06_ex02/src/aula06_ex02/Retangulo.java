
package aula06_ex02;


public class Retangulo extends Formas{
    private double comprimento,largura;

    public Retangulo() {
    }

   
    public Retangulo(double comprimento, double largura, String tipo) {
        super(tipo);
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    @Override
    public double perimetro() {
       return 2 * comprimento + 2 * largura; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    @Override
    public void print(){
        System.out.println("--- Retangulo ---");
        System.out.println("Comprimento....:" + comprimento);
        System.out.println("Largura........:" + largura);
        System.out.println("Perimetro......:" + perimetro());
    }

    
}

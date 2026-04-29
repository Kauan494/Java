
package aula06_ex02;


public class Circulo extends Formas{
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio, String tipo) {
        super(tipo);
        this.raio = raio;
    }
    
     @Override
    public double perimetro() {
         return 2 + 3.14159 * raio; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
   
    
    public double area(){
        return 3.14159 * (raio * raio);
    }
    
    @Override
    public void print(){
        System.out.println("--- Circulo ---");
        System.out.println("Raio........" + raio);
        System.out.println("Perimetro..." + perimetro());
        System.out.println("Area......" + area());
    }

   
}

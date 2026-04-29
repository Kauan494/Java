
package aula06_ex02;

import java.util.Scanner;


public class Aula06_ex02 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String tipoL;
        double comprimentoL, larguraL, raioL;
        
        Formas f = null;
        
        System.out.println("Informe o tipo da forma(Circulo ou retangulo):");
        tipoL = teclado.nextLine();
        
        if(tipoL.equalsIgnoreCase("Circulo")){
            System.out.println("Informe o raio:");
            raioL = teclado.nextDouble();
            f = new Circulo(raioL,"Circulo");
        }else{
            System.out.println("Informe o comprimento");
            comprimentoL = teclado.nextDouble();
            System.out.println("Informe a largura");
            larguraL = teclado.nextDouble();
            f = new Retangulo(comprimentoL,larguraL,"Retangulo");
        }
        
        f.print();
    }
    
}

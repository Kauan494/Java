
package aula07_ex01;

import java.util.Scanner;


public class Aula07_ex01 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nro;
        
        while(true){
            try{
                System.out.println("Digite um numero");
                nro = teclado.nextInt();
                break;
            } catch(Exception e){
                System.out.println("Isso nao eh um numero");
                System.out.println("Tente novamente...");
                teclado.nextLine();
            }
        }
    }
    
}

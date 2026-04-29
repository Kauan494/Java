
package aula06_ex01;

import java.util.Scanner;

public class TesteQuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int xint;
        double xdouble;
        
        Quadrado q = new Quadrado();
        
        System.out.println("Informe um valor inteiro");
        xint = teclado.nextInt();
        
        System.out.println("O valor ao quadrado eh" + q.square(xint));
        
        System.out.println("Informe um valor real:");
        xdouble = teclado.nextDouble();
        
        System.out.println("O valor ao quadrado eh:" + q.square(xdouble));
    }
}

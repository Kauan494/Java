
package aula04_ex07;


public class Matematica {
    public static int max3(int n1, int n2, int n3){
        int maior = n2;
        if(n1>maior)
            maior = n1;
        if(n3>maior)
            maior = n3;
        
        return maior;
    }
    
    public static boolean impar(boolean n1,boolean n2,boolean n3){
        return !n1&&!n2&&n3 || n1&&n2&&n3 || !n1&&n2&&n3 || n1&&!n2&&n3;
    }
    
    public static boolean maioria(boolean n1,boolean n2,boolean n3){
        return !n1&&!n2&&n3 || n1&&n2&&n3 || !n1&&n2&&n3 || n1&&!n2&&n3;
    }
}

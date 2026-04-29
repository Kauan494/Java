package aula04_ex04;

import java.util.ArrayList;

public class Aula04_ex04 {

    
    public static void main(String[] args) {
        ArrayList<ContaCorrente>contas = new ArrayList<>();
        
        contas.add(new ContaCorrente(0));
        contas.add(new ContaCorrente(1000));
        
        for(int i = 0; i<8; i++){
            contas.add(new ContaCorrente(0));
        }
        
        System.out.println("Tsmsnho="+contas.size());
        
        
    }
    
}

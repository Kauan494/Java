
public class ExemploAssociacao {

    
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Joao","Sao Paulo",2000,new ContaComum(10,100,123));
        
        //System.out.println(p1);
        
        //System.out.println(p1.getConta());
        
        //ContaComum contaPessoa = p1.getConta();
        //System.out.println(contaPessoa.getSaldo());
        
        //contaPessoa.setSaldo(2000);
        //System.out.println(p1);
        
        System.out.println(p1.getConta().getSaldo());
    }
}

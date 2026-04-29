public class Aula03 {

    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro("Ferrari","Vermelho",2020,20000,3000000);
        Carro c3 = new Carro("Porsche","Preto",2022,30000,800000);
        
        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println(c3);
    }
    
}

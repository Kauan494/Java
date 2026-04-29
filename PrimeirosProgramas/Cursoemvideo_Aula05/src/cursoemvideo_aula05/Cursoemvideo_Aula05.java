package cursoemvideo_aula05;

public class Cursoemvideo_Aula05 {

    
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.setNumConta(1111);
        c1.setDono("Kauan");
        c1.abrirConta("CP");
        
        ContaCorrente c2 = new ContaCorrente();
        c2.setNumConta(2222);
        c2.setDono("Leticia");
        c2.abrirConta("CC");
        
        c1.depositar(400);
        c2.depositar(1000);
        c1.sacar(100);
        c2.sacar(50);
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
    
}

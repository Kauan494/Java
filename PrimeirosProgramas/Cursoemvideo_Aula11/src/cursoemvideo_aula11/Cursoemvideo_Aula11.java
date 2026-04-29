
package cursoemvideo_aula11;

public class Cursoemvideo_Aula11 {

    
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Claudio");
        v1.setIdade(22);
        v1.setSexo("M");
        
        Aluno a1 = new Aluno();
        a1.setNome("Kauan");
        a1.setMatricula(2212622);
        a1.setCurso("CC");
        a1.setIdade(19);
        a1.setSexo("M");
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1212121);
        b1.setNome("Rodri");
        b1.setBolsa(1.56f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}

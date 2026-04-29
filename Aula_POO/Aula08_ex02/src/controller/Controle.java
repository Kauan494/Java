
package controller;

import model.Soma;
import view.Janela;


public class Controle {
    private Janela view;

    public Controle(Janela view) {
        this.view = view;
    }
    
    public void controleLimpar(){
        view.getTxt_1().setText("");
        view.getTxt_2().setText("");
        view.getTxt_3().setText("");
    }
    
    public void controleSomar(){
        double n1 = Double.parseDouble(view.getTxt_1().getText());
        double n2 = Double.parseDouble(view.getTxt_1().getText());
        Soma s = new Soma();
        double r = s.calcular(n1, n2);
        view.getTxt_3().setText(String.valueOf(r));
    }
}

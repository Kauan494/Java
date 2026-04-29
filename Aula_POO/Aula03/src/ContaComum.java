
public class ContaComum {
    protected int numero;
    protected int senha;
    protected double saldo;
    
    public ContaComum(int senha, int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    @Override
    public String toString(){
        return "Numero="+numero+
                ",saldo="+saldo+
                ",senha"+senha;
    }
}

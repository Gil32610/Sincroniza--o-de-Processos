package Basico;

public class Conta
 {
    

    public double saldo;


    public void depositar(double saldo){
        this.saldo+=saldo;
    }

    public void sacar(double valor){
        this.saldo += saldo<valor?0:-valor;
    }
}

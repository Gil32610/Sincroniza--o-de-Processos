package Thread;

public class Conta {

    public double saldo;
    public boolean busy;

    public Conta(){
        this.busy = false;
    }

    public void depositar(double saldo) {
        if(busy== false){
            this.saldo += saldo;
            busy =true;
        }
    }

    public void sacar(double valor) {
        this.saldo += saldo < valor ? 0 : -valor;
    }
}

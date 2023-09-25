package Thread;

public class Depositar50 implements Runnable {

    public Conta conta;
    public double valor;

    public Depositar50(Conta conta) {
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void run() {
        System.out.println("Operação + 50");
        conta.depositar(50);
        this.conta.busy =false;
    }

}

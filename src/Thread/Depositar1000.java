package Thread;

public class Depositar1000 implements Runnable{
 
    public Conta conta;


    public Depositar1000(Conta conta) {
        this.conta = conta;
        
    }

    @Override
    public void run() {
        System.out.println("Operação + 1000");
        conta.depositar(1000);
        this.conta.busy =false;
    }
}

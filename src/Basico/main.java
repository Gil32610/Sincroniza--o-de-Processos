package Basico;

public class main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(50);
        conta.depositar(1000);
        System.out.println("Saldo da conta: " + conta.saldo);
    }

}

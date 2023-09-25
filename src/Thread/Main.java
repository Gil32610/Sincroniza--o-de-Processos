package Thread;

public class Main {
    public static void main(String[] args) {
        int quantidade = 0;
        for (int i = 0; i< 1000000; i++) {
            System.out.println("-".repeat(20));
            Conta conta = new Conta();
            Thread depositar1000 = new Thread(new Depositar1000(conta));    
            Thread depositar50 = new Thread(new Depositar50(conta));
            depositar50.start();
            depositar1000.start();
            try{
                depositar50.join();
            }catch(InterruptedException e){
    
            }
            try {
                depositar1000.join();
            } catch (InterruptedException e) {
            }
            System.out.println("-".repeat(20));
            System.out.printf("[Saldo: %f %s \n" ,(Double) conta.saldo,conta.saldo!=1050?"Saldo incorreto]":"]");

            if(conta.saldo!= 1050.)
             quantidade++;
                
        }
        System.out.println("Quantidade: " + quantidade);
        }
}

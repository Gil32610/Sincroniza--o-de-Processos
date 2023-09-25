package SO;

import SO.T1;

public class SistemaOperacional {
    static final Integer arquivo = 1;
    static final Integer arquivo1 = 2;

    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        
        try{
            t1.start();
            t2.start();
        }catch(Exception e){

        }

    }
}

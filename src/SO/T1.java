package SO;

public class T1 implements Runnable{
    String className = T1.class.getName();

    @Override
    public void run(){
        System.out.println("Arquivo 1 está sendo obtido");
        synchronized(SistemaOperacional.arquivo){
            System.out.printf("%s obteve arquivo 1\n",T1.class.getName());
            System.out.printf("%s tenta obter arquivo 2\n", className);
                synchronized(SistemaOperacional.arquivo1){
                    System.out.printf("%s obteve o arquivo 2\n",className);

                }
        }
    }
    
}

package Singleton;

public class Main {
    
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();
        Logger logger4 = Logger.getInstance();

        // Todos possuem o mesmo endereço na memória pois são a mesma instância
        System.out.println(logger1);
        System.out.println(logger2);
        System.out.println(logger3);
        System.out.println(logger4);
    }
}

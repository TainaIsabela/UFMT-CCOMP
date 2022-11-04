// Questão 4 - Interface Runnable
// Kaio Felipe Nink Cardoso

public class Main implements Runnable{
    
    public static void main(String[] args) {
        Runnable[] runnables = {
            () -> System.out.println("Teste "+1),
            () -> System.out.println("Java"),
            () -> System.out.println("Prog3"),
            () -> System.out.println(2022),
        };

        Runnable result = TestRunnable.exec(runnables);

        result.run();
    }

    @Override
    public void run() {
        
        
    }
}

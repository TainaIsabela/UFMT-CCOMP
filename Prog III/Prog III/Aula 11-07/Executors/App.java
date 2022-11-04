import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
package Executors;
public class App {
    public static void main(String[] args) throws Exception {
       Runnable tarefa1 = () -> {
           while (true) {
                System.out.println("Tarefa 1");
              }
       };
       Runnable tarefa2 = () -> {
           while (true) {
                System.out.println("Tarefa 2");
              }
       };

       ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(tarefa1);
        executor.execute(tarefa2);
        while (true) {
            System.out.println("Main");
        }
    }
}
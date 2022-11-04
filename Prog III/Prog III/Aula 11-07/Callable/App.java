import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
package Callable;
public class App {
    public static void main(String[] args) throws Exception {
       Callable<Integer> tarefa1 = () -> {
            int acc = 0;
            for (int i = 0; i < 100; i++) {
                    System.out.println("Tarefa 1");
                    acc++;
                }
            };
            Callable<Integer> tarefa2 = () -> {
                int acc = 0;
                for (int i = 0; i < 100; i++) {
                        System.out.println("Tarefa 2");
                        acc++;
                    }
                };
                Callable<Integer> tarefa3 = () -> {
                    int acc = 0;
                    for (int i = 0; i < 100; i++) {
                            System.out.println("Tarefa 1");
                            acc++;
                        }
                    };
                    Callable<Integer> tarefa4 = () -> {
                        int acc = 0;
                        for (int i = 0; i < 100; i++) {
                                System.out.println("Tarefa 4");
                                acc++;
                            }
                        };
                        Callable<Integer> tarefa5 = () -> {
                            int acc = 0;
                            for (int i = 0; i < 100; i++) 
                                    System.out.println("Tarefa 5");
                                    acc++;
                                
                            };
                
                ArrayList<Callable<Integer>> tarefas tarefas = new ArrayList<Callable<Integer>>
                                            
                ExecutorService executor = Executors.newCachedThreadPool();
                Future<Integer> res1 = executor.submit(tarefa1);
                Future<Integer> res2 = executor.submit(tarefa2);
                Future<Integer> res3 = executor.submit(tarefa3);
                Future<Integer> res4 = executor.submit(tarefa4);
                Future<Integer> res5 = executor.submit(tarefa5);

                int total = res1.getValue() + res2.getValue() + res3.getValue() + res4.getValue() + res5.getValue();
                System.out.println("Total: " + total);
                executor.shutdown();
       };
    }
}
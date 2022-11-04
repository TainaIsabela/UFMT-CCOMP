
public class TestRunnable {

    public static Runnable exec(Runnable[] runnables){
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }
    
}
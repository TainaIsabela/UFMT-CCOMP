package Questao9;

public class Questao9 implements Runnable {
    private final int n;
    private final String target;

    public Questao9(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int x = 0; x < n; x++) {
            System.out.println("Hello, " + target);
        }
    }

    public static void main(String[] args) {
        Questao9 alice = new Questao9(5, "Alice");
        Questao9 bob = new Questao9(3, "Bob");

        Thread at = new Thread(alice);
        Thread bt = new Thread(bob);
        at.start();
        bt.start();
    }
}
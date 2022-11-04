package Ex_3.src;

public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.push("a");
        p.push("b");
        p.push("c");
        p.push("d");

        p.pop();
        p.show();
    }
}

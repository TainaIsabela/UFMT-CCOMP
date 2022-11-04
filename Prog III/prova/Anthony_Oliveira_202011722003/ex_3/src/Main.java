public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        p = p.push("Anthony");
        p = p.push("Vinicius");
        p = p.push("Linder");
        p = p.push("Gustavo");
        p = p.push("Otavio");

        p.show();
        p = p.pop();
        p.show();
        p = p.pop();
        p = p.pop();
        p.show();
        p = p.pop();
        p.show();
      


    }
}

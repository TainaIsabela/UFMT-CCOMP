public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        p1.translatar(2, 3);
        p1.escalar(2);
        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
    }
}

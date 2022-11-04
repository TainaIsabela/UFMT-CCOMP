package Ex_2.src;

public class Main {
    public static void main(String[] args) {
        Ponto xPonto = new Ponto(3, 1);
        System.out.println(xPonto);
        xPonto.transladar(1, 4);
        System.out.println(xPonto);
        xPonto.escalar(2.5);
        System.out.println(xPonto);
    }
}

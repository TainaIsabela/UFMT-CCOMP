package Ex_5.src;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(new Ponto(5, 5), 10);
        System.out.println("Centro de circulo fica no " + c.getCenter());

        Retangulo r = new Retangulo(new Ponto(5, 2), 10, 2);
        System.out.println("Centro de retângulo fica no " + r.getCenter());
    }
}

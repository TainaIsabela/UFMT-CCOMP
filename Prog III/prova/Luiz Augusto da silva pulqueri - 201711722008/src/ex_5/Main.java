package ex_5;

import ex_2.ponto;

public class Main {
    public static void main(String[] args) {
        Circulo ball = new Circulo(new ponto(1,2), 2.4);
        Retangulo ret = new Retangulo(new ponto(4, 5), 2, 2);

        System.out.println("Centro Circulo:");
        System.out.println(ball.getCenter().toString());

        System.out.println("\nCentro Retangulo");
        System.out.println(ret.getCenter().toString());

        System.out.println("\nMover circulo");
        ball.moveBy(2, 5);
        System.out.println(ball.getCenter().toString());

        System.out.println("\nMover retangulo");
        ret.moveBy(3,7);
        System.out.println(ret.getCenter().toString());
    }
}

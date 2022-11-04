public class Main {

    //Exercicio 5 - Aldo Jr;
    public static void main(String[] args) throws Exception {
        Circulo c1 = new Circulo(new Ponto(1, 3), 2);
        Retangulo r1 = new Retangulo(new Ponto(2, 2), 4, 8);

        System.out.println("Circulo: x: " + c1.getPonto().getX() + " y: " + c1.getPonto().getY() + " Centro: " + c1.getCenter().getX() + " "+ c1.getCenter().getY());
        System.out.println("Retangulo: x: " + r1.getPonto().getX() + " y: " + r1.getPonto().getY() + " Centro: " + r1.getCenter().getX() + " "+ r1.getCenter().getY());

        System.out.println("Movendo o circulo e o retangulo: ");
        c1.moveBy(1, 1);
        c1.moveBy(1, 1);

        System.out.println("Circulo: x: " + c1.getPonto().getX() + " y: " + c1.getPonto().getY() + " Centro: " + c1.getCenter().getX() + " "+ c1.getCenter().getY());
        System.out.println("Retangulo: x: " + r1.getPonto().getX() + " y: " + r1.getPonto().getY() + " Centro: " + r1.getCenter().getX() + " "+ r1.getCenter().getY());

    }
}

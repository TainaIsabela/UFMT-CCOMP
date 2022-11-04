
//Exercicio 2 - Aldo Jr;

public class Main {
    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto(1, 2);

        System.out.println("Ponto Criado: x:" + p1.getX() + " y: " + p1.getY());

        p1 = p1.Transladar(2);

        System.out.println("Ponto transladado: x:" + p1.getX() + " y: " + p1.getY());

        p1 = p1.Escalar(2);
        System.out.println("Ponto escalado: x:" + p1.getX() + " y: " + p1.getY());

    }
}

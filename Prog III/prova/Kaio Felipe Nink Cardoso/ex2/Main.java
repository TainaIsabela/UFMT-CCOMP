// Questão 2 - Classe imutável Ponto
// Kaio Felipe Nink Cardoso

public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto(3, 4).transladar(1, 3).ecalar(0.5);
        Ponto p2 = new Ponto(10, 4).transladar(3.3, 4.5).ecalar(0.78);

        System.out.println("Ponto ("+p.getX()+", "+p.getY()+")");
        System.out.println("Ponto ("+p2.getX()+", "+p2.getY()+")");


    }
}

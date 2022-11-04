package Questao2;

public class main {
    public static void main(String[] args) {
        Ponto p = new Ponto();
        System.out.println(p.getX()+" "+p.getY());

        p.transladar(2, 3);
        System.out.println(p.getX()+" "+p.getY());

        p.escalar(0.5f);
        System.out.println(p.getX()+" "+p.getY());

    }
}

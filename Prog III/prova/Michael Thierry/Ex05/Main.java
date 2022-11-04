package Ex05;

public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto(1.0, 2.0);
        Ponto p2 = new Ponto(1.0, 2.0);
        PontoRotulado pr = new PontoRotulado("A", 1.0, 3.0);
        PontoRotulado pr2 = new PontoRotulado("B", 1.0, 3.0);


        System.out.println(p.toString());
        System.out.println(pr.toString());
        System.out.println(p.equals(p2));
        System.out.println(pr.equals(pr2));
        System.out.println(p.equals(pr2));
    }

}

public class Main {
        public static void main(String[] args) {
            Ponto p1 = new Ponto(1, 2);
            Ponto p2 = new PontoRotulado("A", 7, 6);

            System.out.println(p1.getX());
            System.out.println(p1.getY());
            System.out.println(p1.toString());
            System.out.println(p1.equals(p2));
            System.out.println(p2.toString());
            System.out.println(p2.equals(p1));
        }
}

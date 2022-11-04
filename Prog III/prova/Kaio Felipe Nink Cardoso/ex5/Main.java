// Questão 5 - PontoRotulado
// Kaio Felipe Nink Cardoso

public class Main {
    public static void main(String[] args) {
        PontoRotulado pr1 = new PontoRotulado("Rot01", 3, 4);
        PontoRotulado pr2 = new PontoRotulado("Rot02", 5.1, 9.5);
        PontoRotulado pr3 = pr1;

        System.out.println(pr3.equals(pr1));
        System.out.println(pr3.equals(pr2));

        System.out.println(pr2.toString());

        

    }
}

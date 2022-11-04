public class Main {
    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto(2d, 3d);
        Ponto p2 = new Ponto(2d, 3d);
        System.out.println(p1);
        if(p1.equals(p2)){
            System.out.println("Sao iguais");
        }
        PontoRotulado p5 = new PontoRotulado("abacate", 3d, 5d);
        PontoRotulado p6 = new PontoRotulado("abacate", 3d, 5d);
        System.out.println(p5);
        if(p5.equals(p6)){
            System.out.println("Sao iguais");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(4,5);
        p1.transladar(4,5);
        System.out.println("Transladando o Ponto: " + p1.getX()+" , "+ p1.getY());
        p1.escalar(6);
        System.out.println("Escalar o Ponto: " + p1.getX()+ " , "+p1.getY());
    }
}

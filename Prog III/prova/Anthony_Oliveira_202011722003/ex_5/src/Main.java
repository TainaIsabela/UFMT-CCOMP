public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto(4,6);

        p.showponto();
        p.transladar(2);
        p.escalar(0.5);
        p.showponto();

        Shape circulo = new Circulo(p, 2);
        System.out.println("Circulo: \n Centro: ("+circulo.getCenter().getX()+","+circulo.getCenter().getY()+")\n");
        Shape retangulo = new Retangulo(p, 6, 4);
        System.out.println("Retangulo: \n Centro: ("+retangulo.getCenter().getX()+","+retangulo.getCenter().getY()+")\n");

    }
}

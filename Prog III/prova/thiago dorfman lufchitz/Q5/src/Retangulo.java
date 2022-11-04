public class Retangulo extends Shape {
    private Ponto topEsquerdo;
    private double largura;
    private double altura;
    
    public Retangulo(double dx, double dy, Ponto topEsquerdo, double largura, double altura) {
        super(dx, dy);
        this.topEsquerdo = topEsquerdo;
        this.largura = largura;
        this.altura = altura;
    }
}

public class Circulo extends Shape {
    private Ponto centro;
    private double raio;
  
    public Circulo(double x, double y, Ponto centro, double raio) {
        super(x, y);
        this.centro = centro;
        this.raio = raio;
    }

}

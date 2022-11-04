package Ex_5.src;

public class Circulo extends Shape {
    private double raio;
    
    public Circulo(Ponto centro, double raio){
        super(centro);
        this.raio = raio;
    }

    @Override
    public Ponto getCenter() {
        return super.point;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
}

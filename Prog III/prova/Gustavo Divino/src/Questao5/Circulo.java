package Questao5;

public class Circulo extends Shape{
    private double raio;

    
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(Ponto centro, double raio) {
        super(centro);
        this.raio=raio;
    }

    @Override
    public Ponto getCenter() {
        return this.point;
    }
    
}

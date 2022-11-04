package ex_5;
import ex_2.ponto;

public class Circulo extends Shape {
    private double raio;

    public Circulo(ponto centro, double raio){
        super(centro);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public ponto getCenter() {
        return this.coordenada;
    }
    
}

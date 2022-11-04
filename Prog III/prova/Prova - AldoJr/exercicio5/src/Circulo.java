public class Circulo extends Shappe {
    private double raio;
    
    public Circulo(Ponto centro, double raio) {
        super(centro);
        this.raio = raio;
    }

    @Override
    public Ponto getCenter() {
        return this.ponto;
    }
    
}

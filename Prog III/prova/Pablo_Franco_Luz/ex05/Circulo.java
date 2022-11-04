public class Circulo extends Shape{
    private double raio;

    public Circulo(Ponto centro, double raio){
        super(centro);
        this.raio = raio;
    }

    public Ponto getPoint(){
        return getPonto();
    }

    @Override
    public Ponto getCenter() {
        return getPonto();
    }
}

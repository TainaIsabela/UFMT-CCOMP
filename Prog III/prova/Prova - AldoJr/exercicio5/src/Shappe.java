public abstract class Shappe {
    protected Ponto ponto;

    public Ponto getPonto(){
        return ponto;
    }

    public Shappe(Ponto ponto) {
        this.ponto = ponto;
    }

    public void moveBy(double dx, double dy){
        this.ponto = new Ponto(ponto.getX() + dx, ponto.getY() + dy);
    }

    public abstract Ponto getCenter();
    
}

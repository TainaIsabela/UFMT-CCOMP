public abstract class Shape {
    private Ponto ponto;

    public Shape(Ponto ponto) { this.ponto = ponto; }

    
    public void moveBy(double dx, double dy){
        ponto.x += dx;
        ponto.y += dy;
    }

    public Ponto getPonto(){return ponto;}
    
    public abstract Ponto getCenter();
}

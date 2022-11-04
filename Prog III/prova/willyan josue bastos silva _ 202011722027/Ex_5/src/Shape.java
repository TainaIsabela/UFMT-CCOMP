package Ex_5.src;

public abstract class Shape {
    Ponto point = new Ponto();

    public Shape(Ponto p){
        this.point = p;
    }

    public void moveBy(double x, double y) {
        this.point.setX(point.getX() + x);
        this.point.setY(point.getY() + x);
    }

    public abstract Ponto getCenter();
}

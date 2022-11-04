
public class Shape extends Ponto {
    private double dx;
    private double dy;
    

    public Shape(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }
    public Shape(double x, double y, double dx, double dy) {
        super(x, y);
        this.dx = dx;
        this.dy = dy;
    }
    public void moveBy(double dx, double dy){
        dx = getX() + dx;
        dy = getY() + dy;
        setX(dx);
        setY(dy);
    }

    public Ponto getCenter(){
        return null;
    }
    
}
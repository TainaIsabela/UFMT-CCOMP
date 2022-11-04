public abstract class Shape extends Ponto{

    public void moveBy(double x, double y){
        setX(getX()+x);
        setY(getY()+y);

    }

    public abstract Ponto getCenter();

}

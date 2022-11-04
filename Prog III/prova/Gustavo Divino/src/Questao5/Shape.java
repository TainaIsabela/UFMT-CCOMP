package Questao5;

public abstract class Shape {

    Ponto point;

    //Construtor
    public Shape(Ponto point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy){
        point.transladar(point.getX()+dx, point.getY()+dy);
    }

    public abstract Ponto getCenter();

        
}

public class Ponto{
    protected double x;
    protected double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto(){}

    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}

}

public class Ponto{
    private double x;
    private double y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void translatar(double a, double b){
        setX(getX() + a);
        setY(getY() + b);
    }

    public void escalar(int a){
        setX(getX() * a);
        setY(getY() * a);
    }
    
}
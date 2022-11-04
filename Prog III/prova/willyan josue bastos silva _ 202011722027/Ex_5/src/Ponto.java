package Ex_5.src;

public class Ponto {
    private double x, y;

    public Ponto(){}
    public Ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x;}
    public double getY() { return y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    public void transladar(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void escalar(double redimendiona) {
        this.x *= redimendiona;
        this.y *= redimendiona;
    }

    @Override
    public String toString() {
        return "Ponto [x=" + x + ", y=" + y + "]";
    }
}

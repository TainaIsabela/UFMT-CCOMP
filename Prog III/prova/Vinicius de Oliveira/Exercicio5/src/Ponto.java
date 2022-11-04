public class Ponto{
    protected double x;
    protected double y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return " valor de x: " + x + " valor de y: "+ y;
    }

    @Override
    public boolean equals(Object obj) {
        Ponto aux = (Ponto)obj;
        return ((this.x == aux.x) && (this.y == aux.y));
    }
}
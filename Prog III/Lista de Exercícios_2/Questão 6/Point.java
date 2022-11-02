//6.epita o exercício anterior, mas agora implemente os métodos translate() e scale() como modificadores.
public final class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // translate é um método modificador
    final void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    //scale é um método modificador
    final void scale(double s) {
        this.x *= s;
        this.y *= s;

    }
    //distance é um método não modificador
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2));
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        p.translate(1,3);
        p.scale(0.5);
        System.out.println(p.getX() + " " + p.getY());
    }
}


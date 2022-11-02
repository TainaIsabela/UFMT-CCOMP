// 5.Implemente uma classe imutável chamada Point que descreva um ponto no plano. Forneça um construtor para criar um ponto com coordenadas específicas, um construtor sem argumentos para definir um ponto na origem e métodos getX() e getY para obter as coordenadas do ponto. Escreva também os métodos translate() e scale(). O método translate deve mover o ponto por uma determinada distância na direção x e y. O método de scale() redimensiona ambas as coordenadas por um determinado fator. Implemente esses métodos para que eles retornem novos pontos com os resultados. Por exemplo, Point p = new Point(3, 4).translate(1, 3).scale(0.5), deve definir p como um ponto com coordenadas (2, 3.5).
public final class point {

    private double x;
    private double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public point() {
        this.x = 0;
        this.y = 0;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    final void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }
    
    final void scale(double s) {
        x *= s;
        y *= s;

    }

    public double distance(point p) {
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2));
    }

    public static void main(String[] args) {
        point p = new point(3, 4);
        p.translate(1,3);
        p.scale(0.5);
        System.out.println(p.getX() + " " + p.getY());
    }
}


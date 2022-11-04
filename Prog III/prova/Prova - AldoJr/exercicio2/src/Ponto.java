public class Ponto {
    private double x, y;
    
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

    public Ponto Transladar(double dir){
        Ponto newPonto = new Ponto(this.getX() + dir, this.getY() + dir);
        return newPonto;
    }

    public Ponto Escalar(double escal){
        Ponto newPonto = new Ponto(this.getX() * escal, this.getY() * escal);
        return newPonto;
    }

    
}

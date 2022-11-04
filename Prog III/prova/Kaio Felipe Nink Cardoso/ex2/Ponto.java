
public class Ponto {
    private double x;
    private double y;
    
    public Ponto(){
        x = 0;
        y = 0;
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public Ponto transladar(double moveX, double moveY){
        return new Ponto(this.x + moveX, this.y + moveY);
    }

    public Ponto ecalar(double esc){
        return new Ponto(this.x * esc, this.y * esc);
    }
    


}
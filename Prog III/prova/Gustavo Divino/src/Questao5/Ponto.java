package Questao5;

public class Ponto{
    private double x;
    private double y;


    public Ponto() {
        x = 0f;
        y = 0f;
    }
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Getters de X e Y
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }


    
    public void transladar(double x, double y){
        this.x=getX()+x;
        this.y=getY()+y;
    }

    public void escalar(double fat){
        this.x=getX()*fat;
        this.y=getY()*fat;
    }

    
}
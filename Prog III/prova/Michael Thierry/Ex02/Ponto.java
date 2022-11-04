package Ex02;

public final class Ponto {
    private  static double x;
    private  static double y;
    //Construtores
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    //Getters 
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
    
    public static Ponto transladar(double tx, double ty){
        x += tx;
        y += ty;
        return new Ponto(x, y);
        
    }

    public static Ponto escalar(double esc){
        x *= esc;
        y *= esc;
        return new Ponto(x, y);

    }

}

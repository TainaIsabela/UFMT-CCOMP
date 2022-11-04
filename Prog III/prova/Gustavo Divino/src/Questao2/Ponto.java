package Questao2;

public class Ponto{
    private float x;
    private float y;


    public Ponto() {
        x = 0;
        y = 0;
    }
    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Getters de X e Y
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }


    
    public void transladar(float x, float y){
        this.x=getX()+x;
        this.y=getY()+y;
    }

    public void escalar(float fat){
        this.x=getX()*fat;
        this.y=getY()*fat;
    }

    
}
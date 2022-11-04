public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    
    public Ponto(){ //ponto na origem
        this.x = 0;
        this.y = 0;
    }

    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}

    public void transladar(int dirX, int dirY){
        this.x += dirX;
        this.y += dirY;
    }

    public void escalar(int dirX, int dirY){
        this.x = this.x * dirX;
        this.y = this.y * dirY;
    }

}

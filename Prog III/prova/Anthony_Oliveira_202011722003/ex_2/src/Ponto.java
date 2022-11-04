public class Ponto {

    private double x;
    private double y;

    public Ponto(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Getters and Setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //metodos

    public void transladar(double n){
        setX(x+n);
        setY(y+n);

    }

    public void escalar(double e){
        setX(x*e);
        setY(y*e);

    }

    public void showponto(){
        System.out.println("Ponto: ("+getX()+","+getY()+")\n\n");
    }
    

}

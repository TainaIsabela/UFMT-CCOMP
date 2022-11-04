
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

    @Override
    public boolean equals(Object outro){
        if(this == outro){
            return true;
        }
        if(this.getClass() != outro.getClass()){
            return false;
        }
        Ponto p = (Ponto) outro;

        return this.x == p.x && this.y == p.y;
    }

    @Override
    public String toString(){
        return "Ponto ("+this.x+", "+this.y+")";
    }


}
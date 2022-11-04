package Ex05;

public class Ponto {

    protected double x;
    protected double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public String toString(){
        return "("+this.x+", "+this.y+")";
    }

    public boolean equals(Ponto obj) {
        if(!(obj instanceof Ponto)){
            return false; 
        }else if((obj.getX() == this.x) &&(obj.getY() == this.y)){
            return true;
        }
        return false;
    }
    
}

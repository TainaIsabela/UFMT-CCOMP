
public final class Ponto {
    private final Double x;
    private final Double y;

    public Ponto(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public Ponto transladar(Double x, Double y){
        return new Ponto(this.x+x,this.y+y);
    }

    public Ponto escalar(Double reason){
        return new Ponto(this.x*reason,this.y*reason);
    }

    public void printPoints(){
        System.out.println("X: "+ this.x +" Y: "+this.y);
    }
}

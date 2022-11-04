package Ex05;

public class PontoRotulado extends Ponto{
    private String rotulo;

    
    public PontoRotulado(String rotulo, double x, double y){
        super(x, y);
        this.rotulo = rotulo;
    }

    public String getRotulo(){
        return this.rotulo;
    }

    public String toString(){
        return this.rotulo+""+super.toString();
    }
    
    public boolean equals(PontoRotulado obj) {
        if(!(obj instanceof PontoRotulado)){
            return false;
        }else if(this.rotulo.equals(obj.getRotulo())){
            if((obj.getX() == this.x) &&(obj.getY() == this.y)){
                return true;
            }
            return false;
        }
        return false;
    }   
    
}

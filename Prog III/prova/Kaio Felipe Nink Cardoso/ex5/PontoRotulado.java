public class PontoRotulado extends Ponto {

    private String rotulo;

    public PontoRotulado(String rotulo, double x, double y){
        super(x, y);
        this.rotulo = rotulo;
    }

    public String getRotulo() {
        return rotulo;
    }


    @Override
    public boolean equals(Object outro) {
        if(super.equals(outro)){
            return true;
        }
        PontoRotulado pr = (PontoRotulado) outro;
        return this.rotulo == pr.rotulo;
    }

    @Override
    public String toString() {
        return super.toString() + " com rotulo "+this.rotulo;
    }
    
}

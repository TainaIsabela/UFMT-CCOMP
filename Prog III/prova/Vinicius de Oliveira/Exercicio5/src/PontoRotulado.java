public class PontoRotulado extends Ponto{
    private String rotulo;

    public PontoRotulado(String rotulo, double x, double y) {
        super(x, y);
        this.rotulo = rotulo;
    }

    public String getRotulo(){
        return rotulo;
    }
    
    @Override
    public String toString() {
        return "Rotulo : " +getRotulo() +super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        PontoRotulado aux = (PontoRotulado)obj;
        return super.equals(obj) && this.rotulo == aux.rotulo;
    }
}

public class PontoRotulado extends Ponto{
    String rotulo;
    
    public PontoRotulado(String rotulo, double x, double y) {
        super(x, y);
        this.rotulo = rotulo;
    }

    public String getRotulo() {
       return rotulo;
    }
    
    @Override
    public String toString() {
        return "PontoRotulado{" + "rotulo=" + rotulo + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PontoRotulado other = (PontoRotulado) obj;
        return true;

    }
}
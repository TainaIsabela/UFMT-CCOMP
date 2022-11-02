import java.util.Random;
public class SequenciaRandomica implements SequenciaInt {

    private Random gerador;

    public SequenciaRandomica() {
        gerador = new Random();
    }
    
    @Override
    public int next() {
        return gerador.nextInt(1000000);
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}



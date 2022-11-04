public class SequenciaDeArray implements SequenciaInt {
    
    private int[] array;
    private int posicao;
    
    public SequenciaDeArray(int n) {
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i*i;
        }
        this.posicao = 0;
    }

    @Override
    
    public int next() {
        return array[posicao++];
    }
    
    public boolean hasNext() {
        return (this.posicao <= this.array.length);
    }
    
}

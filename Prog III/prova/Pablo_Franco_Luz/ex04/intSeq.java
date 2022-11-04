public class intSeq implements IntSequence{
    private int[] array;
    int pos;

    public intSeq(int[] array){
        //for(int i=0; i < tam; i++){
        this.array = array;
        //}
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public int next() {
        int posicao;
        posicao = array[pos++];
        return posicao;
    }

    //@Override
    public boolean hasNext() {
        pos++;
        if(pos <= array.length){
            return true;
        }
        return false;
    }
    
}

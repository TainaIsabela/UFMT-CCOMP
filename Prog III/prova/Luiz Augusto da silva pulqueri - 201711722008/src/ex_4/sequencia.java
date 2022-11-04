package ex_4;

public class sequencia implements intSequence {
    private int[] var;
    private int indice;

    public sequencia(int ...var) {
        this.var = var;
        this.indice = 0;
    }



    @Override
    public int next() {
        return this.var[++this.indice];
    }

    @Override
    public boolean hasNext() {
        if(this.indice<this.var.length){
            return true;
        }
        return false;
    }
    
}

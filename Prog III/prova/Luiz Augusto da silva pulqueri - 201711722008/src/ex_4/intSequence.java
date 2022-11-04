package ex_4;

public interface intSequence {
    int next();
    boolean hasNext();

    static int[] of(int ...var){
        return var;
    }
}

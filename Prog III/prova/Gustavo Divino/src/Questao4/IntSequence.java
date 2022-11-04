package Questao4;

public interface IntSequence {
    public int next();
    public boolean hasNext();

    public static IntSequence of(int... n){
        return new IntSequence() {
            int i;
            
            @Override
            public int next(){
                return n[i++];
            }

            @Override
            public boolean hasNext() {
                return i<n.length;
            }
        };
    }
    
}

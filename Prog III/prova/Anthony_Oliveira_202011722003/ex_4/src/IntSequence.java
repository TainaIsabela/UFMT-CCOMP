public interface IntSequence {
    int next();
    boolean hasNext();

    static IntSequence of(int... n){
        return new IntSequence() {
            int aux =0;

            @Override
            public int next() {
                return hasNext()? n[aux++] : 0;
            }

            @Override
            public boolean hasNext() {
                return n.length > 0;
            }
            
        };
    }
}



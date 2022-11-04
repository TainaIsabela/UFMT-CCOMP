public interface IntSequence {
    int next();
    boolean hasNext();

    public static IntSequence of(int...n){
        return new IntSequence() {
            private int[] valores = n;
            private int i = 0;
            @Override
            public int next() {
                return valores[i-1];
            }

            @Override
            public boolean hasNext() {
                if(i < valores.length){
                    i++;
                    return true;
                }
                return false;
                
            }

            
        };
    }
}

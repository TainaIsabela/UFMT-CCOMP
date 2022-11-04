public interface IntSequence {
    int next();

    default boolean hasNext(){
        return true;
    }

    static IntSequence of(int... n){
        class Sequence implements IntSequence{
            int m=0;
            @Override
            public int next() {
                return n[m++];
            }

            @Override
            public boolean hasNext() {
                if(n.length > m){
                    return true;
                }
                else
                    return false;
            }
            
        };
        Sequence seq = new Sequence();
        return seq;
    }
}

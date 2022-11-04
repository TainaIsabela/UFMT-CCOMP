package Ex_4.src;

public interface IntSequence {
    int next();
    boolean hasNext();

    static IntSequence of(int... values) {
        class SequenceOfDigits implements IntSequence{
            int aux = 0;

            @Override
            public boolean hasNext() {
                return values.length > aux;
            }

            @Override
            public int next() {
                return values[aux++];
            }
            
        }
        return new SequenceOfDigits();
    }
}

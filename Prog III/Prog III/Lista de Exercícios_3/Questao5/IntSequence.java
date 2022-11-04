package Questao5;

import java.util.NoSuchElementException;

@FunctionalInterface
public interface IntSequence {
    static IntSequence of(int... integers) {
        return new IntSequence() {
            private int index = 0;

            public boolean hasNext() {
                return index < integers.length;
            }

            public int next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int val = integers[index];
                index++;
                return val;
            }
        };
    }
    
    static IntSequence constant(int value) {
        return () -> value;
    }

    default boolean hasNext() {
        return true;
    }

    int next();
}
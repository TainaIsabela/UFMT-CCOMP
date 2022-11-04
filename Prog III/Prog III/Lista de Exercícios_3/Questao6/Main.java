package Questao6;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Sequence IntSequence = new Sequence();

        System.out.println(IntSequence.constant());
        System.out.println(IntSequence.constant());
        System.out.println(IntSequence.constant());
    }
}

interface IntSequence<T> {
    default boolean hasNext() {
        return true;
    }

    T constant();
}

class Sequence implements IntSequence<BigInteger> {
    private Integer value = 1;

        @Override
        public BigInteger constant() {
            var v = new BigInteger(value.toString());
            value++;
            return v.multiply(v);
        }
}
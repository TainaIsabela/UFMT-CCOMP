package Questao7;

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
    private BigInteger currentValue = BigInteger.ZERO;
    @Override
    public BigInteger constant() {
        BigInteger ret = currentValue.multiply(currentValue);
        currentValue = currentValue.add(BigInteger.ONE);
        return ret;
    }
}
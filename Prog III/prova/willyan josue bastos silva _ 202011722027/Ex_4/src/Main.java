package Ex_4.src;

public class Main {
    public static void main(String[] args) {
        IntSequence sequencia = IntSequence.of(1,2,3,4,5);

        while (sequencia.hasNext()) System.out.println(sequencia.next());
    }
}

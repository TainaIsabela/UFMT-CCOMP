public class Main {
    public static void main(String[] args) {
        IntSequence constantOne = IntSequence.constant(1);
        for (int i = 0; i < 10; i++) {
            assert constantOne.next() == 1; 
        }
    }
}
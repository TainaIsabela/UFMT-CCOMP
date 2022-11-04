public class Main {
    public static void main(String[] args) {
        IntSequence n1 = IntSequence.of(1,2,3,4,5,8,9);

        while(n1.hasNext() != false){
            System.out.print(n1.next() + " ");
        }
            
    }
}

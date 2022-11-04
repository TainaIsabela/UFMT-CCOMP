public class Main {
    public static void main(String[] args) {
        IntSequence p = IntSequence.of(3,1,4,1,5,9);

        System.out.println("\nSequencia 1");
        for(int i= 0; i <6; i++ ){
            System.out.print(((int)p.next())+" ");
        }
       

        IntSequence p1 = IntSequence.of(3,1,4,1,5,9,7,6);
        System.out.println("\nSequencia 2");
        for(int i= 0; i <8; i++ ){
            System.out.print(((int)p1.next())+" ");
        }
    }
}

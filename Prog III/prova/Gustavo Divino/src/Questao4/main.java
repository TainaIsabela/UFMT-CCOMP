package Questao4;

public class main {
    public static void main(String[] args) {
        
        IntSequence p = IntSequence.of(1,2,3,4,5,6,7,8,9);
        while (p.hasNext()){
            System.out.println(p.next());
        }
    }
}

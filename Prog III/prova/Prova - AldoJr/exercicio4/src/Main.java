//Exercicio 4 - AldoJr

public class Main {
    public static void main(String[] args) throws Exception {
       IntSequence seq = IntSequence.of(1, 2 , 3, 4, 6, 7, 8, 9);

       while(seq.hasNext()){
           System.out.println(seq.next());
       }
    }
}

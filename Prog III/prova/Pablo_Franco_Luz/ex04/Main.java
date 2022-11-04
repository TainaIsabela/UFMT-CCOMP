public class Main{
    public static void main(String[] args) {

        System.out.println();
        intSeq seq = new intSeq(IntSequence.of(45, 63, 78, 96, 56, 41));
        int aux;
        for (int i = 0; i < seq.getArray().length; i++){
            aux = seq.next(); //teste do next()
            System.out.printf("[%d] ", aux);
        }

        
        System.out.println();
        intSeq seq2 = new intSeq(IntSequence.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        for (int i : seq2.getArray()){
            aux = seq2.next(); 
            System.out.printf("[%d] ", aux);
        }

        //Como seq2 iterou por todos os valores, não há mais valores no array no for da linha 14, não sobrou mais valores, portanto, hasNext retornará que não há valores.
        System.out.println("\n\nteste do has next");
        boolean aux2;
        for (int i = 0; i < seq2.getArray().length; i++){ 
            aux2 = seq.hasNext(); //teste do Hasnext()
            if(aux2 == true){
                System.out.printf("\nHá valores");
            }else{
                System.out.printf("\nNão há valores");
            }

        }
        


    }


}
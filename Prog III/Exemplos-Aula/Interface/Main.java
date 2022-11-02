public class Main {
    public static void main(String[] args) {
        SequenciaRandomica seq = new SequenciaRandomica();
        float media = Estatistica.media(seq, 10);
        System.out.println("Média 1: " + media);
        SequenciaDeArray seq2 = new SequenciaDeArray(50);
        media = Estatistica.media(seq2, 4);
        System.out.println("Média 2: " + media);


    }
}

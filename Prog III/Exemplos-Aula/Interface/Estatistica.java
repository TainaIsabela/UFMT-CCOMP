public class Estatistica {
    public static float media(SequenciaInt seq, int n) {
        float soma = 0;
        float media = 0;
        int contador = 1;
        while ((contador <= n) && (seq.hasNext())) {
            soma += seq.next();
            contador++;
        }
        media = soma / (contador-1);
        return media;
    }
}

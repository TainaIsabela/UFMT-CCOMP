public class ArrayString {
    // 6.Faça um programa que extraia as palavras contidas em uma String e coloque-as em um Array de Strings. Em seguida o programa deve percorrer o Array mostrando as palavras em ordem de tamanho. Primeiro as palavras com 1 caracter, depois as palavras com 2 caracteres, e assim por diante.
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        String[] palavras = frase.split(" ");
        int[] tamanho = new int[palavras.length];
        for (int i = 0; i < palavras.length; i++) {
            tamanho[i] = palavras[i].length();
        }
        for (int i = 0; i < tamanho.length; i++) {
            for (int j = 0; j < tamanho.length; j++) {
                if (tamanho[i] < tamanho[j]) {
                    int aux = tamanho[i];
                    tamanho[i] = tamanho[j];
                    tamanho[j] = aux;
                    String aux2 = palavras[i];
                    palavras[i] = palavras[j];
                    palavras[j] = aux2;
                }
            }
        }
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
    }
}

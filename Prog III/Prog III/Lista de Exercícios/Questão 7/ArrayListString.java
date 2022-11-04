import java.util.ArrayList;

public class ArrayListString {
    // 7.Repita o exercício 6 usando ArrayList.
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        String[] split = frase.split(" ");
        ArrayList<String> palavras = new ArrayList<String>();
        for (int i = 0; i < split.length; i++) {
            palavras.add(split[i]);
        }
        int[] tamanho = new int[palavras.size()];
        for (int i = 0; i < palavras.size(); i++) {
            tamanho[i] = palavras.get(i).length();
        }
        for (int i = 0; i < tamanho.length; i++) {
            for (int j = 0; j < tamanho.length; j++) {
                if (tamanho[i] < tamanho[j]) {
                    int aux = tamanho[i];
                    tamanho[i] = tamanho[j];
                    tamanho[j] = aux;
                    String aux2 = palavras.get(i);
                    palavras.set(i, palavras.get(j));
                    palavras.set(j, aux2);
                }
            }
        }
        for (int i = 0; i < palavras.size(); i++) {
            System.out.println(palavras.get(i));
        }
    }
}

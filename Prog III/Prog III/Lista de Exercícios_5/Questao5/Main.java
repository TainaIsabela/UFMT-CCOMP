// Escreva um programa que leia todas as palavras de um arquivo txt e imprima com que frequência cada palavra ocorreu. Use um TreeMap<String, Integer>.

package Questao5;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        String[] words = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }
    }
}
// Implemente o algoritmo “Sieve of Erathostenes” para determinar todos números primos ≤ n. Para isso, adicione todos os números de 2 a n a um conjunto (Set). Em seguida, encontre repetidamente o menor elemento s do conjunto e remova s2, s · (s + 1), s · (s + 2), e assim por diante. O algoritmo termina quando s2 > n. Implemente usando um HashSet<Integer>.

package Questao3;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 2; i <= 100; i++) {
            set.add(i);
        }
        int s = 2;
        while (s * s <= 100) {
            for (int i = s * s; i <= 100; i += s) {
                set.remove(i);
            }
            s = set.iterator().next();
        }
        for (int i : set) {
            System.out.println(i);
        }
    }
}


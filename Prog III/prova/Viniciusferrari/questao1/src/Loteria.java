import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Loteria{
    public static void main(String[] args) {
        /*
        Escreva um programa que imprima uma combinacao da loteria, escolhendo 6 numeros diferentes entre 1 e 60. Para escolher 
        seis numeros distintos, comece com um ArrayList preenchido com 1 ... 60. escolha um indice aleatorio e remova o elemento.
        Repita o processo 6 vezes. imprima o resultado em ordem decrescente.
        */

        ArrayList<Integer> lis1 = new ArrayList<>();
        ArrayList<Integer> lis2 = new ArrayList<>();

        for (int i = 1; i <= 60; i++) {
            lis1.add(i);
        }

        int j=0;
        for (int i = 0; i < 6; i++) {
            Random r1 = new Random();
            lis2.add(lis1.remove(r1.nextInt(60-j)));
            j++;
        }

        lis2.sort(null);
        System.out.print("[");
        for (int i = 5; i >= 0; i--) {
            System.out.print(lis2.get(i) + ", ");
        }
        System.out.print("]");
    
    }
}
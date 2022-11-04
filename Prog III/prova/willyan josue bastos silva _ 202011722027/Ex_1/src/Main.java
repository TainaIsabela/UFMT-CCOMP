package Ex_1.src;

import java.util.ArrayList;
import java.util.Random;

/*
Escreva um programa que imprima uma combinação de loteria, escolhendo seis números
diferentes entre 1 e 60. Para escolher seis números distintos, comece com um 
ArraList preenchido com 1 ... 60. Escolha um índice aleatório e remova o elemento.
Repita o processo seis vezes. Imprima o resultado em ordem decrescente.
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();

        for (int i = 1; i <= 60; i++) {
            valores.add(i);
        }

        Random rand = new Random();
        int[] loteria = new int[6];
        int pos = 0, indice = 60;

        for (int i = 0; i < 6; i++) {
            pos = rand.nextInt(indice--);
            loteria[i] = valores.get(pos);
            valores.remove(pos);
        }
        for (int i = 0; i < 5; i++){
            for (int j = i+1; j < 6; j++)
            if (loteria[i] < loteria[j]) {
                int temp = loteria[i];
                loteria[i] = loteria[j];
                loteria[j] = temp;
            }
        }
        System.out.print("Números sortiados: ");
        for (int i: loteria) System.out.print(i + " ");
    }
}

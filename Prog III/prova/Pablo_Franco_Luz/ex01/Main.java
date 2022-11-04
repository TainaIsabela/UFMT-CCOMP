/*

1. Escreva um programa que imprima uma combinação de loteria, escolhendo seis números diferentes
entre 1 e 60. Para escolher seis números distintos, comece com um ArrayList preenchido com 1 ... 60. 
Escolha um índice aleatorio e remova o elemento. Repita o processo seis vezes. Imprima o resultado em
ordem decrescente.

*/


import java.util.ArrayList;
import java.util.Random;

public class Main{
    
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < 60; i++){
            array.add(i);
        }

        Random numRandom = new Random();
        int[] numSorteado = new int[6];
        int j;
        System.out.println("Numeros Sorteados:");
        for(int i = 0; i < 6; i++){
            j = numRandom.nextInt(60); //pega um numero randomico entre 1 e 60
            numSorteado[i] = array.get(j);
            System.out.printf("[%d] ", numSorteado[i]); 
        }

        System.out.println();
        System.out.println("\nNumeros Sorteados em Ordem Decrescente:");
        int maior = numSorteado[0];
        int n = 0;
        for(int i = 0; i < 6; i++){
            for(int m = 0; m < 6; m++){
                if(numSorteado[m] > maior){
                    maior = numSorteado[m];
                    n = m;
                }
            }
            numSorteado[n] = 0;
            System.out.printf("[%d] ", maior);
            maior = 0;
        }
    }
}
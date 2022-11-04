package Ex01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 1. Escreva um programa que imprima uma combinação de loteria, escolhendo seis numeros diferentes entre 1 e 60.
 * Para escolher seis numeros distintos, comece com um arrayList preencheido com 1... 60. Escolha um indice aleatorio e remova o elemento.
 * Repita o processo 6 veses. Imprima o resultado em ordem crescente  
 */
public class Main{
    public static void main(String[] args) {

        ArrayList<Integer> loteria = new ArrayList<>();
        ArrayList<Integer> sorteado = new ArrayList<>();
        Random sorteador = new Random();

        for(int i = 1; i <= 60; i++){
            loteria.add(i);
        }

        //System.out.println(loteria);
        
        for(int i = 0; i < 6; i++){
            int valor = sorteador.nextInt(60);
            sorteado.add(loteria.indexOf(valor));
        }

        Collections.sort(sorteado);

        System.out.println(sorteado.toString());


    }
}
package Questao1;
import java.util.ArrayList;

// Escreva um programaque imprima uma combinação de loteria, escolhendo seis números diferentes entre 1 e 60. Para escolher seis números distintos,
// comece com um ArrayList preenchido com 1...60. Escolha um índice aleatório e remova o elemento. Repita o processo seis vezes. Imprima o resultado em
// ordem crescente.

public class Loteria {
    public static void main(String[] args) {
        ArrayList<Integer> sorteio = new ArrayList<>();
        ArrayList<Integer> numSorteados = new ArrayList<>();
        
        for(int i=1; i<= 60; i++) {
            System.out.println(i);
            sorteio.add(i);
        }
    
        for(int j=1; j<=6; j++) {
            int numSI = sorteio.get(j);
            numSorteados.add(numSI);
            sorteio.remove(numSI);
        }

        System.out.println(numSorteados);
    }
}
import java.util.ArrayList;

public class Loteria {
  // 8.Escreva um programa que imprima uma combinação de loteria, escolhendo seis números diferente entre 1 e 60. Para escolher seis números distintos, comece com um ArrayList preenchido com 1 ... 60. Escolha um índice aleatório e remova o elemento. Repita o processo seis vezes. Imprima o resultado em ordem crescente.
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    for (int i = 1; i <= 60; i++) {
      numeros.add(i);
    }
    for (int i = 0; i < 6; i++) {
      int indice = (int) (Math.random() * numeros.size());
      System.out.print(numeros.get(indice) + " ");
      numeros.remove(indice);
    }
    }
}

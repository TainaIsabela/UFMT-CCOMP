import java.util.ArrayList;

public class Loteria {
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
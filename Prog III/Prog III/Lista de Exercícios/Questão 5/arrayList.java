import java.util.ArrayList;

public class arrayList {
        // 5.Repita o exercício 4 usando um ArrayList para armazenar a tabela.
        public static void main(String[] args) {
        ArrayList<Integer> gasto = new ArrayList<Integer>();
        gasto.add(15000);
        gasto.add(23000);
        gasto.add(17000);
        gasto.add(17000);
        gasto.add(27000);
        gasto.add(17500);
        gasto.add(19000);
        gasto.add(21000);
        gasto.add(15000);
        gasto.add(21000);
        gasto.add(19000);
        gasto.add(20500);
        int total = 0;
        int media = 0;
        for (int i = 0; i < gasto.size(); i++) {
            total += gasto.get(i);
        }
        media = total / gasto.size();
        System.out.println("Total: " + total);
        System.out.println("Média: " + media);
    }
}

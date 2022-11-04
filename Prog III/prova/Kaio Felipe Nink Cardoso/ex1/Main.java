// Questão 1 - Sortear números da loteria
// Kaio Felipe Nink Cardoso 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lotteryArray = new ArrayList<>();
        for (int i = 1; i <= 60; i++) {
            lotteryArray.add(i);
        }
        ArrayList<Integer> result = Lottery.getLottery(lotteryArray);
        result.sort((Integer v1, Integer v2) -> v1 - v2);
        
        System.out.println("Numeros sorteados:\n"+result);
    }
}

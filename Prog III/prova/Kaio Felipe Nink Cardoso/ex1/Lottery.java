import java.util.ArrayList;

public class Lottery {

    static ArrayList<Integer> getLottery(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<>();
        int index, aux = 60;
        for (int i = 0; i < 6; i++) {
            index = (int) (Math.random() * (aux));
            result.add(arr.get(index));
            arr.remove(index);
            aux--;
        }

        return result;
    }
    
    

}
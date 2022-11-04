/*

Questao 1 

*/
import java.util.ArrayList;
import java.util.Random;

public class Loteria{
    public static void main(String[] args){
        ArrayList<Integer>arr = getNumbers();
        arr = bubbleSort(arr);
        System.out.println(arr);
    }

    public static ArrayList<Integer> getNumbers(){
        Random rand = new Random();
        ArrayList<Integer> valores = new ArrayList<Integer>();
        Integer auxiliar;
        for(int i=0; i<60;i++){
            System.out.println(i);
            auxiliar = rand.nextInt(59);
            if(auxiliar == 0){
                valores.add(1);
            }else{
                valores.add(rand.nextInt(59));
            }
        }
        return valores;
    }

    public static ArrayList<Integer>bubbleSort(ArrayList<Integer> arr){
        Integer aux;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size()-1;j++){
                if(arr.get(i)<arr.get(j)){
                    aux = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j,aux);
                }
            }
        }
        return arr;
    }
}

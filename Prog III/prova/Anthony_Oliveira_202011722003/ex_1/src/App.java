import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList l1 = new ArrayList<>();
        Random r = new Random();

        ArrayList sorteio = new ArrayList<>(); 
        int[] ordenado = {0,0,0,0,0,0}; 

        for(int i =1; i<=60; i++){
            l1.add(i);
        }

        for(int i =0; i<60; i++){
           //System.out.println(l1.get(i));
        }
        int contador =60;
        for(int i = 0; i<6; i++){
            int value = r.nextInt(contador);

            sorteio.add(l1.get(value));
            l1.remove(value);
            contador--;
         }
         
         for(int i = 0; i<6; i++){
            System.out.println(sorteio.get(i));
         }

        
    }
}

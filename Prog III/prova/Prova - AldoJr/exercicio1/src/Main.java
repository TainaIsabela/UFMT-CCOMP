import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


//exercicio 1 - Aldo JR;

public class Main {
    public static void main(String[] args) throws Exception {
        Random num = new Random();
        ArrayList<Integer> loteria = new ArrayList<>();
        ArrayList<Integer> NumsSorteados = new ArrayList<>();      
        Comparador comp = new Comparador(); 
        
        //Preenchendo o ArrayList
        for (int i = 0; i < 60; i++){
                loteria.add(i+1);
        }


        //Sorteando
        int j = 1;
        while(j <= 6){
            int numSorteado = num.nextInt(60-1);
            if(loteria.remove(numSorteado) != null){
                j++;
                NumsSorteados.add(numSorteado);
            }
        }

        //Ordenando
        Collections.sort(NumsSorteados, comp);


        System.out.println("Numeros Sorteados decrescentemente:");
        for(Integer i : NumsSorteados){
            System.out.println(i);
        }
        
        
    }
    
}

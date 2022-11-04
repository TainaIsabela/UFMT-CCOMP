package Questao1;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> loteria = new ArrayList<>();
        ArrayList<Integer> sorteio = new ArrayList<>();
        Random r = new Random();
        

        for(int i=0; i<60; i++){
            loteria.add(i);
        }
       

        for (int i=0; i<6; i++){
            int aux = r.nextInt(60-i);
            sorteio.add(loteria.get(aux));
            loteria.remove(aux);
        }

        System.out.println("Os numeros sorteados foram: ");

        for(Integer p:sorteio){
            System.out.println(p);
        }
    }
}

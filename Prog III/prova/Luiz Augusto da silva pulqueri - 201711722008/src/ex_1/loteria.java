package ex_1;

import java.util.ArrayList;
import java.util.Random;
/* 
01. escreva um programa que imprima uma combinaçao de loteria,
escolhendo 6 numeros diferentes entre 1 e 60.
*/
public class loteria {
    public static void main(String[] args) {
        ArrayList<Integer> loteria = new ArrayList<>();
        ArrayList<Integer> roleta = new ArrayList<>();
        Random aux = new Random();
        for (int i = 1; i < 61; i++) {
            roleta.add(i);
        }

        for (int i = 0; i < 5; i++) {
            int sort = aux.nextInt(roleta.size());
            //System.out.println(sort);
            loteria.add(roleta.remove(sort));
                       
        }

        loteria.sort((e1,e2)->{
            if(e1.intValue()>e2.intValue()){
                return 1;
            }else if(e1.equals(e2)){
                return 0;
            }else{
                return -1;
            }
        });
        

        System.out.println(loteria); 
        //System.out.println(roleta); //verificaçao se os elementos eram removidos

    }
}

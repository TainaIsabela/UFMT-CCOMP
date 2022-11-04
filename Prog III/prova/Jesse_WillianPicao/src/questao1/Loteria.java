package questao1;

import java.util.ArrayList;
import java.util.Random;

//RODAR MAIS DE UMA VEZ, POIS PODE DAR ERRO DE
public class Loteria {
    public static void main(String[] args) {
        ArrayList<Integer> meuArray= new ArrayList<>();
        for(int i=1; i<=60; i++){
            meuArray.add(i);
        }
        
        ArrayList<Integer> numerosLoteria = new ArrayList<>();
        for(int i=0; i<6; i++){
            Random numero= new Random();
            int number=numero.nextInt(61);
            numerosLoteria.add( meuArray.remove(number) ) ;
        }

        for(int i=0; i<6 ; i++){
            for(int j=0; i<6; i++){
                if( numerosLoteria.get(j) < numerosLoteria.get(j+1)  ){
                    numerosLoteria.set(j, numerosLoteria.get(j+1));
                }
            }
        }

        for(int i=0; i<5; i++){
            System.out.println( numerosLoteria.get(i) );
        }

        
    }



    
}

import java.util.ArrayList;
import java.util.Random;

/*Escreva um programa que imprima uma combinação de loteria, escolhendo seis numeros diferentes entre 1 e 60. 
Para escolher seis numeros distintos,comece com um arraylist preenchido com 1.. 60.
Escolha un indeice aleatorio e remova o elemtento.Repita o processo seis vezes. Imprima o resultado em ordem descrescente. */

public class Loteria {
    private ArrayList<Integer> roleta[];
    private int n;
    private ArrayList<Integer> count[];
    
    public Loteria(){}        
          
    for(int i; i <= 60; i++){
        roleta[i].add(i);         
    }

   public void escolher(){
        for(n = 0 ; n <= 6 ; n++ ){
        int i = sorteia();
            count[n] = roleta[i];
            roleta[i].remove(i);
        }
    }
    public int sorteia(){
        double i = Math.random();
            while(i > 0 || i < 60){
                return (int)i;
            }      
    }

}

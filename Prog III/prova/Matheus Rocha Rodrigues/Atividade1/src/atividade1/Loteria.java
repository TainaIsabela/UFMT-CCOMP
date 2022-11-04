/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.*;

/**
 *
 * @author Aluno-labB27
 */
public class Loteria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Num = 0;
        //ArrayList<int> escolhidos = new ArrayList<int>;
        
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Escolha um numero entre 1 e 60");
        while(Num < 1 && Num >60){
            Num = scan.nextInt();
        }*/
        
        Random rand = new Random();
        ArrayList<Integer> NumComb = new ArrayList<>();
        //NumComb.forEach((v)->{});
        
        boolean Attch = false;
        
        /*for(int i = 0; i < 6; i++){
            int rando = rand.nextInt(6);
            while(Attch == false){
                Attch = true;   
                    for (int a = 0; a < NumComb.size(); a++) {
                        if(NumComb.get(a) == rando+1){
                            Attch = false;
                            //break;
                        }             
                    }
            }*/
        
        for(int i = 0; i < 6; i++){
            int rando = rand.nextInt(60);
            NumComb.add(rando+1);  
        }
        
            for (int i = 0; i < 6; i++){
                System.out.println(NumComb);
                System.out.println("\nEscolha um indice de um elemento para removelo\n");
                int aux = scan.nextInt();
                
                NumComb.remove(aux);
                
            }
            
            //NumComb.s;
            
        
        }
    }
    

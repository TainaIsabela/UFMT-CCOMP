/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author Aluno-labB27
 */
public class Fila {
    public No noTree;
    //Iterador iterador = new Iterador();
    
    Fila(){
        this.noTree = null;
    }
    
    public class No {
        String nome;
        No Prox;
        
        No(String nome){
            this.nome = nome;
            this.Prox = null;
        }
    };
    
    public class Iterador {
        public No interaNo;
        
        public Iterador(){
            interaNo = null;
        }
        
        public No next() {
            if(hasNext() == true){
                return interaNo.Prox;
            }
            return null;
        }
        
        public boolean hasNext(){
            if(interaNo.Prox != null){
                return true;
            }else{
                return false;
            }
        }
        
    };
    
    public void adicionar (String strin) {
        No noAux = new No(strin);
        Iterador iterador = iterador();
        
        if(noTree == null){
            noTree = noAux;
        }else{
            iterador.interaNo = noTree;
            
            while(iterador.hasNext() == true){
                iterador.interaNo = iterador.next();
            }
            iterador.interaNo.Prox = noAux;
        }
        
    }
    
    public void remover () {
        No noAux;
        if (noTree != null){
            noTree = noTree.Prox;
        }
    }
    
    public Iterador iterador(){
        return new Iterador();
    }
}

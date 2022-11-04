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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fila fila = new Fila();
        
        fila.adicionar("ola");
        fila.adicionar("Mundo");
        fila.adicionar("Mu");
        
        System.out.println(fila.noTree.nome);
        System.out.println(fila.noTree.Prox.nome);
        System.out.println(fila.noTree.Prox.Prox.nome);
        
        fila.remover();
        System.out.println("\n" + fila.noTree.nome);
        
        fila.remover();
        System.out.println("\n" + fila.noTree.nome);
        System.out.println("\n" + fila.noTree.Prox);
        
        fila.remover();
        System.out.println("\n" + fila.noTree);
        
        fila.adicionar("a volta");
        System.out.println("\n" + fila.noTree.nome);
    }
    
}

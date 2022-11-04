/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

/**
 *
 * @author Aluno-labB27
 */
public class Plano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto p = new Ponto(2, 4);
        PontoRotulado p2 = new PontoRotulado("Esse aq é meu rotulo", 4, 8);
        Ponto p3 = new Ponto(2, 4);
        Ponto p4 = new Ponto(2, 7);
        
        
        System.out.println("p: " + p + "\n");
        System.out.println("p2: " + p2 + "\n");
        
        System.out.println("\n teste de p = p");
        System.out.println(p.equals(p));
        
        System.out.println("\n teste de p = p2");
        System.out.println(p.equals(p2));
        
        System.out.println("\n teste de p = p3");
        System.out.println(p.equals(p3));
        
        System.out.println("\n teste de p = p4");
        System.out.println(p.equals(p4));
    }
    
}

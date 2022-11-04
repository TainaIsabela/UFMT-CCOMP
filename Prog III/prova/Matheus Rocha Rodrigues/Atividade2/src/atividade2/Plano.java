/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;
import java.util.*;
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
        Ponto p = new Ponto (3, 4).transladar(1, 3).escalar(0.5);
        
        System.out.println("(" + p.getX() + ", " + p.getY() + ")");
    }
    
}

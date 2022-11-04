package Questao5;

import Questao5.Ponto.PontoRotulado;

// Defina classe Ponto para representar um ponto com coordenadas x e y. Forneça um construtor para inicializar as coordenadas e métodos de acesso getX() e getY().
// Defina a subclasse PontoRotulado com um construtor PontoRotulado(String rotulo, double x, double y) e um método de acesso getRotulo(). Defina os métodos toString()
// e equals() para as classes. Faça um programa de teste.

public class Main {
    public static void main(String[] args) {
        Ponto i = new Ponto( 3, 4);
        System.out.println(i);
        System.out.println(i.getX());
        System.out.println(i.getY());
        
        PontoRotulado r = new PontoRotulado("rotulo", 3, 4);

        System.out.println(r);
        System.out.println(r.getX());
        System.out.println(r.getY());
        System.out.println(r.getRotulo());

        
    }
}

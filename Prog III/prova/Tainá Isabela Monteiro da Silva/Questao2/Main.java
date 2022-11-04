package Questao2;

// Implemente uma classe imutável chamada Ponto com coordenadas específicas, um construtor sem argumentos para definir um ponto na origem e métodos getX()
// e getY() para obter as coodernadas do ponto. Escreva também os métodos transladar() e escalar(). O método de escalar() deve redimensionar ambas as coodernadas
// por um determinado fator. Implemente esses métodos para que eles retornem novos pontos com os resultados. Por exemplo, Ponto P = new Ponto (3,4).transladar(1, 3).escalar(0.5);
// deve definir p como ponto com coordenadas(2.0, 3.5);

public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto(3,4).transladar(1, 3).escalar(0.5);
        System.out.println(p.getX());
        System.out.println(p.getY());

    }
}

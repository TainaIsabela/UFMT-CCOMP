/**
 * Implemente uma classe imutavel chamada ponto que descreva um ponto no plano.
 * forneça um construtor para criar um ponto com coordenadas especificas, um construtor sem argumentos para definir um ponto na origem e metodos getX() e getY() para obter
 * as coordenadas do ponto. Escreva tambem os metodos transladar() e escalar(). O metodo de escalar() deve redimensionar ambas as coordenadas por um determinado fator.
 * Implemente eses metodos para que eles retornem novos pontos com resultados. Por exemplo, Ponto p = new Ponto(3,4).transladar(1,3).escalar(0.5), deve definir p como um ponto com
 * coordenadas(2,3.5). 
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Ponto p = new Ponto(3.0f, 4.0f).transladar(1.0f, 3.0f).escalar(0.5f);
        System.out.println("Ponto x: " + p.getX()+ " Ponto y: "+ p.getY());
    }
}

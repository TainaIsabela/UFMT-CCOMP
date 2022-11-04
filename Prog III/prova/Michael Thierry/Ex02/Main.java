package Ex02;
/**
 * 2. Implemente uma classe imutavel chamada ponto que descreva um ponto no plano. Forneça um construtor para criar um ponto com coordenada
 * especificas, um construtor sem argumentos para definir um ponto na origeme metodos getX() e getY() para obter as coordenadas do ponto. 
 * Escreva tambem os metodos transladar e escalar. O metodo transladar deve mover o ponto por uma determinada distancia na diereção x e y. O metodo de 
 * escalar deve redimensionar as coordenadas por um determinad fator. Implemente esses metodos para que eles retornem novos pontos como resultados.
 * Por exemplo: Ponto p = new Ponto(3,4).translada(1,3).escalar(0.5); deve definir o p como (2, 3.5);  
 */
public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto(3, 4).transladar(1, 3).escalar(0.5);

        System.out.println(p.getX() +" "+ p.getY());
    }
}

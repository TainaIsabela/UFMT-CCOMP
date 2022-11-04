/*

5. Defina a classe abstrata chamada Shape com uma variavel de instancia da classe Ponto
(que modela um ponto igual o exercicio 2), um construtor, um método concreto 

público moveBy(double dx, double dy) 

que move o ponto por uma dada distância nas direções x e y,
e um método abstrato público  Ponto getCenter. Defina subclasses concretas Círculo, 
Retangulo com construtores public Circulo(Ponto centro, double raio), 
public Retangulo(Ponto topoEsquerdo, double largura, double altura). No programa principal,
teste as classes.

*/

public class Main{
    public static void main(String[] args) {
        Ponto ponto = new Ponto( 3, 4);
        Ponto ponto_2 = new Ponto();
        Circulo circle = new Circulo(ponto, 3);
        Retangulo rectangle = new Retangulo(ponto_2, 5, 7);

        System.out.println("\nCirculo -> ("+circle.getPoint().x+", "+circle.getPoint().y+")");
        System.out.println("Retangulo -> ("+rectangle.getPoint().x+", "+rectangle.getPoint().y+")\n");

        System.out.println("Centro do Circulo -> ("+circle.getCenter().x+", "+circle.getCenter().y+")");
        System.out.println("Centro do Retangulo -> ("+rectangle.getCenter().x+", "+rectangle.getCenter().y+")\n");
        
    }
}
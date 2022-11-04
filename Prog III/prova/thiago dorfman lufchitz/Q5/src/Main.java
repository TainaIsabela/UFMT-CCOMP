/*Defina a classe abstrata chamada shape com uma variavel de instancia da classe ponto(que modela um ponto tal como o do eexcicio 2), um construtor, um metodo concreto
public void move By(double dx, double dy ) que move o ponto por uma dada distancia nas direcoes x e y, e um metodo abstrato publico Ponto getCenter().
Defina subclasse concreta Retangulo(Ponto topoEsquerdo, double largura, double altura). No programa principal, teste as classes. */
public class Main {
    public static void main(String[] args) {
     Ponto p1 = new Ponto(1.0,1.0);
     Shape s1 = new Shape(2.0, 3.0);
     Circulo c1 = new Circulo(5.0, 5.0, p1, 2.5);
     Retangulo r1 = new Retangulo(3.0, 3.0, p1, 7.0, 7.0);
     s1.moveBy(5.0, 5.0);
     r1.moveBy(5.0, 5.0);
     c1.moveBy(5.0, 5.0);
     
     System.out.println(s1);
     System.out.println(r1);
     System.out.println(c1);
    }
}

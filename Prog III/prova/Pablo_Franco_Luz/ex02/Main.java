/*
ALUNO: Pablo Franco Luz

2. Implemente uma classe chamada Ponto que descreva um ponto no plano. Forneça um construtor
para criar um ponto com coordenadas específicas, um construtor sem argumentos para definir um 
ponto na origem e metodos getX() e getY() para obter as coordenadas do ponto. Escreva também os métodos 
transladar() e escalar(). O método modificador transladar deve mover o ponto por uma determinada distancia 
na direção X e Y. O metodo modificador escalar() deve redimensionar ambas as coordenadas por um determinado fator.
No programa principal, teste as funcionalidades da classe Ponto

*/
public class Main{
    public static void main(String[] args) {
        Ponto ponto = new Ponto();
        System.out.println("\nDefinindo um ponto na origem -> ("+ponto.getX()+", "+ponto.getY()+")");

        Ponto ponto2 = new Ponto(3, 2);
        System.out.println("\nDefinindo um ponto -> ("+ponto2.getX()+", "+ponto2.getY()+")");

        ponto2.transladar(2, 2);
        System.out.println("\nUtilizando método transladar() -> ("+ponto2.getX()+", "+ponto2.getY()+")");

        ponto2.escalar(3, 3);
        System.out.println("\nUtilizando método escalar() -> ("+ponto2.getX()+", "+ponto2.getY()+")\n");
    }
}

/* Questão 5: implemente uma classe imutavel chamada Ponto com coordenadas que desceva um ponto no plano...
 Aluno Gabriel Rodriges Fernandes RGA = 201911722005
*/
package coordenadas;
public class Coordenadas {
    
    public static void main(String[] args) {
        Ponto p = new Ponto(3,4);
        p.Transaladar(1, 3);
        p.Escalar(0.5f);
        
        System.out.println("Coordenadas : "+"("+p.getX()+" "+p.getY()+")");
    }
    
}

package Questao5;

public class main {
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(2, 3);
        Ponto p2 = new Ponto(10, 20);
        

        Circulo c = new Circulo(p1, 4);
        Retangulo ret = new Retangulo(p2, 8, 4);

        System.out.println("Circulo de centro "+"("+c.getCenter().getX()+","+c.getCenter().getY()+")"+" e raio "+c.getRaio());
        System.out.println("Retangulo com centro "+"("+ret.getCenter().getX()+","+ret.getCenter().getY()+")"+" largura "+ret.getLargura()+" e altura "+ret.getAltura());

    }
}

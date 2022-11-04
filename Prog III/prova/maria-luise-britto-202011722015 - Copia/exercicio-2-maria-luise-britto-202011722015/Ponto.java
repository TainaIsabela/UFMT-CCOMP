import java.util.Scanner;
//MARIA LUISE BRITTO - 202011722015
//Implemente uma classe chamada Ponto...
public class Ponto {
    private  int x;
    private  int y; 

    public Ponto(int px, int py) {
        px = x;
        py = y;
    }

    public void Origem() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void transladar(int px, int py) {
        px += x;
        py += y;
    }

    public void escalar(int px, int py, int fator) {
        px = px * fator;
        py = py * fator;
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("USANDO O METODO TRANSLADAR: ");
        transladar(5, 8);

        System.out.println("RESULTADO: ");

        System.out.println("USANDO O METODO ESCALAR: ");
        escalar(5,8,2);

        System.out.println("RESULTADO: ");


    }


}
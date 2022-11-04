package ex_2;
/*
implemente uma classe chamada ponto, que descreve um ponto no plano
FOrneça um construtor para criar um ponto con coordenadas especificas,
um construtor sem argumentos para definir um ponto na origem e metodos getX e getY
para obter as coordenadas do ponto. escrevea tambem 
os metodos trasladar() e escalar().
*/
public class ponto {
    private int x;
    private int y;

    public ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ponto(){
        this.x = 0;
        this.x = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void transladar(int x, int y){
        this.x +=x;
        this.y +=y;
    }

    public void escalar(int z){
        this.x *=z;
        this.y *=z;
    }

    @Override
    public String toString(){
        return "X: "+ this.x+ "\nY: "+this.y;
    }
    
}

/*Implemente uma classe chamada Ponto que descreva um ponto no plano.Forneça um cosntrutor para criar um ponto com coordenada especificas,
um construtor sem argumentos para definir um ponto na origem e metodos getX() e getY() para obter as coordenadas do ponto.
Escreva tambem os metodos transladar() e escalar(). O metodo modificador tranladar deve mover  ponto por uma determinada distancia na direcao x e y.
O metodo modificar escalar() deve redimensionar ambas as coordenadas por um determinado fator. No programa principal teste as funcionalidades da classe ponto  */

public class Ponto {
    private int x;
    private int y;

    public Ponto() {}

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x;}

    public void setX(int x) { this.x = x;}

    public int getY() { return y;}

    public void setY(int y) { this.y = y;}

    public void transladar(int codx, int cody){
        codx = getX() + codx;
        cody = getY() + cody;
        setX(codx);
        setY(cody);

    }
    public void escalar(int codx){
        int aux = codx;
        codx = getX() + codx;
        aux = getY() + codx;
        setX(codx);
        setY(aux);
    }
}


    

package ex_5;
import ex_2.ponto;

public abstract class Shape {
    protected ponto coordenada;

    // construtores
    public Shape(ponto coordenada) {
        this.coordenada = coordenada;
    }

    public Shape() {
        this.coordenada = new ponto();
    }

    public Shape(int x,int y) {
        this.coordenada = new ponto(x,y);
    }

    // metodos
    public void moveBy(int x,int y){
        this.coordenada.transladar(x, y);
    }

    public abstract ponto getCenter();
        
}

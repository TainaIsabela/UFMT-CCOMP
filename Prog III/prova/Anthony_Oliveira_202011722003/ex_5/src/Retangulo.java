public class Retangulo extends Shape{

    Ponto topoEsquerdo;
    double largura;
    double altura;

    public Retangulo(Ponto topoEsquerdo, double largura, double altura){
        this.topoEsquerdo = topoEsquerdo;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Ponto getCenter() {
        double x1;
        double y1;
        x1 = largura/2; // centro em x
        y1 = altura /2; // centro em y

        setX(topoEsquerdo.getX());
        setY(topoEsquerdo.getY());
        
        // adiciona em x e y  o quanto falta para chegar ao centro
        moveBy(x1, y1);

        // cria um ponto auxiliar a ser retornado
        Ponto aux = new Ponto(getX(),getY());
        /*
        Ponto aux = new Ponto(topoEsquerdo.getX(), topoEsquerdo.getY());
        aux.setX(x1+aux.getX()); // adiciona em x quanto falta para chegar ao centro
        aux.setY(y1+aux.getY()); // adiciona em y o quanto falta para chegar ao centro
        */

        return aux;
    }

    

   
    
}

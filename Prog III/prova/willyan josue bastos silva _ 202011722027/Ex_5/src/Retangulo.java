package Ex_5.src;

public class Retangulo extends Shape {

    private double largura, altura;
    
    public Retangulo(Ponto topoEsquerdo, double largura, double altura) {
        super(topoEsquerdo);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public Ponto getCenter() {
        return new Ponto(this.largura/2.0, this.altura/2.0);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    } 

    
}

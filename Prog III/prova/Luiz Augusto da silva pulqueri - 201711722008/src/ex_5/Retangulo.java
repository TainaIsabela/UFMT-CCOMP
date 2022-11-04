package ex_5;

import ex_2.ponto;

public class Retangulo extends Shape {
    private double largura;
    private double altura;
    
    public Retangulo(ponto topoEsquerdo, double largura, double altura) {
        super(topoEsquerdo);
        this.largura = largura;
        this.altura = altura;
    }

    
    public double getLargura() {
        return largura;
    }


    public double getAltura() {
        return altura;
    }


    @Override
    public ponto getCenter() {
        ponto centro = new ponto(
            (int)(coordenada.getX()+(largura/2)),
            (int)(coordenada.getY()+(altura/2)));

        return centro;
        
    }
    
}

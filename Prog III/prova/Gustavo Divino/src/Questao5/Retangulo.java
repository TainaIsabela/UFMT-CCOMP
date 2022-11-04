package Questao5;

public class Retangulo extends Shape{
    private double largura, altura;


    //Getters e Setters
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

    
    public Retangulo(Ponto topoEsquerdo, double largura, double altura) {
        super(topoEsquerdo);
        this.largura=largura;
        this.altura=altura;        
    }

    @Override
    public Ponto getCenter() {
        
        //Usando o moveBy, porém desta maneira o ponto será modificado
        //this.moveBy((point.getX()+largura)/2, (point.getY()-altura)/2);
        //return point;

        Ponto novo = new Ponto((point.getX()+largura)/2, (point.getY()-altura)/2);
        return novo;
    }
    
}

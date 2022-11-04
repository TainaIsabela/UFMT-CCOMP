public class Retangulo extends Shappe {
   private double largura, altura;

    @Override
    public Ponto getCenter() {
        return this.ponto;
    }

    public Retangulo(Ponto ponto, double largura, double altura) {
        super(ponto);
        this.largura = largura;
        this.altura = altura;
    }
    
}

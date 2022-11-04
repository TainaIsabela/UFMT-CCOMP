public class Retangulo extends Shape{
    //public Ponto topoEs

    public Retangulo(Ponto topoEsquerdo, double largura, double altura){
        super(topoEsquerdo);
        topoEsquerdo.x = largura;
        topoEsquerdo.y = altura;
    }

    public Ponto getPoint(){
        return getPonto();
    }

    @Override
    public Ponto getCenter() {
        //novo.x = getPonto().x / 2;
        return new Ponto(getPonto().x / 2, getPonto().y / 2);
    }
}

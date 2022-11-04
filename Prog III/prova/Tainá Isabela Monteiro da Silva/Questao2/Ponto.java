package Questao2;

public final class Ponto {
    double x;
    double y;

    public Ponto() {
    }
    
    public Ponto(double cx, double cy) {
        this.x = cx;
        this.y = cy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Ponto transladar (double mx, double my){

        Ponto T = new Ponto(x+mx, y+my);

        return T;
    }

    public Ponto escalar (double fator) {
        Ponto E = new Ponto(x * fator, y * fator);

        return E;
    }

    
}

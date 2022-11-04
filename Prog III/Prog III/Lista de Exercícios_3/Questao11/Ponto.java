package Questao11;

// Defina a classe Ponto para representar um ponto com coordenadas x e y. Forneça um construtor para inicializar as coordenadas e métodos de acesso getX() e getY(). Defina a subclasse PontoRotulado com um construtor PointoRotulado(String rotulo, double x, double y) e um método de acesso getRotulo().

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static class PontoRotulado extends Ponto {
        private String rotulo;

        public PontoRotulado(String rotulo, double x, double y) {
            super(x, y);
            this.rotulo = rotulo;
        }

        public String getRotulo() {
            return rotulo;
        }
    }
}


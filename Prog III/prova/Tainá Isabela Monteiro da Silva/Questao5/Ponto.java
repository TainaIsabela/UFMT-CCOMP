package Questao5;

public class Ponto {
    public double x;
    public double y;

    public Ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
        public String toString() {
            return super.toString();
        }

    @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

    public class PontoRotulado extends Ponto{
        String rotulo;

        public PontoRotulado(String rotulo, double x, double y) {
            super(x, y);
            this.rotulo = rotulo;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public String getRotulo() {
            return rotulo;
        }
    }

}

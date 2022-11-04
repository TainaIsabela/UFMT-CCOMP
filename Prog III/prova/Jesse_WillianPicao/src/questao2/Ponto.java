package questao2;


public class Ponto {
	public static void main(String[] args) {
        Ponto p = new Ponto(3.0,4.0).transladar(1.0,3.0).escalar(0.5);
        System.out.println("Cordenada x: " + p.getX() + " y: "+ p.getY());
    }

    private double x;
    private double y;
    
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(){
        this.x=0;
        this.y=0;
    }

    public Ponto transladar(double valorX, double valorY){
        double xNovo= this.x + valorX;
        double yNovo= this.y + valorY;
        Ponto novoPonto= new Ponto( xNovo, yNovo );

        return novoPonto;
    }

    public Ponto escalar(double fator){
        double xNovo= this.x * fator;
        double yNovo= this.y * fator;
        Ponto novoPonto= new Ponto( xNovo, yNovo );

        return novoPonto;
    }

}


public final class Ponto {
	private double x, y;
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Ponto(double x, double y) {
		this.x = x; //3
		this.y = y; //4
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public Ponto transladar(double x, double y) {
		return new Ponto(this.x+x, this.y + y); //4,7
	}
	
	public Ponto escalar(double fator) {
		return new Ponto (this.x*fator, this.y*fator); //4*0.5=2
	}
}

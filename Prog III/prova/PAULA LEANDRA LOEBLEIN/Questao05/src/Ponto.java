
public class Ponto {
	protected double x, y;
	
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
		Ponto pt = new Ponto(x,y);
		return "x: " +pt.getX()+" y:"+pt.getY(); //nao lembro como retorna
	}
	
	@Override
	//verifica se 2 objetos sao iguais
	public boolean equals(Object obj) {
		Ponto pt = new Ponto(x,y);
		
		if(this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (pt == obj) {
			return false;
		}
		Ponto p =  (Ponto) obj;
		
		return (this.x==p.x)&& (this.y==p.y);
	}
	
	
}

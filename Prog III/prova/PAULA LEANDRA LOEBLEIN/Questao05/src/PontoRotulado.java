
public class PontoRotulado extends Ponto{
	private String rotulo;
	
	public PontoRotulado(double x, double y, String rotulo) {
		super(x, y);
		this.rotulo = rotulo;
	}
	
	public String getRotulo() {
		return rotulo;
	}
	
	@Override
	public String toString() {
		PontoRotulado pr = new PontoRotulado(x,y,rotulo);
		return "x: " +pr.getX()+" y:"+pr.getY()+ " rotulo: "+pr.getRotulo(); //nao lembro como retorna
	}
	
	@Override
	//verifica se 2 objetos sao iguais
	public boolean equals(Object obj) {
		PontoRotulado pr = new PontoRotulado(x,y,rotulo);
		
		if(this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (pr == obj) {
			return false;
		}
		PontoRotulado ptr =  (PontoRotulado) obj;
		
		return (this.x==ptr.x)&& (this.y==ptr.y);
	}
	
}

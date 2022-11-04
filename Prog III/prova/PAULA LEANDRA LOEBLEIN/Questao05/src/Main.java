
public class Main {
	public static void main(String[] args) {
		PontoRotulado pr = new PontoRotulado(2, 3, "PONTO 1");
		PontoRotulado pr2 = new PontoRotulado(2, 4, "PONTO 1");
		Ponto pt = new Ponto(3, 4);
		Ponto pt2 = new Ponto(3, 4);
		
		//EQUALS
		//PONTO
		if (pt.equals(pt2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		//PONTO ROTULADO
		if (pr.equals(pr2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		
		//TOSTRING
		//PONTO ROTULADO
		System.out.println(pr.toString());
		//PONTO
		System.out.println(pt.toString());
	}
	
}


public class Main {

	public static void main(String[] args) {
		Ponto p = new Ponto(3, 4).transladar(1, 3).escalar(0.5);
		System.out.println("X: "+p.getX()+" Y: "+p.getY());

	}

}

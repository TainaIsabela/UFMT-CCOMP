package questao5;

public class PontoRotulado extends Ponto {
    String rotulo;
	public static void main(String[] args) {
		PontoRotulado p1Rotulado = new PontoRotulado(3,4, "Sou ponto1");
        String m3 = p1Rotulado.toString();
        System.out.print(m3);

        PontoRotulado p2Rotulado = new PontoRotulado(3,4, "Sou ponto1");
        String m4 = p2Rotulado.toString();
        System.out.print(m4);

        System.out.println("p1Rotulado e p2Rotulado são iguais? "+ p1Rotulado.equals(p2Rotulado));
	
	}
    public PontoRotulado(int x, int y, String rotulo) {
        super(x, y);
        this.rotulo = rotulo;
    }

    public PontoRotulado(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    
    @Override
    public String toString() {
        return super.toString() + " ROTULO: " + this.getRotulo();
    }


    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        PontoRotulado p= (PontoRotulado)obj;
        //System.out.println(p.getX() + "  " + p.getY());
        return this.getX()== p.getX() && this.getY() == p.getY() && this.getRotulo() == p.getRotulo();
    }
    
}
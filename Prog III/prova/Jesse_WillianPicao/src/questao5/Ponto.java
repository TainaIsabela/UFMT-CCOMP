package questao5;

public class Ponto {
	public static void main(String[] args) {
        Ponto p1 = new Ponto(3,4);
        String m1 = p1.toString();
        System.out.print(m1);

        Ponto p2 = new Ponto(3,4);
        String m2 = p1.toString();
        System.out.print(m2);

        System.out.println("p1 e p2 são iguais? "+ p1.equals(p2));
    }
	
	private int x;
	private int y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Ponto(){
        this.x=0;
        this.y=0;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String mensagem="";
        mensagem = "X: " + this.getX() +" Y: " + this.getY();
        return mensagem;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Ponto p= (Ponto)obj;
        //System.out.println(p.getX() + "  " + p.getY());
        return this.getX()== p.getX() && this.getY() == p.getY();
    }
}
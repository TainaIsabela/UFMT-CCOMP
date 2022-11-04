public class Gerente extends Funcionario {
   private String area;

   public Gerente(String nome, String area) {
      super(nome);
      this.area = area;
   }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
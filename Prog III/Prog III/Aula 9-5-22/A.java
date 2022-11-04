public class A implements X{

    public void f1() {
        System.out.println("Método especifico de A");
    }

    @Override
    public void imprime () {
        System.out.println("Implementação em A");
    }
}
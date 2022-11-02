public class B implements X{
    
    public void f2() {
        System.out.println("Método especifico de B");
    }

    @Override
    public void imprime() {
        System.out.println("Implementação em B");
    }
}

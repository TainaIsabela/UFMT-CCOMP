public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> lista = {new Funcionario("taina"), new Funcionario("isabela")};

        processaFunc(lista);

        Gerente[] listaG = {new Gerente("taina", "TI"), new Gerente("isabela", "RH")};

        processaFunc(listaG);
    }
    public static void processaFunc(Funcionario[] staff){
        for(Funcionario f : staff){
            System.out.println(f.getNome());
        }
    }
}
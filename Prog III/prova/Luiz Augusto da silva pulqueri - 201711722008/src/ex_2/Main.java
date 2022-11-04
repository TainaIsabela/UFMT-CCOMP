package ex_2;

/*
no programa principal teste os metodos da classe ponto
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("construtor vazio");
        ponto teste = new ponto(); // teste do construtor vazio
        System.out.println(teste);

        System.out.println("construtor de coordenada\n");
        teste = new ponto(2,4);
        System.out.println(teste);


        System.out.println("teste de escalar\n");
        teste.escalar(3);
        System.out.println(teste);

        System.out.println("teste de translaçao\n");
        teste.transladar(4, -4);
        System.out.println(teste);

    }
}

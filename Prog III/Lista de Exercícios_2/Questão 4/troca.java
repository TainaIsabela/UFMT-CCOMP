public class troca {
    //Questão 4: É possível implementar um método Java que troque o conteúdo de duas variáveis int? E no caso de dois objetos Integer? Escreva um método para testar cada caso e explique os resultados. -->

    // Sim, sim.
    
    //Método para trocar o conteúdo de duas variáveis int
    public static void trocaInt(int a, int b){
        int aux = a;
        a = b;
        b = aux;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
    // fazer a troca no caso de dois objetos Integer
    public static void trocaObj(Integer a, Integer b){
        Integer aux = a;
        a = b;
        b = aux;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer c = 30;
        Integer d = 40;

        trocaInt(a, b);
        trocaObj(c, d);

    }
}

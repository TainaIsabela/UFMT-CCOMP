package ex_3;

public class Main {
    public static void main(String[] args) {
        pilha novaPilha = new pilha();

        System.out.println("teste de push\n");
        novaPilha.push("novo");
        novaPilha.push("teste1");
        novaPilha.push("teste2");
        novaPilha.push("teste3");
        novaPilha.push("penultimo");
        novaPilha.push("ultimo");
        novaPilha.show();

        System.out.println("\nteste de 'pop'\n");
        novaPilha.pop();
        novaPilha.show();

        System.out.println("\n");
        novaPilha.pop();
        novaPilha.show();
    }
}

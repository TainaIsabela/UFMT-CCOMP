package Questao3;

public class main {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.push("Gustavo");
        p.push("Linder");
        p.push("Paula");

        p.pop();
        

        //Imprime o conteúdo da pilha
        p.printaPilha();
    }
}

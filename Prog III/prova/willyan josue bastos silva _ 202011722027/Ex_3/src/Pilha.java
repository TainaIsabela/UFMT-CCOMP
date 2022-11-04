package Ex_3.src;

public class Pilha {

    private No node;
    
    private static class No {
        String nome;
        No prox;
    }

    public Pilha() {
        node = new No();
    }

    public void push(String nome) {
        if (node == null) {
            node.nome = nome;
            node.prox = null;
        } else {
            No aux = new No();
            aux.nome = nome;
            aux.prox = node;
            node = aux;
        }
    }

    public void pop() {
        if (node == null) {
            System.out.println("Pilha nula!");
        } else {
            No aux = node;
            No ant = aux.prox;
            node = ant;
        }
    }

    public void show() {
        No aux = node;
        while ( aux.prox != null) {
            System.out.println(aux.nome);
            aux = aux.prox;
        }
    }
    
}

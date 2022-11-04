// Implemente uma classe genérica Pilha<E> que gerencia um ArrayList de elementos do tipo E. Forneça os métodos push() para empilhar, pop() para desempilhar e isVazia() para testar se a pilha está vazia.

package Questao6;

public class main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        pilha.push(9);
        pilha.push(10);
        
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        pilha.isVazia();

    }

    public class pilha<E> {
        private ArrayList<E> pilha = new ArrayList<E>();
        public void push(E elemento) {
            pilha.add(elemento);
        }
        public E pop() {
            return pilha.remove(pilha.size() - 1);
        }
        public boolean isVazia() {
            return pilha.isEmpty();
        }
    }
};
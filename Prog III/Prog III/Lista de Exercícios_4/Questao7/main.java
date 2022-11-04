// Reimplemente a classe Pilha<E>, usando um array para armazenar os elementos. Se necessário, aumente o array no método push. Forneça duas soluções, uma com um array E[] e outra com um array Object[]. Ambas as soluções devem compilar sem warnings. Qual você prefere e por quê?

package Questao1.Questao7;

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

    public class pilha<Object> {
        private Object[] pilha = new Object[10];
        public void push(Object elemento) {
            pilha[pilha.length] = elemento;
        }
        public Object pop() {
            return pilha[pilha.length - 1];
        }
        public boolean isVazia() {
            return pilha.length == 0;
        }
    }
}
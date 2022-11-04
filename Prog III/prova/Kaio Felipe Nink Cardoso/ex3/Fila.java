public class Fila {
    
    private No inicio;

    private class No {
        private int valor;
        private No prox;
        
        private No(int valor){
            this.valor = valor;
            this.prox = null;
        }
        
    }

    private class Iterador {
        private No next(No no){
            return no.prox; 
        }
        private boolean hasNext(No no){
            return no.prox != null;
        }
        
    }

    public void adicionar(int valor){
        No novo = new No(valor);

        if (this.inicio == null){
            this.inicio = novo;
        }
        else {
            Fila.Iterador iter = iterador();
            No aux = this.inicio;
            while(iter.hasNext(aux)){
                aux = iter.next(aux);
            }
            aux.prox = novo;
        }
    }

    public void remover(){
        inicio = inicio.prox;
    }

    public void imprimir(){
        Fila.Iterador iter = iterador();
        No aux = inicio;
        System.out.println("Elementos da fila:");
        while (aux != null) {
            System.out.println(aux.valor);
            aux = iter.next(aux);
        }
        System.out.println();
    }

    private Fila.Iterador iterador(){
        return new Iterador();
    }
}

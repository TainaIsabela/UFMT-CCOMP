public class Fila {
    No primeiro, ultimo;

    public static class No{
        private String nome;
        private No prox;

        public No(String nome){
            this.nome = nome;
            prox = null;
        }
    }

    public void adicionar(String nomeNo){
        No newNo = new No(nomeNo);
        if(primeiro == null){
            primeiro = newNo;
            ultimo = newNo;
        }else{
            ultimo.prox = newNo;
            ultimo = newNo;
        }
    }

    public void remover(){
        if(primeiro == null){
            System.out.println("lista vazia");
        }
        
        if(primeiro.prox == null){
            primeiro = null;
            ultimo = null;

        }else{
            No aux = primeiro;
            primeiro = primeiro.prox;
            aux = null;
        }
    }
    public class Iterador{
        No proximo;
        public No next(){
            
            proximo = primeiro.prox;
            return proximo;
        }

        public boolean hasNext(){
            return proximo.prox != null;
        }
    }
}

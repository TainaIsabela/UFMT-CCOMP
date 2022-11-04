public class Pilha {

    private No posicao;
    private No posicaoAux;

   public void imprimir(){
       posicaoAux = posicao;
       while (posicaoAux != null){
           System.out.println(posicaoAux.getelemento());
           posicaoAux = posicaoAux.getProx();
       }
   }


    public void push(String elemento){
        No aux = new No(elemento);

        if(this.posicao == null){
            this.posicao = aux;
        }else{
            aux.setProx(posicao);
            posicao = aux;
        }

    }

    @Override
    public String toString() {
        return "Pilha [posicao=" + posicao.getelemento() + "]";
    }

    public void pop(){
        if(posicao != null){
            posicao = posicao.getProx();
        }
    }



    

    static class No{
        private String elemento;
        private No prox;

        public No(String elemento, Pilha.No prox) {
            this.elemento = elemento;
            this.prox = prox;
        }

        public No(String elemento) {
            this.elemento = elemento;
            this.prox = null;
        }

        public String getelemento() {
            return elemento;
        }

        public void setelemento(String elemento) {
            this.elemento = elemento;
        }
        public No getProx() {
            return prox;
        }
        public void setProx(No prox) {
            this.prox = prox;
        }

        
    }
}

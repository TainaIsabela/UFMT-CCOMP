public class Pilha {
    public class No{
        private String string;
        private No prox;

        public No(String string, No prox){
            this.string = string;
            this.prox = null;
        }

        public No(){
            this.string = " ";
            this.prox = null;
        }

        public String getString() { return string; }
        public void setString(String string) { this.string = string; }
        public No getProx(){return prox;}

    }
    //private String string;


    //adiciona strings na pilha
    public Pilha.No push(Pilha.No pi, String str){
        Pilha.No novo = new Pilha.No(str, null);
        if(pi.getString() == " "){
            pi = novo;
            return pi;
        }else{
            Pilha.No aux = pi;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux = novo; 
            return aux;
        }
        //return obj;
    }

    //remove strings da pilha
    public void pop(){

    }
}

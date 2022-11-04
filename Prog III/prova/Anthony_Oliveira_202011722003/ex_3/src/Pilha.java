public class Pilha {
    
    String value;
    Pilha prox = null;

    public Pilha(){
        this.value = "";
    }  

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



    public Pilha push(String valor){
        if (this.value == ""){
            setValue(valor);
            return this;
        }
        Pilha p = new Pilha();
        p.setValue(valor);
        p.prox = this;
        return p;
        
    }

    public Pilha pop(){
        if(this.prox == null){
            System.out.println("A Pilha esta vazia");
            return null;
            
        }
        return this.prox;
        
    }


    public void show(){
        Pilha aux = this;
        if (aux != null){
            System.out.println("Pilha: ");
            while(aux != null){
                
                System.out.println(aux.getValue());
                
                
                aux = aux.prox;
            }
            System.out.println("\n\n");
        }
        
    }
}

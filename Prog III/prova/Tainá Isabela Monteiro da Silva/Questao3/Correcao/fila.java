
public class fila {
    private No inicio;
    private No fim;
    private int tamanho;
    
    public fila() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }
    
    public void adicionar(String elemento) {
        No novo = new No(elemento);
        if(inicio == null) {
            inicio = novo;
            fim = novo;
        }
        else {
            fim.setProximo(novo);
            fim = novo;
        }
        tamanho++;
    }
    
    public String remover() {
        if(inicio == null) {
            return null;
        }
        String elemento = inicio.getElemento();
        inicio = inicio.getProximo();
        tamanho--;
        return elemento;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
    public boolean isEmpty() {
        return inicio == null;
    }
    
    public Iterator iterator() {
        return new Iterator();
    }
    
    private class No {
        private String elemento;
        private No proximo;
        
        public No(String elemento) {
            this.elemento = elemento;
            proximo = null;
        }
        
        public String getElemento() {
            return elemento;
        }
        
        public No getProximo() {
            return proximo;
        }
        
        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }
    
    private class Iterator implements java.util.Iterator {
        private No atual;
        
        public Iterator() {
            atual = inicio;
        }

        @Override
        public boolean hasNext() {
            return atual != null;
        }

        @Override
        public Object next() {
            String elemento = atual.getElemento();
            atual = atual.getProximo();
            return elemento;
        }
    }

}


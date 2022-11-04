package Questao3;

public class Pilha {
    public static class No{
        String dado;
        No noProx;


        public No() {
            this.dado = null;
            this.noProx = null;
        }
        public No(String dado, No noProx) {
            this.dado = dado;
            this.noProx = noProx;
        }

        
    }

    No topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(String msg){
        if((topo==null)){
            No novo = new No(msg, null);
            topo = novo;
            System.out.println("CONTEUDO ADICIONADO A PILHA!");
        }else{
            No novo = new No(msg, topo);
            topo = novo;
            System.out.println("CONTEUDO ADICIONADO A PILHA!");
        }
    }


    public void pop(){
        if((topo==null)){
            System.out.println("PILHA JÁ ESTÁ VAZIA!");
        }else{
            No aux = new No();
            aux.noProx=topo.noProx;
            topo = topo.noProx;
            aux.noProx=null;
            System.out.println("CONTEUDO RETIRADO DA PILHA!");
        }
    }

    public void printaPilha(){
        while(topo!=null){
            System.out.println(topo.dado);
            topo=topo.noProx;
        }
    }
    
}

package ex_3;

import java.util.ArrayList;

public class pilha {
    private ArrayList<no> varPilha;
    
    
    public pilha() {
        this.varPilha = new ArrayList<>();
    }

    public void push(String no){
        this.varPilha.add(0,new no(no));
    }

    public void pop(){
        this.varPilha.remove(0);
    }

   
    public void show(){
        for (no no : varPilha) {
            System.out.println(no.getString());
        }
    }

    public class no{
        String elemento;

        public no(String elemento) {
            this.elemento = elemento;
        }

        public String getString() {
            return elemento;
        }

    }
}


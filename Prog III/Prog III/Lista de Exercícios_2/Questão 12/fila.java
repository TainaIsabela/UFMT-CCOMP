// 12.Implemente a classe Fila, uma fila ilimitada de strings. Forneça os métodos adicionar(), que adiciona ao fim da fila, ​​e remover(), que remove do início da fila. Armazene os elementos como uma lista encadeada de objetos da classe No. 

import java.util.ArrayList;
public class fila {
    // fila ilimitada de strings
    ArrayList<String> fila = new ArrayList<>();

    // metodo para adicionar elementos na fila
    public void adiciona(String elemento) {
        fila.add(elemento);
    }

    // metodo para remover elementos na fila
    public String remove() {
        return fila.remove(0);
    }

    


    public static void main(String[] args) {
    fila MinhaFila = new fila();

    No no1 = new No("Ane");
    MinhaFila.adiciona(no1.getNome());
    No no2 = new No("Eduardo");
    MinhaFila.adiciona(no2.getNome());
    No no3 = new No("Luis");
    MinhaFila.adiciona(no3.getNome());
    No no4 = new No("Maria");
    MinhaFila.adiciona(no4.getNome());
    No no5 = new No("Coelho");
    MinhaFila.adiciona(no5.getNome());
    No no6 = new No("Yuri");
    MinhaFila.adiciona(no6.getNome());
    No no7 = new No("Taina");
    MinhaFila.adiciona(no7.getNome());

    MinhaFila.remove();
    MinhaFila.remove();
    
    System.out.println(MinhaFila.fila);
    }
}

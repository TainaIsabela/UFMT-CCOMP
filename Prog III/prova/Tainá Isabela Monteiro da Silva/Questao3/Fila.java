package Questao3;

// Implmente a classe Fila, uma Fila de strings. Forneça os métodos adicionar(), que adiciona ao fim da fila, e remover(), que remove do início da fila. Armazene os elementos como
// uma lista encadeada de objetos da classe No, Implementando a classe No como uma classe aninhada. Implemente um iterator, isto é, um objeto que produz referências para os elementos 
// da fila, um de cada vez. Implemente a classe Iterador como uma classe aninhada com métodos next() (retorna uma referência para o próximo No) e hasNext() (retorna true se houver um
// próximo No e false caso contrário). Forneça um método iterador() da classe Fila que gera um objeto Fila.Iterador. 
public class Fila {
    String Lista [];


    public void adicionar (String add) { 
        No n = new No(add);
        
    }
    public void remover (String rem ) {
        
    }


    
    public class Iterador{

        public void next (){}

        public boolean hasNext(){
            return false;
        }
    }
}

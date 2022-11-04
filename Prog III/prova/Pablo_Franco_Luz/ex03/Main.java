/*

3. Implemente a classe Pilha, uma pilha de Strings. Forneça os métodos push(), 
que adiciona uma string à pilha e pop(), que remove uma string da pilha . Armazene
os elementos como uma lista encadeada de objetos da classe No. A classe No deve 
ser aninhada.

*/

public class Main{
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Pilha.No no = pilha.new No();

        no = pilha.push(no, "string_1");
        no = pilha.push(no, "string_2");
        no = pilha.push(no, "string_3");
        no = pilha.push(no, "string_4");
        no = pilha.push(no, "string_5");
        
        while(no.getProx() != null){
            System.out.println(no.getString());

        }
    }
}
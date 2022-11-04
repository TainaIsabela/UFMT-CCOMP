package Ex6.src;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pilha<String> nomes = new Pilha<String>();
        nomes.push("a");
        nomes.push("b");
        nomes.push("c");
        nomes.push("d");
        for (String string : nomes.pilha) {
            System.out.println(string);}}
    public static class Pilha<E> {
        ArrayList<E> pilha = new ArrayList<>();
        public void push(E elemento){
            pilha.add(0, elemento);}
        public void pop() {
            pilha.remove(0);}
        public boolean isVazia(){
            return pilha.isEmpty();
        }}}

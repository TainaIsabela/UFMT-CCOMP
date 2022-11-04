//     2. Implemente uma classe Pair<E> que armazena um par de elementos do tipo E. Forneça Métodos de acesso para obter o primeiro e o segundo elemento. Adicione os métodos max() e min(), para obter o maior e menor dos dois elementos. Para isso, forneça um limitante de tipo apropriado para E.

package Questao2;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<Integer>(1, 2);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
        System.out.println(p.max());
        System.out.println(p.min());
    }
}

public class Pair {
    private Integer first;
    private Integer second;
    
    public Pair(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }
    
    public Integer getFirst() {
        return first;
    }
    
    public Integer getSecond() {
        return second;
    }
    
    public Integer max() {
        return Math.max(first, second);
    }
    
    public Integer min() {
        return Math.min(first, second);
    }
}
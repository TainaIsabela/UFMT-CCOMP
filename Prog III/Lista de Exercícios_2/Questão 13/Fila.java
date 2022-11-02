// 13.Refaça o exercício 12 implementando a classe No como uma classe aninhada. Nesse caso, a classe No deve ser estática ou não? Implemente um iterador, isto é, um objeto que produz referências para os elementos da fila, um de cada vez. Implemente a classe Iterador como uma classe aninhada com métodos next() (retorna uma referência para o próximo No) e hasNext() (retorna true se houver um próximo No e false caso contrário). Forneça um método iterador() da Classe Fila que gera um objeto Fila.Iterador. O Iterator deve ser estático ou não?
import java.util.ArrayList;
public class Fila {
    public static class No {
        // elementos encadeados da lista
        private String nome;

        // construtor
        public No(String nome) {
            this.nome = nome;
        }

        // getters e setters

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        
    }
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

        Fila MinhaFila = new Fila();

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
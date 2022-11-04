// Questão 3 - Implementação de Fila
// Kaio Felipe Nink Cardoso

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar(33);
        fila.adicionar(4);
        fila.imprimir();

        fila.remover();
        fila.imprimir();

        fila.remover();
        fila.imprimir();

        fila.adicionar(49);
        fila.adicionar(81);
        fila.remover();
        fila.adicionar(45);
        fila.adicionar(8);
        fila.imprimir();

    }
}
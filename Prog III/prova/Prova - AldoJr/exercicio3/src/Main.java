
//exercicio 3 - AldoJr;

public class Main {
    public static void main(String[] args) throws Exception {
       Pilha p1 = new Pilha();

       System.out.println("Inserindo na pilha: ");
       p1.push("Aldo");
       p1.push("teixeira");
       p1.push("da");
       p1.push("silva");
       p1.push("junior");



       p1.imprimir();

      
       System.out.println("\nRemovendo da pilha: ");
       p1.pop();
       p1.pop();
       p1.imprimir();



    }
}

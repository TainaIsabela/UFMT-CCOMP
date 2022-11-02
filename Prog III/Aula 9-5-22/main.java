import java.util.Arrays;

public class main {
    
    public static void main(String[] args) {
        X ref1 = new A();
        X ref2 = new B();
        ref1.imprime();
        ref2.imprime();


        if(ref1 instanceof A) {
            System.out.println("ref1 esta apontando para um objeto da classe A");
        }

        if(ref2 instanceof A) {
            System.out.println("ref1 esta apontando para um objeto da classe A");
        } else  {
            System.out.println("ref1 não esta apontando para um objeto da classe A");
        }

        // Casting
        A refa = (A) ref1;
        B refb = (B) ref2;
        
        refa.f1();
        refb.f2();



        String[] array1 = {"Tainá", "Isabela", "Monteiro", "Da", "Silva"};
        pessoa[] pessoas = new pessoa[5];
        
        pessoas[0] = new pessoa("Tainá", 3);
        pessoas[1] = new pessoa("Isabela", 1);
        pessoas[2] = new pessoa("Monteiro", 4);
        pessoas[3] = new pessoa("Da", 5);
        pessoas[4] = new pessoa("Silva", 2);
        // a classe String implementa a interfaxe Comparable<T>

        Arrays.sort(pessoas);

        for(pessoa p : pessoas) {
            System.out.println(p.getNome() + " " + p.getId());
        }

        // Ordenação de strings
        // Arrays.sort(array1);
        // for(String s : array1) {
        //     System.out.println(s);
        // }
            
        Arrays.sort(array1, new CompString());
    }
}
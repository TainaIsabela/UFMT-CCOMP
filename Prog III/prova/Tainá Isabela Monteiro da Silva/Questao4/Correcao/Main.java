
public class Main {
    public static void main(String[] args) {
       Runnable[] lista = new Runnable[5];
         lista[0] = () -> {
            System.out.println("Executando o primeiro");
            };
            lista[1] = () -> {
                System.out.println("Executando o segundo");
            };
            lista[2] = () -> {
                System.out.println("Executando o terceiro");
            };
            lista[3] = () -> {
                System.out.println("Executando o quarto");
            };
            lista[4] = () -> {
                System.out.println("Executando o quinto");
            };

        Runnable meuObjeto = executa(lista);
        meuObjeto.run();
        }

    public static Runnable executa(Runnable[] lista) {
        return () -> {
            for (Runnable r : lista) {
                r.run();
            }
        };
    }

}
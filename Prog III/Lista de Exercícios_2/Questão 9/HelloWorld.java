// 9.Faça um programa para imprimir “hello world!” no arquivo HelloWorld.java. Declare a classe HelloWorld como sendo do pacote cap01.sec01. Coloque o arquivo em algum diretório, mas não em cap01/sec01. A partir desse diretório, execute javac HelloWorld.java. Verifique se um arquivo .class foi obtido e, em caso positivo, onde? Em seguida, execute o programa com o comando java HelloWorld. O que acontece? Por quê? (Dica: execute javap HelloWorld e estude a mensagem de warning). Finalmente, tente javac -d . HelloWorld.java. O que acontece? Explique.
import cap01.sec01.HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

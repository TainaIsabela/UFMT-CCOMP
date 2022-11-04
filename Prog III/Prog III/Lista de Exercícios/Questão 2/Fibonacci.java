import java.util.Scanner;

public class Fibonacci {
    // 2.A série de Fibonacci é dada por 1, 1, 2, 3, 5, 8, 13, 21...Faça um programa que calcule todos os números da série de Fibonacci menores ou iguais a n, onde n é um número inteiro maior que 1, fornecido pelo usuário.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if (n > 1) {
            System.out.print(a + " " + b + " ");
            while (c <= n) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}

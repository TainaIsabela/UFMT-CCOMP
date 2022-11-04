import java.util.Scanner;

public class Matriz {
    // 9.Escreva um programa que leia uma matriz bidimensional de inteiros e
    // determina se é um quadrado mágico. Aceite uma linha de entrada por vez com os valores separados em inteiros individuais. Um quadrado mágico é uma matriz onde a soma de todas as linhas, todas as colunas, e todas as diagonais tem os mesmo valor.
    public static void main(String[] args) {
        // ler quantas colunas e linhas a matriz terá
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz: ");
        int colunas = sc.nextInt();
        // criar matriz
        int[][] matriz = new int[linhas][colunas];
        // inserir os valores na matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        // verificar se é um quadrado mágico
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }
        int soma2 = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma2 += matriz[j][i];
            }
        }
        int soma3 = 0;
        for (int i = 0; i < linhas; i++) {
            soma3 += matriz[i][i];
        }
        int soma4 = 0;
        for (int i = 0; i < linhas; i++) {
            soma4 += matriz[i][colunas - 1 - i];
        }
        if (soma == soma2 && soma == soma3 && soma == soma4) {
            System.out.println("É um quadrado mágico!");
        } else {
            System.out.println("Não é um quadrado mágico!");
        }
    }
}

public class empresa {
    //4.Numa empresa existe uma tabela que armazena quanto foi gasto em cada mês. Para fechar o balanço de cada trimestre, precisamos somar o gasto total. Sabendo que em Janeiro foram gastos 15000 reais, em Fevereiro 23000 reais, em Março 17000 reais, em Abril 17000 reais, em Maio 27000 reais, em Junho 17500 reais, em Julho 19000, em Agosto 21000 reais, em Setembro 15000 reais, em Outubro 21000, em Novembro 19000 reais e em Dezembro 20500 reais, faça um programa que calcule e imprima o gasto total e o gasto médio durante cada trimestre. Use um array para armazenar os valores da tabela..
    public static void main(String[] args) {
        int[] gasto = {15000, 23000, 17000, 17000, 27000, 17500, 19000, 21000, 15000, 21000, 19000, 20500};
        int total = 0;
        int media = 0;
        for (int i = 0; i < gasto.length; i++) {
            total += gasto[i];
        }
        media = total / gasto.length;
        System.out.println("O gasto total é: " + total);
        System.out.println("A média é: " + media);
}
}

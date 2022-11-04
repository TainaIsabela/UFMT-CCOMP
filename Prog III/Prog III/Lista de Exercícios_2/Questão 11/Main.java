// 11.Faça a implementação completa da classe Fatura vista em sala (uma classe aninhada Estática). Forneça um método que imprima a fatura e um programa de demonstração que constrói e imprime uma fatura de amostra. 

public class Main {
    public static void main(String[] args) {
            fatura minhaFatura = new fatura();
            minhaFatura.adicionaItem(new fatura.Item("Celular", 2, 1500));
            minhaFatura.adicionaItem(new fatura.Item("Notebook", 1, 2000));
            minhaFatura.adicionaItem(new fatura.Item("Mouse", 1, 50));
            minhaFatura.adicionaItem(new fatura.Item("Teclado", 1, 100));
            minhaFatura.imprime();
    }    

}

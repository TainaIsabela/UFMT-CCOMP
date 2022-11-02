public class Main {
    public static void main(String[] args) {
            fatura minhaFatura = new fatura();
            minhaFatura.adicionaItem(new fatura.Item("Celular", 2, 1500));
            minhaFatura.adicionaItem(new fatura.Item("Notebook", 1, 2000));
            minhaFatura.adicionaItem(new fatura.Item("Mouse", 1, 50));
            minhaFatura.adicionaItem(new fatura.Item("Teclado", 1, 100));
            minhaFatura.show();
    }    

}

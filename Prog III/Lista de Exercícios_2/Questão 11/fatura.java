import java.util.ArrayList;
public class fatura {
    // classe aninhada estatica
    public static class Item {
        private String descricao;
        private int quantidade;
        private float precoUnitario;
        
        public Item (String descricao, int quantidade, float precoUnitario) {
            this.descricao = descricao;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }
        
        float precoTotal() {
           return this.quantidade * this.precoUnitario;
        }

        public String getDescricao() {
            return descricao;
        }
        
        public int getQuantidade() {
            return quantidade;
        }

        public float getPrecoUnitario() {
            return precoUnitario;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public void setPrecoUnitario(float precoUnitario) {
            this.precoUnitario = precoUnitario;
        }


    }
        ArrayList<Item> itens = new ArrayList<>();

    public void adicionaItem(Item novo) {
        this.itens.add(novo);
    }

    public void imprime() {
        System.out.println("\nFatura\n");
        for (Item item : this.itens) {
            System.out.println("Descricao: " + item.getDescricao() + "\nQuantidade: " + item.getQuantidade() + "\nPreco Unitario: " + item.getPrecoUnitario() + "\nPreco Total: " + item.precoTotal() + '\n');
        }

    }

            
}

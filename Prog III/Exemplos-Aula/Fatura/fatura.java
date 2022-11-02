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
        
        //metodos
        float precoTotal() {
           return this.quantidade * this.precoUnitario;
        }// fim class item

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
    //metodos
    public void adicionaItem(Item novo) {
        this.itens.add(novo);
    }
    public void show() {
        for (Item item : this.itens) {
            System.out.println("Descricao: " + item.getDescricao() + " Quantidade: " + item.getQuantidade() + " Preco Unitario: " + item.getPrecoUnitario() + " Preco Total: " + item.precoTotal());
        }
    }


            
}

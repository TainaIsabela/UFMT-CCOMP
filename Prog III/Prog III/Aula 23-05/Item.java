public class Item{
    private float preco;
    private String descricao;

    public Item(float preco, String desc){
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.getClass() + "[Descrição: " + this.descricao + "preço: " + this.preco + "]"; 
    }
}

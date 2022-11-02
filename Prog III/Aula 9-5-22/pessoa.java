public class pessoa implements Comparable<pessoa> {
    private String nome;
    private int id;
    
    public pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    // Com Id
    // @Override
    // public int compareTo(pessoa o) {
    //     int dif = this.id - o.id;
    //     return dif;
    // }

    // Com Nome
    // @Override
    // public int compareTo(pessoa o) {
    //     int dif = this.nome.compareTo(o.nome);
    //     return dif;
    // }

    // Tamanaho de nome
    @Override
    public int compareTo(pessoa o) {
        int dif = this.nome.length() - o.nome.length();
        return dif;
    }
}

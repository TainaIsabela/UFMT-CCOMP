public class Funcionario {
    private String nome;
    private float Salario;
    //construtores 
    public Funcionario(){ // default
        this.Salario = 5000.0f;
        this.nome = "";
    }

    public Funcionario(String nome, float salario){
        this.Salario = salario;
        this.nome = nome;
    }



    //getters and setters (métodos de instância)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        this.Salario = salario;
    }
    
    public void aumentaSalario(float percentual){
        float aumento = this.Salario * (percentual/100);
        this.Salario += aumento;
    }
}

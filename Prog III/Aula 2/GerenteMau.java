public class GerenteMau {
    public void diminueSalario(Funcionario func, float percentual){
        func.aumentaSalario(-percentual);
    }    

    public void mudaFuncionario(Funcionario func){
        Funcionario novo = new Funcionario();
        novo.setNome("Lilian");
        novo.setSalario(30000.0f);
        func=novo;
    }
}

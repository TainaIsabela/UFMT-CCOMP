
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        // Métodos de instâncias - Getters and Setters
        funcionario.setNome("João");
        funcionario.setSalario(10000.0f);
        funcionario.aumentaSalario(12);
        GerenteMau gerente = new GerenteMau();
        gerente.diminueSalario(funcionario, 11);
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Salario: "+ funcionario.getSalario());

        Funcionario f2 = new Funcionario("Mariana", 8000.0f);
        System.out.println("nome: "+ f2.getNome());
        System.out.println("salario: "+ f2.getSalario());
    
    }
}

package Questao1;
public class funcionario implements Mensuravel {
    double salario;
    String nome;


    funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    @Override
    public double getMedidas() {
        return this.salario;
    }

    public static double media (Mensuravel[] obj) {
        double d = 0;
        int i;
        for ( i = 0; i < 4; i++) {
            d += obj[i].getMedidas();
        }
        return d/i;
    }
    
    public static void main(String[] args){
        Mensuravel[] list = new funcionario[4];        
        list[0] = new funcionario("Lila",5000.0);
        list[1] = new funcionario("Marcos",5500.0);
        list[2]= new funcionario("Dimitri",6000.0);
        list[3] = new funcionario("Diego",4000.0);
        double result = media(list);
        System.out.println("Média: " + result);        

    }

}
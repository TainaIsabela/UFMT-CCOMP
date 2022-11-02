package Questao2;

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

    public String getNome() {
        return this.nome;
    }
    @Override
    public double media(Mensuravel[] obj) {
        double d = 0;
        int i;
        for ( i = 0; i < 4; i++) {
            d += obj[i].getMedidas();
        }
        return d/i;
    }

    @Override
    public Mensuravel maior(Mensuravel[] obj) {
        int f=0;
         
        for (int i = 0; i < 3; i++) {
            
            if(obj[i].getMedidas()<obj[i+1].getMedidas()){
                f=i+1;
            }else{
                f=i;
            }
        }
        return obj[f];
    }
    

    public static void main(String[] args){
        Mensuravel[] list = new funcionario[4];        
        list[0] = new funcionario("Lila",5000.0);
        list[1] = new funcionario("Marcos",5500.0);
        list[2]= new funcionario("Dimitri",6000.0);
        list[3] = new funcionario("Diego",4000.0);
        funcionario d = (funcionario) list[0].maior(list);
        System.out.println("Média: "+ list[0].media(list));        
        System.out.println("Maior Salário: "+ d.getNome());        

    }

}
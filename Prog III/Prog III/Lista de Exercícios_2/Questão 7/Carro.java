// 7.Implemente a classe Carro que modela um carro viajando em linha reta, consumindo gasolina à medida que se move. Forneça um método que modele a movimentação do carro por um determinado número de quilómetros, um método para adicionar um determinado número de litros ao tanque de gasolina, um método para obter a distância corrente da origem e um método para obter o nível de combustível. Especifique a eficiência de combustível (em quilómetros/litro) no construtor. A classe Carro deve ser uma classe imutável? Por que ou Por que não? No programa principal, crie um carro, abasteça, e o faça andar por 50 km. Imprima as informações relacionadas ao combustível a cada 10 km.
public class Carro {
    private double distancia;
    private double combustivel;
    private double eficiencia;

    public Carro(double eficiencia) {
        this.distancia = 0;
        this.combustivel = 0;
        this.eficiencia = eficiencia;
    }

    public void andar(double distancia) {
        this.distancia += distancia;
        this.combustivel -= distancia / this.eficiencia;
    }

    public void adicionarCombustivel(double combustivel) {
        this.combustivel += combustivel;
    }

    public double getDistancia() {
        return this.distancia;
    }
    
    public double getCombustivel() {
        return this.combustivel;
    }

    public double getEficiencia() {
        return this.eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public String toString() {
        return "Distância: " + this.distancia + " km\n" 
            + "Combustível: " + this.combustivel + " litros\n"
            + "Eficiência: " + this.eficiencia + " km/litro";
    }

    public static void main(String[] args) {
        Carro carro = new Carro(10);
        carro.adicionarCombustivel(12);
        carro.andar(50);
        System.out.println(carro.toString());
    }
}
// Escreva o método public double sumOfValues(String filename) throws... que chama o método do exercício 1 e retorna a soma dos valores no arquivo. Propague quaisquer exceções para o chamador.

package Questao2;

public class main {
    public double sumOfValues(String filename) throws IOException, NumberFormatException {
        double sum = 0;
        ArrayList<Double> values = new main().readValues(filename);
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        try {
            double sum = new main().sumOfValues("values.txt");
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        } catch (NumberFormatException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
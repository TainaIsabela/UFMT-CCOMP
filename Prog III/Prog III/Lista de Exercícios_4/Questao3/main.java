// Escreva um programa que chame o método anterior e imprima o resultado. Capture as exceções e forneça feedback ao usuário sobre quaisquer condições de erro.

package Questao3;

public class main {
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
    
    public double sumOfValues(String filename) throws IOException, NumberFormatException {
        double sum = 0;
        ArrayList<Double> values = new main().readValues(filename);
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }
    
    public ArrayList<Double> readValues(String filename) throws IOException, NumberFormatException {
        ArrayList<Double> values = new ArrayList<Double>();
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            try {
                values.add(Double.parseDouble(line));
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Erro ao ler o arquivo");
            }
            line = br.readLine();
        }
        br.close();
        fr.close();
        return values;
    }
}
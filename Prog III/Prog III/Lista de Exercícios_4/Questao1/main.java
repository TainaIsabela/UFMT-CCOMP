// Escreva o método public ArrayList<Double> readValues(String filename) throws... que lê um arquivo contendo números em ponto flutuante. Lance exceções apropriadas se o arquivo não poder ser aberto ou se alguma das entradas não forem números em ponto flutuante. Para ler o arquivo use as classes FileReader e BufferedReader.
package Questao1;

public class main {
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

    public static void main(String[] args) {
        try {
            ArrayList<Double> values = new main().readValues("values.txt");
            for (Double value : values) {
                System.out.println(value);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        } catch (NumberFormatException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    } catch (IOException e) {
        System.out.println("Erro ao ler o arquivo");
    } catch (NumberFormatException e) {
        System.out.println("Erro ao ler o arquivo");
    } catch (Exception e) {
        System.out.println("Erro ao ler o arquivo");
    } catch (Throwable e) {
        System.out.println("Erro ao ler o arquivo");
    }
}
//     4. Implemente um método que contenha o código a seguir, porém sem usar try-with-resource:   
// try (Scanner in = new Scanner(Paths.get("words.txt"));
// PrintWriter out = new PrintWriter("output.txt")) 
// {
//   while (in.hasNext())
//     out.println(in.next().toLowerCase())
// }

package Questao4;

public class main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(Paths.get("words.txt"));
             PrintWriter out = new PrintWriter("output.txt")) 
        {
            while (in.hasNext())
                out.println(in.next().toLowerCase())
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }
} 

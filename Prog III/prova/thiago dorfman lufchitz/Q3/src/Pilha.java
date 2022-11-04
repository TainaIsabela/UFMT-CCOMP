/* Implemente a Classe Pilha, uma pilha de strings.Forneça os metodos push(),
que adiciona uma string a pilh, e pop(), que removoe uma string da pilha. Armazene os elementos cada uma lista encadeada de objetos da Classe No.
A classe No deve ser aninhada. 
*/
public class Pilha {
    private String P[];

    public Pilha(String[] p) {
        P = p;
    }
    
    public String[] getP() {
        return P;
    }

    public void setP(String[] p) {
        P = p;
    }

    public void pop(String n){
        String N[];
        N[] = getP().add(n);
        getP().clone(N[]);
    }
    public void push(String n){
        setP() = getP().remove(n);
    }
}

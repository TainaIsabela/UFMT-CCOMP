package Ex2.src;
public class Pair<E extends Comparable<E>>{
    private E primeiro, segundo;
    public Pair(E primeiro, E segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;}
    public E getPrimeiro() {
        return primeiro;}
    public E getSegundo() {
        return segundo;}
    public E getMax() {
        return primeiro.compareTo(segundo) > 0 ? primeiro : segundo;}
    public E getMin() {
        return primeiro.compareTo(segundo) > 0 ? segundo : primeiro;}}

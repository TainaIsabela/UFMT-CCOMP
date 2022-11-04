package Ex10.src;
import java.util.ArrayList;
public class Table<K, V> { 
    private static class Entry<K, V> {
        K key; 
        V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;}
        public K getKey() {
            return key;}
        public void setKey(K key) {
            this.key = key;}
        public V getValue() {
            return value;}
        public void setValue(V value) {
            this.value = value;}
        @Override
        public String toString() {
            return "Entry [key=" + key + ", value=" + value + "]";
        }}
    private ArrayList<Entry<K, V>> entrada = new ArrayList<>();
    public void add(K key, V value) {
        for (Entry<K, V> entry : entrada) {
            if (entry.getKey() == key) {
                entry.setKey(key);
                entry.setValue(value);
                return;}}
        entrada.add(new Entry<K, V>(key, value));}
    public void remove(K key) {
        for (int i = 0; i < entrada.size(); i++) {
            if (entrada.get(i).getKey() == key) {
                entrada.remove(i);}}}
    public V get(K key) { 
        for (Entry<K, V> entry : entrada) {
            if (entry.getKey() == key) {
                return entry.getValue();}}
        return null;}}

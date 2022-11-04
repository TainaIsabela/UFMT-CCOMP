//Implemente uma classe Table<K, V> que gerencia uma ArrayList de objetos Entry<K,V>. Forneça métodos para obter o valor V associado a uma chave K, para armazenar um valor V para uma chave K e para remover uma chave.

package Questao8;

public class main {
    public static void main(String[] args) {
        Table<String, Integer> table = new Table<String, Integer>();
        table.put("A", 1);
        table.put("B", 2);
        table.put("C", 3);
        table.put("D", 4);
        table.put("E", 5);
        table.put("F", 6);
        table.put("G", 7);
        table.put("H", 8);
        table.put("I", 9);
        table.put("J", 10);
        
        System.out.println(table.get("A"));
        System.out.println(table.get("B"));
        
        table.remove("A");
        
    }
    
    public class Table<K, V> {
        private ArrayList<Entry<K, V>> table = new ArrayList<Entry<K, V>>();
        public V get(K key) {
            for (Entry<K, V> entry : table) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
            return null;
        }
        public void put(K key, V value) {
            table.add(new Entry<K, V>(key, value));
        }
        public void remove(K key) {
            for (Entry<K, V> entry : table) {
                if (entry.getKey().equals(key)) {
                    table.remove(entry);
                    return;
                }
            }
        }
    }
    
    public class Entry<K, V> {
        private K key;
        private V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
    }
}
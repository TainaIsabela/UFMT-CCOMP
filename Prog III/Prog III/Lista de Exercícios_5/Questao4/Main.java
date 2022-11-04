// Converta todas as strings de  um ArrayList<String> para letras maiúscula. Faça isso com (a) um iterador, (b) um loop sobre os valores de índice e (c) o método replaceAll.

package Questao4;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        
        Iterator<String> it = list.iterator();
        
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s.toUpperCase());
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s.toUpperCase());
        }

        list.replaceAll(String::toUpperCase);
        for (String s : list) {
            System.out.println(s);
        }

}
// implemente um método genérico que apenda todos os elementos de um ArrayList em outro ArrayList. Use um curinga para um dos argumentos de tipo. Forneça duas soluções equivalentes, uma com um ? extends E e uma com ? super E.

package Questao1;

public class Main {
    
        public static void main(String[] args) {
            ArrayList<Integer> lista1 = new ArrayList<Integer>();
            ArrayList<Integer> lista2 = new ArrayList<Integer>();
            ArrayList<Integer> lista3 = new ArrayList<Integer>();
            
            lista1.add(1);
            lista1.add(2);
            lista1.add(3);
            lista1.add(4);
            lista1.add(5);
            
            lista2.add(6);
            lista2.add(7);
            lista2.add(8);
            lista2.add(9);
            lista2.add(10);
            
            lista3 = append(lista1, lista2);
            
            System.out.println(lista3);
        }
        
        public static <E> ArrayList<E> append(ArrayList<E> lista1, ArrayList<E> lista2) {
            ArrayList<E> lista3 = new ArrayList<E>();
            
            for (E e : lista1) {
                lista3.add(e);
            }
            
            for (E e : lista2) {
                lista3.add(e);
            }
            
            return lista3;
        }
    
}
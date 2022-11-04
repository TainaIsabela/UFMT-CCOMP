package Questao8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenaNaSorte {

	public static void OrdenaNaSorte(ArrayList<String> strings, Comparator<String> comp) {

		int counter = 0;

		while(!ordena(strings, comp))
		{
			counter++;
			Collections.shuffle(strings);
		}
		
		System.out.printf("Sortead0 %d vezes!", counter);
	}
	
	private static boolean ordena(ArrayList<String> strings, Comparator<String> comp) {

		for (int i = 0; i < strings.size()-1; i++) {

			if(	comp.compare(strings.get(i), strings.get(i+1)) < 0)
				return false;
		}
		return true;
	}

	public static void main(String atgs[]) {
		
		Comparator<String> comp = (str1, str2) -> {
			
			return str1.compareTo(str2);
			
		};

		var myList = new ArrayList<String>();
		myList.add("c");
		myList.add("b");
		myList.add("a");
		myList.add("d");
		myList.add("e");
		myList.add("h");

		OrdenaNaSorte(myList, comp);


	}


}


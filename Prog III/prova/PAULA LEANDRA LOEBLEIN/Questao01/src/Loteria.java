import java.util.ArrayList;
import java.util.Random;


public class Loteria {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		
		//adiciona os valores de 1 a 60 no array
		for(int i=1; i<61; i++) {
			nums.add(i);
		}
		
		int index = 0;
		
		
		for(int k = 1; k<=6; k++) { 
			for(int j=1; j<=nums.size(); j++) {
				index = r.nextInt(nums.size());
			}
			
			ArrayList<Integer> novo = new ArrayList<>();
			novo.add(index);
			
			
			nums.remove(nums.get(index));
			System.out.println(novo);
			
		}
		System.out.println(nums);
	}
	
}

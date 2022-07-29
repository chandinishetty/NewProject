package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		ar.add("tom");
		ar.add("hello");
		ar.add(12.33);
		ar.add('m');
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		ar.remove(9);//removing one index.
		
		System.out.println(ar.size());
		
		//to print all the values of arraylist
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
			
		}
		
		//restricting an arraylist to take only integer values
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//restricting an arraylist to take only String values
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		

	}

}
//Dynamic Array
//size in arraylist keeps on changes when you add values.
//no need to define the size first like you do in arrays(static)

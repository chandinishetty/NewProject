package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "hello");
		h.put("C","world");
		
		System.out.println(h.size());

		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		System.out.println(h.get("B"));
		System.out.println(h.get(2));
		
		h.put(3, "Tom");
		System.out.println(h.size());
		
		
		//Restricting to accept onlt ineteger key and values
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		
		Hashtable<String,String> h2 = new Hashtable<String,String>();
		h2.put("D", "Hi");
  
	}
   
  

}

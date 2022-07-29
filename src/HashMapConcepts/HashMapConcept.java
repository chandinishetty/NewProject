package HashMapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		Map<String, Integer> marks=new HashMap<String,Integer>();
		marks.put("nav",100);
		marks.put("Tom",300);
		marks.put("peter",400);
		marks.put("lisa",500);
		marks.put("john",600);
		marks.put(null,700);
		marks.put(null,800);
		marks.put("nav",900);
		
		//hashing : hashCode() ---> hasing
		
		System.out.println(marks.get("lisa"));
		//hashcode of lisa --210678
		//index = 15
		//.equals to check the key name
		//Lisa
		//return value

	}

}

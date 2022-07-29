package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class HashMapToArrayList {

	public static void main(String[] args) {


		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println("comp map size:" +compMap.size());
		Iterator it= compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey()+ " = " +pairs.getValue() );
		}
		
		//convert hashmap keys into ArrayList:
		List<String> compNamelist = new ArrayList<String>(compMap.keySet());
		System.out.println(compNamelist);
		System.out.println("total keys:"+compNamelist.size());
		for(String t:compNamelist) {
			System.out.println(t);}
		
		List<Integer> compValuelist = new ArrayList<Integer>(compMap.values());
		System.out.println("total keys:"+compValuelist.size());
		System.out.println(compValuelist);
		for(Integer v:compValuelist) {
			System.out.println(v);}
		
		//other method
		
		compMap.forEach((k,v)->System.out.println("key = " + k + " value= " +v));

		
		
	}

}

package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;
	static {
		marksMap = new HashMap<>();
		marksMap.put("A",100);
		marksMap.put("B",200);
	}
	public static void main(String[] args) {


		//1. using HashMap class
		
		HashMap<String, String> map1 = new HashMap<>();
		Map<String , String> map2 = new HashMap<>();
		
		//2. static way :static hashmap:
		System.out.println(HashMapInitialization.marksMap.get("A"));

		
		//3.immutableMap with only one single entry:
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
	System.out.println(map3.get("test"));
	//map3.put("abc", 200);//UnsupportedOpertionException
	
	//4. JDK 8:
	//creating 2D array of strings using Stream and collecting in the form Map.
	Map<String,  String> map4 = Stream.of(new String [][]{
		{"Tom", "A Grade"},
		{"Naeen","A+ Grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("lisa", "A+ Grade");
		System.out.println(map4.get("lisa"));
		
		//using SimpleEntry
		Map<String,String> map5=Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen", "Java"),
				new AbstractMap.SimpleEntry<>("Tom", "Pyton")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
				System.out.println(map5.get("Tom"));
				map5.put("lisa", "C#");
				System.out.println(map4.get("lisa"));
				
				//JDK 1.9
				Map<String,String> emptyMap =	Map.of();
				//emptyMap.put("lisa", "C#");
				//System.out.println(emptyMap.get("lisa"));//UnsupportedOpertionException
	
	             //singleton map:
				Map<String,String> singletonMap =	Map.of("k1","v1");
				System.out.println(singletonMap.get("k1"));
				//singletonMap.put("k2","v2");
				
				//multi values Map:Max 10 pairs can be stored:
				Map<String,String> multiMap = Map.of("k1","v1","k2","v2","k3","v3");
				System.out.println(multiMap.get("k3"));
				
				
				//ofEntries method: no limitations on pairs(Key-Value)
				//Immutable Maps:
				Map<String,Integer> multiMap1 = Map.ofEntries(
						new AbstractMap.SimpleEntry<>("A", 100),
						new AbstractMap.SimpleEntry<>("B", 200)
						);
				
				System.out.println(multiMap1.get("B"));
				//multiMap1.put("D",400);///UnsupportedOpertionException
				
				//maps using Guava:
				Map<String,String> titleMaps = 	ImmutableMap.of("Google","Google India","Amazon","Amazon Shopping");
				System.out.println(titleMaps.get("Amazon"));
			//	titleMaps.put("Rediff", "Rediff India");//UnsupportedOpertionException
	}
		
	}



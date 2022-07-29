package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class HashMapSync {

	public static void main(String[] args) {
		
		//synchronizedMap method in collection class:
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("1","Naveen");
		map1.put("2","Tom");
		map1.put("3","lisa");
		
		//create synchronizedMap:
		
		Map<String,String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		//concurrenthashMap: it does not throw any ConcurrentmodificationException
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		
		concurrentMap.put("A","Java");
		concurrentMap.put("B","Python");
		concurrentMap.put("C","Ruby");
		System.out.println(concurrentMap.get("A"));
    
	}

}
//can multiple thread write in the segment?
//no.thread acquires a lock on segment in put() operation and at a time only one thread can write in that segment
//can two threads write in different segment? yessssssssssss
//can multiple threads read from same segment?/////yes..........
//thread does not acquire a lock on segment in get() operations.
//if one thread is writing in a segment,can another thread read from that segment?
//yes,but in this case last updated value will be seen by the reading thread.


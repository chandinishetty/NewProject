package JavaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkdListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
        
		//add
		l1.add("test");
		l1.add("selenium");
		l1.add("qtp");
		l1.add("test");
		l1.add("Qa");
		
		System.out.println("Contents of Linkedlist"+l1);
		
		//addfirst and addlast
		l1.addFirst("Naveen");
		l1.addLast("Tom");
		System.out.println("Contents of Linkedlist"+l1);
		
		//get and set
	
		System.out.println(l1.get(0));
		l1.set(6, "peter");
		System.out.println("Contents of Linkedlist"+l1);
		
		//remove
		l1.remove(6);
		System.out.println("Contents of Linkedlist"+l1);
		
		l1.remove("test");
		System.out.println("Contents of Linkedlist"+l1);
		
		//print all values:Iterator,advanced for loop,while loop
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		for(String str:l1 ) {
			System.out.println(str);
		}
		//Iterator
		
		Iterator<String> it= l1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//while loop
		int num=0;
		while(l1.size()>num) {
			System.out.println(l1.get(num));
			num++;
		}
		
		
	}

}

package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		//Dynamic Array --- Arraylist
		//can contain duplicate values/elements
		//maintains insertion order
		//Synchronized
		//allows random access to fetch any element, because it stores values in the bases of indexes.
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		System.out.println(ar.size());
		
		ar.add("tom");
		ar.add("hello");
		ar.add(12.33);
		ar.add('m');
		System.out.println(ar.size());//size of array 
		
		System.out.println(ar.get(4));
		
		ar.remove(9);//removing one index.
		
		System.out.println(ar.size());
		
		//to print all the values of arraylist
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
			
		}
		
		//non generic vs generics(Types of data) that we store
		//<Integer>--generics
		//restricting an arraylist to take only integer values
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//restricting an arraylist to take only String values
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		
       //when you do not know the data type
		//we generally will not use this
		//ArrayList<e> ar3 = new ArrayList<e>();
		
		//Employee class objects
		Employee e1 = new Employee("naveen",27,"QA");
		Employee e2 = new Employee("peter",28,"dev");
		Employee e3 = new Employee("Tom",27,"admin");
		
		//create arraylist
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e1);
		
		//Iterator to traverse the values
		
		Iterator<Employee> it =ar4.iterator();
		while(it.hasNext()) {
			Employee enp = it.next();
			System.out.println(enp.name);
			System.out.println(enp.age);
			System.out.println(enp.dept);
			
		}
		
		//************************
		
		//addall/removeall---merging/removing two arrays
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("qtp");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");
		
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		//Retain All--same value in both the arrays,
		ar5.retainAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
	}
	
	

}
//Dynamic Array
//size in arraylist keeps on changes when you add values.
//no need to define the size first like you do in arrays(static)
//always use for loop to retrieve all values for any collection in java.
//you can use for loop and iterator also.


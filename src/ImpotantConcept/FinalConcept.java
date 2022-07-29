package ImpotantConcept;

public class FinalConcept {

	public static void main(String[] args) {
		
		int i=10; //value of i can be modified.
		i=20;
		i=30;
		System.out.println(i);

	final int j=10; //constant values cannot change value of j
		
	}

}
//final is a keyword
//to prevent inheritance you can add final keyword to class declaration
//to prevent method overriding you can add final key word to methods
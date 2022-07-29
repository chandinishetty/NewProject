package AbstractionConcept;

public abstract class Bank {

	
	int amt = 100;
	final int rate =10;
	static int loanrate = 10;
	//partial abstraction
	//hiding the implementation logic -- is called abstraction
	public abstract void loan();//abstract method: no method body
	
	
	//non-abstract methods
	public void credit() {
		System.out.println("bank...Credit");
	}
	public void debit() {
		System.out.println("bank...debit");
	}
}
//Abstract class : hides the implementation logic and child class can write its own logic as it requires.
//abstract class can have abstract and non-abstract methods
//cannot create the object of abstract class.
//When ever we want to use some logic as it is we can use abstraction.
//like taking some methods as it is from abstract class.
//abstract class are faster than interface.
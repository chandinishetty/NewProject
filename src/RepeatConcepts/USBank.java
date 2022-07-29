package RepeatConcepts;

//one interface can inherit another interface by extends keyword
public interface USBank extends WorldBank{

	int mim_bal = 100;
	
	public void debit();
	public void credit();
	public void transferMoney();
	
	//if any method gets added to interface then class should override it.
	public void newMethodAddded();
	
	
	//From JDK1.8, you can have static methods in interface but with method body
	//static method with method body;
	public static void balance() {
		//this is introduced because 
		//according to business perspective, so rules as to be introduced
		//as it is and not allowed to override it.
		//call it class by using interface name
		//interfacename.static method
	}
	
	default void currencyexchange() {
		//default cannot be static
		//default cannot be overriden
		//
	}
	
	//no method body,only method declaration.-- abstract methods(can not have static keyword)
	//method prototype;
	//can not create the object of interface
	//no static method
	//variables are static in nature by default
	//abstraction --- 100%
	//variables can not be overriden
}

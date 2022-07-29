package OOPConceptPart2;

public interface USBank {

	int min_bal= 100;
	 public void credit();
	 public void debit();
	 public void transfermoney();
}
//only method declaration
//no method body---only method prototype
//in interface we can declare the variables---
//variables are by default static in nature
//values of variables will not be changed
//no static method in interface
//no main method
//we cannot create the objects of interface
//Interface is abstract in nature
//can access the variable only by using interface name
package AbstractionConcept;

public interface Car {
	
	//only final and static variables
	int wheels = 4; //it is by default treated as final and static
	

	//always define only abstract methods---
	//no method body
	//only method declaration
	//we achieve 100% abstraction
	//can not create the object of interface.

	
	public void start();
	public void stop();
	public void refuel();
	
}
//whenever we want to hide 100% business logic we have to use interfaces.

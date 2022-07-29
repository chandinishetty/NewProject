package RepeatConcepts;

public abstract class AbstractAnimal {

	public void eat() {
		System.out.println("animal eat");
	}
	
	public final void hunt() {
		System.out.println("animal hunt");
	}
}
//in java you can have an abstract class with no abstract methods.
//it allows to create class that cannot be instanizated but can be be inherited
//0% abstraction
//can have final methods in abstract class --- those can not be overriden
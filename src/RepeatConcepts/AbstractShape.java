package RepeatConcepts;

public abstract class AbstractShape {

	int color;
	AbstractShape(){
		System.out.println("abstract constructor");
	}
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("shape fill");
	}
	//can not create object of abstract class
	//can have abstract and non-abstract methods.
	//abstract method with abstract keyword and no function body.
	//use extend keyword for abstraction in child class
   // partial abstraction
	//constructor can be created in abstract class but 
	//can not create constructors in interface

}


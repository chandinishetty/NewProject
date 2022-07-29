package OOPConceptPart3;

public class ConstructorConcept {

	//Constructor : It's a class entity to define the class feature while creating an object.
	//name should be similar to class name
	//does not return any value--no return type
	//Non-static 
	//its not function but its looks like a function
	//Constructor Overloading : we can overload the constructor
	public ConstructorConcept() { //Default constructor with no parameters
		System.out.println("Default Constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("single param Constructor");
	    System.out.println("the value of i:" +i);
	}
	public ConstructorConcept(int i,int j) {
		System.out.println("two param Constructor");
	    System.out.println("the value of i:" +i);
	    System.out.println("the value of i:" +j);
	}
	
	public static void main(String[] args) {
		
		//as soon as you create an object the default constructor is called.
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
	}

}
//Even though you do not write a default constructor-- a default constructor will be there.
//default constructor -- hidden constructor will be present when you create a class.
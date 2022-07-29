package RepeatConcepts;

public class ConstructorConcept {
	
	String name;
	int age;
	
	public ConstructorConcept() {
		System.out.println("default constructor");
	}

	public ConstructorConcept(int i) {
		name = "peter"; //here global variable does not have a same local variable. so no need to use this keyword.
		System.out.println("1 param constructor" +name);
	  System.out.println(i);
	}

	public ConstructorConcept(int i,int j) {
		System.out.println("2 param constructor");
	  System.out.println(i + " " +j);
	}
	public ConstructorConcept(String name,int age) {
		this.name = name; //this.class variables = local variables(same global and local variable name, so use this keyword)
		this.age = age;
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		ConstructorConcept obj3 = new ConstructorConcept("Tom",25);
	}

}
//best practice is to use this keyword--because some time many variables will be there and it gets confused.
//to inializing the class properties we use constructors.
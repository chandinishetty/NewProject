package OOPConceptPart3;

public class B extends A {

	public B() {
		super(10); // this is used to call the parent class constructor
		System.out.println("Child class constructor");
	}

	public B(int i) {
		super(i);
	}

	public B(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}

}
//object of child class will first go to parent class and prints the default constructor first and then comes to child class.
//if you use super keyword with parameters now default constructor will not be called and only parameterized constructor is called.
//super keyword should be the first statement in the constructor
//should always be written in child class constructor.
//only one super keyword can be written in one constructor.
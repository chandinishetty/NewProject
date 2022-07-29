package OOPConceptPart2;

public class BMW extends Car{  //As a Relationship

	public static void start() { //here its not overriding the car class method..its child class static method
		System.out.println("BMW....start");
	}
	public void theftsafety() {
		System.out.println("BMW....theftsafety");
	}

	
}

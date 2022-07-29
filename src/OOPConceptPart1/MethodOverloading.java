package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
				obj.sum();
		        obj.sum(10);
		        obj.sum(10, 20);
	}
	
	//You cannot create a method inside a method
	//Duplicate Methods --- Same method name and same no.of arguments  with same data type is not allowed within the same class.
	//Method overloading --- When the name is same with different parameters with different data types or same no.of parameters with different data types with in the same class.
	//Method overloading --- for main method is possible with different no.of and type of arguments.
	public static void main(int i) {}
	public static void main(double i) {}
	
	public void sum() { //0 input parameter
		System.out.println("sum method---no parameters");
	}
	public void sum(int i) {//1 input parameter
		System.out.println("sum method---one parameter");
		System.out.println(i);
	}
	public void sum(int i,int j) {//2 input parameter
		System.out.println("sum method---two parameter");
	    System.out.println(i+j);
	}

}
//functions---methods
//functions are like factors we pass something and get something.

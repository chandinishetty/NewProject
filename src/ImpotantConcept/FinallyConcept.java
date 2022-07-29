package ImpotantConcept;

public class FinallyConcept {

	public static void main(String[] args) {
  test1();
  test2();
  division();

	}
	public static void test1() {
		try {
			System.out.println("inside test method");
		throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally method");
		}
	}
    
	public static void test2() {
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("inside finally test2 method");
		}
	}
	
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero");
		}
		finally {
			System.out.println("executes this code even after any exception");
		}
	}
}
//finally is associated with try catch block.
//it get executes after try catch block
//it gives the result even though the exception rises.
//whether exception occurs or not finally block gets executed no matter what.
//finally is a block
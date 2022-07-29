package Exceptions;

public class ThrowsKeyword {

	public static void main(String[] args)throws ArithmeticException {
		ThrowsKeyword obj = new ThrowsKeyword();
         obj.sum();
	}
	
	public void sum()throws ArithmeticException{
		try{
			div(); //this can be called directly by sum method without objects.
		}catch(ArithmeticException e) { //because both are non static methods.
		} 
	}
	public void div() throws ArithmeticException {
		int i =9/0;
	}

}
//JVM will catch this exception 
//jvm terminates the exception
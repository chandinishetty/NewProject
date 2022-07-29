package Exceptions;

public class Exceptionhandling {
	int a =10;
	public static void main(String[] args) {
		 
	/* uncaught exception
		int i = 9/0;
		System.out.println(i);  */
		
		/*caught exception
		Thread.sleep(2000);   */
		
		
		 //nullpointer exception
		// Exceptionhandling obj = new Exceptionhandling();
		/* obj = null; //obj is now not referring any object//canceling the reference
		 System.out.println(obj.a);
		 
		 */
		 
		 //1.try catch block:(also used  to report the exception)
		 try {
			 int i= 9/0;//this code will throw an exception
		 }catch(ArithmeticException e){	
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }
            System.out.println("ABC");
	}

}

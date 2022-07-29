package OOPConceptPart1;

public class StaticAndNonStaticMethods {
   
	//Global variables: scope of this variables will be available across all the functions with some conditions
	
	String name = "Tom"; //Non-Static Global variable
	 static int age = 25;  //Static global Variable
	 
	public static void main(String[] args) {
	//How to call static methods
		//1. Direct calling
		 sum();
		 //2.calling by classname
		 StaticAndNonStaticMethods.sum();
     
		//How to call static variables
		 //1. Direct calling
		 System.out.println(age);
		//2.calling by classname
		 System.out.println(StaticAndNonStaticMethods.age);
		 
		 //How to call a Non-static Methods and variables
		 //1.create an object
		 
		 StaticAndNonStaticMethods obj = new StaticAndNonStaticMethods();
		  obj.sendmail();
		  System.out.println(obj.name);
		  
		//can we access the non-static method "sum" here by using object?---YES
		  obj.sum();//warning will be given--as it is freely avaliable in java memory and why o use an object?
		            //not a good practice
		  

	}

	public void sendmail() { //Non-Static method
		System.out.println("send mail method");
	}
	
	public static void sum() { //Static Method
		System.out.println("sum method");
	}
	
}
/* Notes: only Non-Static methods are called by objects.
           Static Methods are not given to objects and you can call them directly or by class name.
 */

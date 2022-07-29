package OOPConceptPart1;

public class LocalvsGlobalvariables {

	//Global Variables --- Class variables
	String name = "Tom";
	int age = 25;
			
	public static void main(String[] args) {
		
		int i = 10; //Local variable of main method---Scope is only avaliable for this method
		System.out.println(i);
		
		LocalvsGlobalvariables obj = new LocalvsGlobalvariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	public void sum()
	{
	int i = 20; //Local variable of sum method--Scope is only avaliable for this method
	int j= 30;
	
	
	}

}
/*  Notes: In order to access the global variables you have to create an object.
 *          once the object gets created a copy of all the global variables and non-static methods are given to that object 
 *          now you can access them by using that object.
 * */

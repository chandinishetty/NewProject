package OOPConceptPart1;

public class FunctionsInJava {

	 //Main Method : starting point of execution
	//main method is void because it when returns a value --- no return statement is written in it.
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created and obj is the reference variable to this object
		//after creating the object the copy of all Non-static methods will be give to this particular object,
		
		obj.test();
		int i = obj.pqr();  // return value of pqr() is given to obj.pqr then it is assigned to i.
		System.out.println(i);
		String j= obj.Qa(); // return value of Qa() is given to obj.pqr then it is assigned to j.
		System.out.println(j); 
		int k = obj.division(10, 20);  // return value of division() is given to obj.pqr then it is assigned to k.
		System.out.println(k);

	}
    //Non Static Methods
	
	//void---does not return any value
	//return type : void
	//no input,no output
	public void test() { 
		System.out.println("test method");
	}
	
	//return type :int
	//no input,some output
	public int pqr() {
		int a= 10;
		int b =20;
		int c= a+b;
		return c;
		
	}
	
	//no input,some output
	//return type: string
	public String Qa() {
		System.out.println("QA Method");
		String s = "Selenium";
		
		return s;
	}
	//return type : int
	//x,y ---- input parameters/arguments
	public int division(int x,int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
		
	}
	
}

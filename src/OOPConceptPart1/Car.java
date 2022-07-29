package OOPConceptPart1;

public class Car {
  
	//Class Variables / Global Variables
	
	int mod;
	int wheel; // copy of this variables are given to each object-- each copy to all the objects created.
	
	public static void main(String[] args) {
		
		Car a = new Car(); //one object is created for car -- a is referring the object, new car() here is the object.
		Car b = new Car();//new Car() is the object, b is referring the object/representing the object
		Car c = new Car();//new keyword is used to create the object
		                  //a,b,c are object reference variables.
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod=2018;
		b.wheel=4;
		
		c.mod=2000;
		c.wheel=4;
		
		System.out.println("Before assiging the references");
		System.out.println(a.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		
		System.out.println("After assiging the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
	     c.mod=20;
		System.out.println(a.mod);
	}

}

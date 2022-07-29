package OOPConceptPart2;

public class testcar {

	
	public static void main(String[] args) {
	
		//Static polymorphism --- compile time ploymorphism
		BMW b = new BMW();
		b.start(); // (this is called over riden method)when ever there are same method with same arguments and same name present in parent and child class then method in child class gets executed.
                   // this is called as method overriding
	
	   b.stop();
	   b.refil();
	   b.theftsafety();
	   b.engine();
	   
	   Car c = new Car();
	   c.start();
	   c.stop();
	   c.refil();
	  // c.theftsafety(); parent can not access child class methods.
	   
	   
	   //Top Casting
       Car c1 = new BMW();// child class object can be referred by parent class reference variable which is called dynamic polymorphism or run time polymorphism.
	   c1.start();  //only the common methods are able to access.
	   c1.stop();
	   c1.refil();
	   
	   //Down Casting---child class reference variable can only access parent class object by casting.
	   //but generates the run time error---ClassCastException
	   BMW b1 = (BMW) new Car();
	   
	   Vechile v1 = new Vechile(); //grandparent of BMW
	   v1.engine();
	   
	   
	   
	   
	}

}
/* 
 Note: Polymorphism --- one to many---method overriding--many methods
       Static methods can not be overridden.
 */
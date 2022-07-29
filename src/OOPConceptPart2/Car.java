package OOPConceptPart2;

public class Car extends Vechile {

	//Method Hiding Concept
	  public static void start() {
		  System.out.println("car...start");
	  }
	  public void stop() {
		  System.out.println("car...stop");
	  }
	  public void refil() {
		  System.out.println("car...refil");
	  }
	  Car(){
		  
	  }
	  
}

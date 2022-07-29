package RepeatConcepts;

public class Dog extends AbstractAnimal {
   
	//public final hunt() { //can not inherit final methods.
		
	//}
	public static void main(String[] args) {
		
             Dog d = new Dog();
             d.eat();
             d.hunt();
	}

}
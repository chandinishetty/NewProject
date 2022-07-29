package RepeatConcepts;

public class Test extends AbstractShape{
	Test(){
		System.out.println("Test class constructor");
	}
	
	public static void main(String[] args) {
		
		//AbstractShape as = new Test();//whenever the object of child class is created it will call the constructor of parent class first and child class next
		//as.drawing();
		//as.fill();
		
		//whenever the object of child class is created it will call the constructor of parent class first and child class next
		//Test t = new Test();
		

	}

	@Override
	void drawing() {
		// TODO Auto-generated method stub
		
	}

}

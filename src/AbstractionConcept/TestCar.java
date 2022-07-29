package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.stop();
		b.start();
		b.refuel();
		b.Thefsafety();
		
		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();

	}

}

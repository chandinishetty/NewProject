package RepeatConcepts;

public class Car {

	String name;
	int price;
	String engine;
	
	public Car(String name,int price,String engine) {
		this.name=name;
		this.price =price;
		this.engine=engine;
	}
	public static void main(String[] args) {
		Car obj1 = new Car("BMW",10,"Automatic");
		Car obj2 = new Car("Audi",20,"Automatic");
		Car obj3 = new Car("Honda",5,"Manual");
		
		System.out.println(obj1.name+" "+obj1.price+" "+obj1.engine);
		
	}

}

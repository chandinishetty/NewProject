package SingletonConcept;

public class Singleton {

	// in OOP, a singleton class is a class that can have only one object(instance
	// of the class)at a time.
	// How to design a singleton class:
	// 1.make constructor as private
	// 2.write a static method that has return type of object of this singleton
	// class(lazy Initialization)

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "Hey, I am using singleton class pattern";
	}

	public static Singleton getInstance() {

		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;

	}

	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		x.str = (x.str).toUpperCase();	
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		y.str = (y.str).toUpperCase();	
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
//we can create only one object in the class.
//for normal class we use constructors to create objects.
//for singleton class we use getInstance() method for instantiation.
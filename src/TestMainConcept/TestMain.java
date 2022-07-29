package TestMainConcept;

public class TestMain {

	
	//JVM---Searches for main method with exact parameter
	public static void main(String[] args) {//array parameter
		System.out.println("Main Method-1");
		main("Testing");
		main(10);
		main(10,20);
		

	}
	public static void main(String args) {//normal string parameter
		System.out.println("Main Method-2");

	}
	public static void main(int a) {
		System.out.println("Main Method-3");

	}
	public static void main(int a,int b) {
		System.out.println("Main Method-4");

	}
	
}

package OOPConceptPart3;

public class ConstructorWithThisKeyword {

	//Class Variables
	String name;
	int age;
	
    public ConstructorWithThisKeyword(String name,int age) {
		this.name = name;  //this.global variable = Local variable
    	this.age = age;
    	
    	System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
	}

}
//Initialize the global variable to local variable
//same name is given to global and local variable then u have to use this keyword.

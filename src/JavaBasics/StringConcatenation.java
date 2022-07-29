package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// + : is concatenation operator
		//Println : is used to print the console with new line
		//Print : just to print output without creating a new line 
		
		int a=100;
		int b=200;
		System.out.println(a+b);
		
		double c = 12.33;
		double d = 10.33;
		
		
		String x ="hello";
		String y = "world";
		System.out.println(x+y);	//left to right execution
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+a+b+x+a+y+b);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
        System.out.println("Hello world");
        System.out.println("the value of a is :" +a);
        System.out.println("the value of a is :" +b);
        System.out.println("the addition of a and b is:" +(a+b));
        System.out.print("hello selenium");// print 
        System.out.println("Hello Testing");
	}

}

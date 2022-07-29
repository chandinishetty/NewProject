package qusetions;

public class FactorialNumber {

	//fact of 3 = 3*2*1 = 6
	//fact of 4 = 4*3*2*1 = 24
	//fact of 0 = 1
	//1=1
	
	//1.without recursive -- use for loop
	public static int factorial(int num) {
		int fact =1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;	
		}
		return fact;
	}
	
	//2.with recursive function: a function calling itself
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return(num*fact(num-1));
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(fact(4));
		System.out.println(fact(1));
		System.out.println(fact(0));

	}

}

package qusetions;

public class PrimeNumbers {

	
	public static boolean isPrimeNumber(int num) {
		//2 is the lowest prime number
		//edge/corner cases
		
				if(num<=1) {
					return false;
				}
				for(int i=2;i<num;i++) {
					if(num % i ==0) {
						return false;
						
					}
				}
				return true;
	}
	
	public static void getPrimeNumber(int num) {
		System.out.println("prime number upto"+num);
		
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i))
			System.out.println(i+"");
				
			
			}
		}
	
	
	public static void main(String[] args) {
		
		//Number which can only divide by itself and 1.
		System.out.println("2 is prime number:"+isPrimeNumber(2) );
		System.out.println("9 is prime number:"+isPrimeNumber(10) );
		System.out.println("-3 is prime number:"+isPrimeNumber(-3) );

		getPrimeNumber(10);
	}

}

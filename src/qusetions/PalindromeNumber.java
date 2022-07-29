package qusetions;

public class PalindromeNumber {

	public static void isPalindromeNumber(int num) {
		
		System.out.println("given number is:"+num);
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			
			r = num%10;
			sum = (sum*10)+r;
			num=num/10;
			
		}
		if(t==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("non palindrome number");
		}
	}
	public static void main(String[] args) {
		isPalindromeNumber(151);
	}

}

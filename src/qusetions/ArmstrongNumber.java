package qusetions;

public class ArmstrongNumber {
  
	//151 = 1*1*1 + 5*5*5 + 3*3*3
	//407 = 4*4*4 + 0 + 7*7*7
	//0 = armstrong number
	//
	//
	//
	//
	//
	public static void isArmstrongNumber(int num) {
		System.out.println("given number is:"+num);
		int cube = 0;
		int r;
	int t;
	t=num;
	
	while(num>0) {
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
	}
	
	if(t==cube) {
		System.out.println("this is an armstrong number");
	}else {
		System.out.println("this is not an armstrong number");
	}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		isArmstrongNumber(153);

	}

}

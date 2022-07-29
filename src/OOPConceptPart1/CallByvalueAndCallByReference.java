package OOPConceptPart1;

public class CallByvalueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByvalueAndCallByReference obj = new CallByvalueAndCallByReference();
		
		int x = 10;
		int y = 20;
		obj.testsum(x, y);//call by value or giving the value
		                  //here we are passing just a photo copy of x and y.
		        
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int testsum(int a,int b) {
		a= 30;
		b=40;  //here new values get changed by it will not effect actual values of x and y,bcoz we just passed a photocopy of x and y
		int c = a+b;
		return c;
		
	}
	
	//call by reference
	public void swap(CallByvalueAndCallByReference t) {
		
		int temp;
		temp = t.p; // temp = 50;
		t.p = t.q; // p = 60;
		t.q = temp; // p = 50;

		
	}

}

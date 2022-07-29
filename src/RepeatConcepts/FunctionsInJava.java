package RepeatConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int d = obj.sum();
		System.out.println(d);
		String s1 = obj.PQR();
		System.out.println(s1);

		int a = obj.div(10, 10);
		System.out.println(a);
		String s2 = obj.sendMail(10, "Tom");

		System.out.println(s2);
	}

	// 1.no input no output(no return statement):
	// void -- does not return any value
	public void test() {
		System.out.println("test method");
	}

	// 2.no input some output:
	// return type:int
	public int sum() {
		System.out.println("SUM method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String PQR() {
		System.out.println("PQR method");
		String s = "selenium";
		return s;

	}

	// 3.some input and some output
	public int div(int x, int y) {
		System.out.println("DIV method");
		int z = x / y;
		return z;

	}
	

	public String sendMail(int p, String q) {
		System.out.println("send mail method");
		String h = q + p;
		return h;
	}
}
//cannot create a function inside a function
//functions are independent to each other
//functions are parallel to each other
//duplicate functions are not allowed(same name with same no,of param with same datatypes)
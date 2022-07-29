package ImpotantConcept;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;
	
	public static void main(String[] args) {
		
		//1.case sensitive:
		//Object obj = null;
		
		//2.default ref value will be null
		System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);
		
		
		//3.this is not allowed
		//Integer i = null;
		//int j = i;
		
		//4.Instanceof 
		Integer i = null; //this is not the instance of integer
		Integer j = 20;
		
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer);
		
		//5.static vs non static
		NullConcept obj = null;
		//obj.send();//null pointer exception
		obj.sum();// can be accessed because obj is just a object reference and not the object and static methods will not hold object but can be accessed bu null references.
		
	//6. == and !=
		System.out.println(null == null);
	    System.out.println(null != null);
	
	    
	    //7.
	    String str = null;
	    Integer i1 = null;
	    Double d1 = null;
	    
	    //you can type cast null but you can not perform any operation on it.
	    String s1 =(String)null;
	    System.out.println(s1+ "123");
	    //System.out.println(s1.length());//exception
	
	  Integer i2 = (Integer)null;
	  Double d2 = (Double)null;
	
	
	
	}
	public static void sum() {
		System.out.println("sum");
		
	}
  public void send() {
	  System.out.println("send...");
  }
}
//default value of an obeject reference or any variable reference is NULL.
package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

     String x ="100";
     System.out.println(x+20);
     
     //Data Conversion : String to Int
     int i = Integer.parseInt(x);
     System.out.println(i+20);
     
     //integer,Double,Boolean
     
     String y = "12.33";
     System.out.println(y+1.2);
     double d = Double.parseDouble(y);
     System.out.println(d+1.2);
     
     String z ="True";
     boolean c = Boolean.parseBoolean(z);
	 System.out.println(c);
	 
	 //Int to String Conversion
	 
	 int j = 200;
	 System.out.println(j+20);
	 
	 String s = String.valueOf(j);
	 System.out.println(s+20);
	 
	 String a = "100A";
	 Integer.parseInt(a);// Integer is not a pure numeric values
	                     // It generates NumberFormatException
	}

}

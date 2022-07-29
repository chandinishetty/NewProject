package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array to store data types values in a array variable
		//int array
		//lowest bound/index =0
		//highest bound/index = n-1(n is size of array)
		/*single dimensional array disadvantages: 
		 * 1)size is fixed --- Static Array ---- to overcome this we use collections ---- Dynamic Array
		   2)stores similar data types values --- int declared to store only integers.
		      to overcome this we use Object Array
		
		*/
		int i[] = new int[4]; 
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[1]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
	
	    System.out.println(i.length);//size of array
	    
	    //Print all the values of array
	   for(int j=0;j<i.length;j++) {
	    System.out.println(i[j]);
	    } 
	    for(int j=3;j>=0;j--) {
		    System.out.println(i[j]);
		    }
	    
	    //double array:
	    
	    double d[] = new double[3];
	    d[0]= 12.33;
	    d[1]= 23.44;
	    d[2]= 45.55;
	    
	    System.out.println(d[2]);
	    
	    //char array:
	    
	    char c[] = new char[3];
	    c[0]='a';
	    c[1]='2';
	    c[2]='b';
	    
	    //boolean array
	    boolean b[] = new boolean[2];
	    b[0]=true;
	    b[1]=false;
	    
	    //String array
	    String s[]=new String[3];
	    s[0]="hi";
	    s[1]="hello";
	    s[2]="bye";
	    
	    System.out.println(s.length);
	    
	    /*---------------------------------------*/
	    //Object Array (object is a class)----is used to store different types of values
	    
	   Object ob[]=new Object[6];
	    ob[0]="Tom";
	    ob[1]=25;
	    ob[2]=12.33;
	    ob[3]="1/1/1998";
	    ob[4]="M";
	    ob[5]="London";
	    
	    System.out.println(ob[5]);
	    System.out.println(ob.length);
	    
	    

	}

}
 // at time you can store only one value to a variable
// int i=20
//i=2
//now i value will be 2
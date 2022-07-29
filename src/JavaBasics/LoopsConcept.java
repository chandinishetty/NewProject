package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// While Loop:(Disadvantages:if you miss incremental/decremental part then it gives infinite values))
		
		int j=1; // initialization
		while(j<=10) {  //conditional
			System.out.println(j);
			j=j+1; //Incremental/decremental
		}
		 System.out.println("*************");
		// For Loop
		//initialization,conditional,incremental/decremental
		for(int i =0;i<=10;i++) {
			System.out.println(i);
		}
		
		//print 10 to 1
		for(int k =10;k>=1;k--) {
			System.out.println(k);
		}
		
	}

}

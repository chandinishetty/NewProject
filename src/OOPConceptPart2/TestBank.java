package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);// only accessed by using interface name because it is a static variable.
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		
		//Dynamic Polymorphism--child class object can be refereed by parent interface reference variable
	     
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		
	
	}


}

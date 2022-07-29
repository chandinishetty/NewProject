package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{ //we are achieving multiple inheritance
   //Is a relationship---relationship between class and interface.
	
	//If a class is implementing any interface,then its necessary to define/override all the methods of the interface
	
	//USBank Methods --- overridden
	@Override
	public void credit() {
		System.out.println("HSBC...credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC...debit");		
	}

	@Override
	public void transfermoney() {
		System.out.println("HSBC...transfermoney");
		
	}
	 //HSBC Methods
	public void educationloan() {
		System.out.println("HSBC....educationloan");
	}

	public void carloan() {
		System.out.println("HSBC....carloan");
	}
	
	//BrazilBank methods--overriding
	public void mutualfund() {
		System.out.println("HSBC....mutualfund");
	}
	
}


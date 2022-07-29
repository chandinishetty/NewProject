package RepeatConcepts;

//ICICBank is child of CustomerData
//a class can inherit its parent class and implements multiple interfaces
public class ICICBank extends CustomerData implements USBank,RBI{


	@Override
	public void debit() {
		System.out.println("ICIC...debit");
		
	}

	@Override
	public void credit() {
		System.out.println("ICIC...credit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("ICIC...transferMoney");
		
	}

	@Override
	public void educationLoan() {
		System.out.println("ICIC...Education loan");
		
	}

	@Override
	public void carLoan() {
		System.out.println("ICIC...Car loan");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("ICIC...Home loan");
		
	}
	
	//ICIC Bank class methods
	public void mutalFund() {
		System.out.println("ICIC...mutalFund");
	}
	public void insurance() {
		System.out.println("ICIC...Insurance");
	}
 //new method added
	@Override
	public void newMethodAddded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		
	}

	
}
//if a class implements two or three interface.
//if two interfaces have same method name.
//no need override it multiple time.
//you can write your own business logic as you need.

package RepeatConcepts;

public class TestBank {

	public static void main(String[] args) {
		ICICBank ic  = new ICICBank();
			ic.carLoan();
			ic.credit();
			ic.debit();
			ic.educationLoan();
			ic.homeLoan();
			ic.transferMoney();
			ic.mutalFund();
			ic.insurance();
			System.out.println(USBank.mim_bal);
			
			ic.customers();//inheritance
			
			//top casting
			USBank ub = new ICICBank(); //type cast --- Interface reference variable can refer the class object
			ub.credit();
			ub.debit();
			ub.transferMoney();
			ub.currencyexchange();
			
			
			RBI rb = new ICICBank();
			rb.carLoan();
			rb.educationLoan();
			rb.homeLoan();
			
			USBank.balance();
			ic.currencyexchange();

	}

}
//Typecast is allowed - interface reference variable can access only its own methods.
//webdriver driver = new chromederiver();
//webdriver is interface here.
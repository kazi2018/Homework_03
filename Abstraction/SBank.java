package Abstraction;

public class SBank implements FRBank, BBank {

	
	//BangladeshBank
	@Override
	public void educationLoan() {
	System.out.println("BBank education Loan");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("BBank homeLaond");
		
	}

	@Override
	public void carLoan() {
		System.out.println("BBank carLoan");
		
	}
	
	
//FederalReserveSystem
	@Override
	public void debit() {
		System.out.println("FRBank debit");
		
	}

	@Override
	public void credit() {
		System.out.println("FRBank credit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("FRBank transferMoney");
		
	}

	@Override
	public void trading() {
		System.out.println("FRBank trading");
		
	}
	
//SBank Class methods
	
	public void mutualFunds() {
		
		System.out.println("SBank mutual funds");
	
	}
	
	public void insurance() {
		
		System.out.println("SBank insurance");
	}
	}




package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		SBank sb = new SBank();
		
		sb.educationLoan();
		sb.homeLoan();
		sb.carLoan();
		
		sb.debit();
		sb.credit();
		sb.transferMoney();
		sb.trading();
		
		sb.mutualFunds();
		sb.insurance();
		
		System.out.println(FRBank.min_bal);
		
		FRBank fr = new SBank();
		
		fr.debit();
		fr.credit();
		fr.trading();
		fr.transferMoney();
		
		
	}

}

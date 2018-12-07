package Abstraction;

public interface FRBank {
	
	int min_bal = 5000;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	public void trading();
	

}

//in interface we don't define method body but declare the method only
//method prototype
//can not create the object of interface
//no static methods
//but variables are static in nature by default
//abstraction 100%


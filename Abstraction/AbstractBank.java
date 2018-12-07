package Abstraction;

public abstract class AbstractBank {
	
	AbstractBank() {
		
		System.out.println("AbstractBank class constractor");
	}
	
	int logo;
	
	abstract void drawing();
	
	public void fill() {
		
	}
	
	//can not create the object of interface
}

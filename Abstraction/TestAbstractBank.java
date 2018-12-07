package Abstraction;

public class TestAbstractBank extends AbstractBank {

	public static void main(String[] args) {
		
		AbstractBank ab = new TestAbstractBank();
		ab.drawing();
		ab.fill();
		
		TestAbstractBank test = new TestAbstractBank();
			
		
				
	}

	@Override
	void drawing() {
		System.out.println("Test drawing");
		
	}

}

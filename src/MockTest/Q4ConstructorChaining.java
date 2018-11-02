// In constructor chaining we can constructor from another constructor.

package MockTest;

class Maruti{
	
	Maruti(){
		System.out.println("Maruti have various range of cars");
	}
}

class Ritz extends Maruti {
	Ritz(){
		System.out.println("Ritz is best model in Maruti company");
	}
	
}


public class Q4ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ritz R1 = new Ritz();
		
		
		
		

	}

}

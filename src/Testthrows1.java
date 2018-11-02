
public class Testthrows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balance = 0;
		
		try {
			
			if (balance<=0) {
				
				throw new RuntimeException("Insuff balance");
				
			}
			
			
		} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}

}}

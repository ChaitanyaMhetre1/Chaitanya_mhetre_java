


public class MyExceptionPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 20;
		
		int division = 0;
		
		System.out.println("Value of division+"+division);
		
		try {
			System.out.println("-------------111111111------------");
			division = b/a;
			System.out.println("--------------22222222-------------");
		}
		catch(Exception e) {
			
			System.out.println("--------------3333333--------------");
			System.out.println(e);			
		}   
		
		System.out.println("Value of Division 2="+division);

	}

}

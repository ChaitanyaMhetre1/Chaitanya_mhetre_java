
public class MyException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 60;
		int c = 10;
		
		int arr [] = {10,20};
		
		try {
			
			c= b/a;
			System.out.println(arr[5]);
		} 
		
		catch (ArithmeticException e) {
			
			System.out.println("Exception is caught"+e);
		}
		
		catch (ArrayIndexOutOfBoundsException e2) 
		{
			System.out.println("Exception is caught"+e2);
		}

		catch (Exception e3) {
			
			System.out.println("Exception is caught 3"+e3);
		}
		
		finally {
			
			System.out.println("Im finally block");
		}
		
		System.out.println(c);
	}

}

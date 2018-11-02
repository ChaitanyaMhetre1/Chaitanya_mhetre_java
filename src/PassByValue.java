
public class PassByValue {

	public static void sum (int a, int b) {
	a = a + 10;
	b = b + 20;
	
	
	System.out.println(a + b);
	
}
public static void main(String[] args) {
	 int x = 100;
	 int y = 200;
	 
	 
	 System.out.println("-----Before method call-------");
	 
	 System.out.println("x="+x);
	 System.out.println("y="+y);
	 
	 sum(x,y);
	 

	 System.out.println("-----after method call-------");
	 
	 System.out.println("x="+x);
	 System.out.println("y="+y);
	 
}
}

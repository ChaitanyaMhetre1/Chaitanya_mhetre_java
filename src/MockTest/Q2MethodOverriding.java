//In method overload we can use same method in same class for different operations.

package MockTest;

public class Q2MethodOverriding {
	
	

	public static void show(int Empid, int Block) {
	
		System.out.println("Displaying Employee Information:");
		System.out.println("Employee Id is: "+Empid+" and Block is: "+Block);
	}
	
	public static void show(String FirstName, String LastName ) {
		
		System.out.println("EmployeeName is: "+FirstName+LastName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show(001,01);
		show("Chaitanya","M");
		
	}

}

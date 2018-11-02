// If we declare static variables then those values we can access by static keyword


package MockTest;

class Emp{
	
	static int EmpId=001;
	static String EmpName="Chaitanya M";
	
	public void show() {
		
		System.out.println("Employee Information");
	}
	
}


public class Q5Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1 = new Emp();
		
		e1.EmpId=002;
		e1.EmpName="Prayag M";
		
		System.out.println("Employee Id is: "+Emp.EmpId);

		System.out.println("Employee Id is: "+Emp.EmpName);

	}

}

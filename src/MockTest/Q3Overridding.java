// In method overriding, child class can extends same methods from parent class.


package MockTest;

class Student{
	void show (int StudId, String StudName)
	{	
				System.out.println("Student ID:"+StudId);
		System.out.println("Student Name:"+StudName);
	}	
}
public class Q3Overridding extends Student {
	
	void show (int Std, String div)
	{
	
		System.out.println("Standard:"+Std);
		System.out.println("Division:"+div);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student ();
		System.out.println("Student Information");

		S1.show(001,"Chaitanya");
		S1.show(5, "B");
		
	}

}

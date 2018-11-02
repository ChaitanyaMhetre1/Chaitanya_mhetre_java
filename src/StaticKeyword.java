class Student{
	
	 String name;
	static String trainer;
	
	
	public void attendtTraning() {
		
		System.out.println("Attnd training");
	}
}



public class StaticKeyword {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	Student s1 = new Student();
	
s1.name = "Student1";
s1.trainer = "Naresh";

Student s2 = new Student();


s2.name = "Student2";
s2.trainer = "Naresh C";



System.out.println(s1.name);
System.out.println(Student.trainer);

	}

}

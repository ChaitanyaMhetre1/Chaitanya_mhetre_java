
class Static {

static int StudentID=10;
String StudentName;

public void info () {
	
	System.out.println("Student Information");
	
	}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static S1 = new Static ();
		
		S1.StudentID = 100;
		S1.StudentName = "Chas";
	
		System.out.println("Student ID is: "+Static.StudentID);
		System.out.println("Student Name is: "+S1.StudentName);

	}

}

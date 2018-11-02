class StudentFIGmd{
	int empid;
	String name;

	public void attendtraining () {
		
	System.out.println("Attend training");
	
	System.out.println("this="+this);
	
	System.out.println(this.empid);
	System.out.println(this.name);
	
	
	}
}

public class OOPsConcepts {
	
	public static void main(String[] args) {
	///int a = 10;
	StudentFIGmd s = new StudentFIGmd ();
		
	s.name="AA";
	s.empid=90;
	
	System.out.println("Name of Emp:"+(s.name));
	System.out.println("ID of Emp:"+(s.empid))	;
		
	s.attendtraining();
	
	StudentFIGmd s2 = new StudentFIGmd ();
	
	s2.name="Chas";
	s2.empid=20;
	

	System.out.println("Name of Emp:"+(s2.name));
	System.out.println("ID of Emp:"+(s2.empid))	;
	
	
	s2.attendtraining();
	
	
	}
	
	

}

class EmpFIGmd{
	
	int id;
	String name;
	
	public void setValue(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void display() {
		
		System.out.println(name);
	}
	
}


public class ThisKeyWord {
	
	
	public static void main(String[] args) {
		EmpFIGmd emp1 = new EmpFIGmd ();
		emp1.setValue(10, "java");
		emp1.display();
	}
	
	

}


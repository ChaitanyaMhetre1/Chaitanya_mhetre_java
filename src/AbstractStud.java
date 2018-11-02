
abstract class StudI {
	
	int StudId=10;
	String StudName="Chas";
	
	abstract void show();
	}
	
	class Info extends StudI {
		
	public void show() {
		
		System.out.println("Show Information");
	}
}

public class AbstractStud {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudI S1 = new Info();
	S1.show();
	
	System.out.println("StudID"+S1.StudId);
	System.out.println("StudName"+S1.StudName);
	
	}
}

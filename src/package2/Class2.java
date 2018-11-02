package package2;
import package1.*;

class AccessProtectedMembers extends Class1{
	
	void method() {
		
		AccessProtectedMembers m = new AccessProtectedMembers();
		m.display();
	}
}

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessProtectedMembers m = new AccessProtectedMembers();
		m.method();
		
	}

}

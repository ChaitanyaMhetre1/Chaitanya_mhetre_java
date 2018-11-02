class parent {
	
	parent(){
		System.out.println("Im parent");
	}
}

class child extends parent {
	child(){
		
		System.out.println("Im child");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		child c = new child();
		
	}

}

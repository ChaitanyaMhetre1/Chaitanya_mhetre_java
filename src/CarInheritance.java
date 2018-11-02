
class CarFigmd1{
	
	public void startengine() {
	
	System.out.println("Start Engine..");
	
}
}
class maruti extends CarFigmd1{
	
}

class bmw extends CarFigmd1{

	public void startengine() {
		
		System.out.println("BMW start");
	}
	
	
}


public class CarInheritance {

	public static void main(String[] args) {
		
		CarFigmd1 bmw = new bmw ();
		
		bmw.startengine();
		
		
	}
		// TODO Auto-generated method stub

	}


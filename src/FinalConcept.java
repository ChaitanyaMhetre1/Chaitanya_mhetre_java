class Car2 {
	String color;
	final int fuelCapacity = 30;
	
	final public void awesomeStartEngineAlgo(){
		System.out.println("awesomeStartEngineAlgo...");
	}
}

class MyCar extends Car2{
	
/*	public void awesomeStartEngineAlgo(){
		System.out.println("awesomeStartEngineAlgo...");
	}*/
}


public class FinalConcept {
	public static void main(String[] args) {
		
		Car2 c = new Car2();
		c.color = "red";
		
		c.color = "passion red";
		
		//c.fuelCapacity = 35;

	}
}
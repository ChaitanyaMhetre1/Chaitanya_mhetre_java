

class Car1{
	String color = "red";
	void startEngine1(){
		System.out.println("Starting car...");
	}
}


class BMW100 extends Car1{
	void startEngine1(){
		System.out.println("Starting BMW...");
	
}
}

public class CarInheritance1 {

	public static void main(String[] args) {
	
		Car1 c = null;
		int a = 4;
		
		if(a > 5){
			c = new Car1();
		}else{
			c = new BMW100();
		}
			c.startEngine1();
		
	}
}
class Car{
	
	String color;
	
	
	
}
public class PassByRef {
	
	public static void main(String[] args) {
		Car c1 = new Car ();
		
		c1.color = "Red";
		changecolor(c1);
		System.out.println(c1.color);
	}
	public static void changecolor(Car c2) {	
		c2.color = "Black"; 
	}
}

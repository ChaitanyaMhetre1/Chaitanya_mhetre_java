
public class CoffeeMachine {
	
	public static void powerOn(){
		System.out.println("Warm milk");
		System.out.println("Warm water");
		System.out.println("Grind coffee beans");
	}
	
	public static String getCoffee(){
		System.out.println("Mix water");
		System.out.println("Mix milk");
		System.out.println("Mix sugar + coffee");
		
		return "Coffee";
	}
	
	public static String getMyCoffee(int sugarAmount, int coffee){
		
		System.out.println("Mix water");
		System.out.println("Mix milk");
		System.out.println("adding Sugar .."+sugarAmount);
		System.out.println("adding Coffee .."+coffee);
		
		return "MyCoffee";
		
	}
	
	
	public static void main(String[] args) {
		
		powerOn();
		System.out.println("---------------");
		
		String mug1 = getCoffee();
		System.out.println("---------------");
		String mug2 = getCoffee();
		System.out.println("---------------");
		String mug3 = getCoffee();
		System.out.println("---------------");
		
		System.out.println(mug1);
		System.out.println("---------------");
		System.out.println(mug2);
		System.out.println("---------------");
		System.out.println(mug3);
		System.out.println("---------------");
		
		
		String mugMyCoffee = getMyCoffee(10, 15);
		System.out.println("---------------");
		
		System.out.println(mugMyCoffee);
		System.out.println("---------------");
	}

}
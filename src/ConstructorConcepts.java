class Mobile{
	
	String manf;
	
	void display() {
		
		System.out.println("display");
	}
	
	Mobile () {
		System.out.println("Im Mobile");
		manf = "China"; 
		
	}
	
	Mobile(String x){
		
		System.out.println("Im Mobile");
		manf = x;
	}
	
}




public class ConstructorConcepts {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		System.out.println(m1.manuf);
		
		Mobile m2 = new Mobile("Taiwan");
		System.out.println(m2.manufacturer);
		
	}
}
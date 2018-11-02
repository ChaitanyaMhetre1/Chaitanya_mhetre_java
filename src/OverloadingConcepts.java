

public class OverloadingConcepts {

public static void add (int a, int b) {
	
	System.out.println("Sum of  two numbers"+ (a+b));
}
	
public static void add (String a, String b) {
	
	System.out.println("Sum of string is "+ a+b);
}


public static void add (int a, int b, int c) {
	

	System.out.println("Sum of three numbers are " + (a+b+c));
}

 
public static void main(String[] args) {
	
	add(10,20);
	add(10,20,30);
	add("Java", " Selenium");
}

}

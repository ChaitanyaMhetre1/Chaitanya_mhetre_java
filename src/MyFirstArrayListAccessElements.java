import java.util.ArrayList;

public class MyFirstArrayListAccessElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> a1 = new ArrayList <String>();
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("A");
		
		System.out.println(a1);
		
		boolean bool = a1.contains("A1");
		System.out.println(bool);
		
		String val = a1.get(2);
		System.out.println(val);
		
		int i = a1.indexOf("C1");
		System.out.println(i);
		
		a1.clear();
		
		System.out.println(a1);
		
		
		
	}

}

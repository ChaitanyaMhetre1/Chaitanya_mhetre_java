import java.util.ArrayList;
import java.util.Iterator;



public class MyFirstArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList <String> a1 = new ArrayList <String>();
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("A");
		System.out.println(a1);

		for (int i=0; i<a1.size(); i++) {
			String val = a1.get(i);
			System.out.println(val);
		}
		
		System.out.println(a1);
		
		Iterator <String> iter = a1.iterator();
		
		while(iter.hasNext()) {
			
			String s = iter.next();
			System.out.println(s);
			
			if (s.equals("B")) {
				
				iter.remove();
			}
		}
		
		System.out.println(a1);
	}

}

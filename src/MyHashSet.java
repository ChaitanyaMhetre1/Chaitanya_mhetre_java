
import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <String> set = new HashSet<String>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		
		System.out.println(set);
		
		Iterator <String> iter = set.iterator();
		
		while(iter.hasNext()) {
			
			String s = iter.next ();
			System.out.println(s);
		}
		
		
		
	}

}

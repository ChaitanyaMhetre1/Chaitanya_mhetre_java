import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String>  hm = new HashMap<String, String>();
		hm.put("Key1", "value1");
		hm.put("Key2", "value2");
		System.out.println(hm);
		
		Set <String> s = hm.keySet();
		
		Iterator <String> iter = s.iterator();
		
while (iter.hasNext()) {
	
	String key = iter.next();
	String value = hm.get(key);
	
	System.out.println("Key="+key);

	System.out.println("Value="+value);
	
	System.out.println("--------------------------------------------------");
}
		
	}

}

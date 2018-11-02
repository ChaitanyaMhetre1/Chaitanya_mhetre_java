package MockTest;

import java.util.HashMap;
import java.util.Map;

public class Q8Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map = new HashMap <Integer,String>();
		
		map.put(1, "EmployeeA");
		map.put(2, "EmployeeB");
		map.put(3, "EmployeeC");
		
for(Map.Entry m:map.entrySet())	{
	
	System.out.println(m.getKey()+" "+m.getValue());
}
}
}

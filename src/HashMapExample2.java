import java.util.*;

class FigmdEmployees{
	
	String name;
	String empid;
	
}

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, FigmdEmployees> hm = new HashMap<String, FigmdEmployees> ();
		
		FigmdEmployees  e1 = new FigmdEmployees ();
		
		e1.name = "Emp1";
		e1.empid = "100";
		
FigmdEmployees  e2 = new FigmdEmployees ();
		
		e2.name = "Emp1";
		e2.empid = "100";
		
		hm.put("Id1", e1);
		hm.put("Id2", e2);

		FigmdEmployees emp = hm.get("Id1");
		
		System.out.println(emp.empid);

		System.out.println(emp.name);
		
	}

}

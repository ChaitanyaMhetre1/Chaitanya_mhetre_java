import java.util.ArrayList;
import java.util.Iterator;

public class StringAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Blue");
		list.add("White");
		list.add("Red");
		list.add("Black");
		
		
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			
			String s = itr.next();
			
			if (s=="Red") {
				
				itr.remove();
			}
			
		}
		
	System.out.println(list);
	list.add(3,"grey");
	System.out.println(list);
	
		
	}

}

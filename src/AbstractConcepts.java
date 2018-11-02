abstract class Shape
{
	abstract public void draw();
}


class Circle extends Shape{
	public void draw() 
	{
		System.out.println("Im Circle...");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Circle ();
		s.draw();

	}

}

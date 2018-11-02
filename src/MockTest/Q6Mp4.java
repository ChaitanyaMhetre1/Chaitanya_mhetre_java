package MockTest;

interface Music1{
	
	int tracknumber=1;
	String trackname = "We will rock you";

	
	abstract public void play();
}

class newmp3 implements Music1 {

	public void play() {
		
		System.out.println("Its Mp3 track");
	}
	
}

public class Q6Mp4 implements Music1 {

	public void play() {
		
		System.out.println("Its Mp4 track");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Music1 m = new Q6Mp4();
		m.play();
		System.out.println("Track Number is:"+m.tracknumber);
		System.out.println("Track Number is:"+m.trackname);
		
		
	}

}

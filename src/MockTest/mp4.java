package MockTest;

abstract class Music{
	
	int tracknumber=1;
	String trackname = "We will rock you";
	abstract void play();
}

class mp3 extends Music {

	public void play() {
		
		System.out.println("Its Mp3 track");
	}
	
}

public class mp4 extends Music {

	public void play() {
		
		System.out.println("Its Mp4 track");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Music m = new mp4();
		m.play();
		System.out.println("Track Number is:"+m.tracknumber);
		System.out.println("Track Number is:"+m.trackname);
		
		
	}

}

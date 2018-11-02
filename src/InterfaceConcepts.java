interface Remote{
	public void powerOnOff();
	abstract public void volume();
}

class TvRemote implements Remote{
	public void powerOnOff(){
		System.out.println("power on");
	}
	
	public void volume(){
		System.out.println("volume");
	}
}



public class InterfaceConcepts {
	public static void main(String[] args) {
		Remote r = new TvRemote();
		r.powerOnOff();
	}
}
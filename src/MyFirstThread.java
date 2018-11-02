class Mythreads extends Thread{
	public void run() {
		
		for(int i = 0; i < 10;i++) {
			
			long l2 = Thread.currentThread().getId();
			System.out.println("li2="+l2);
		}
	}
	
}

public class MyFirstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythreads t = new Mythreads();
		t.start();
		
for(int i = 0; i < 10;i++) {
			
			long l1 = Thread.currentThread().getId();
			System.out.println("li2="+l1);
		}
	}

}

package package2;



class bank{
	private int balance;
	
	void showbalance() {
		System.out.println(balance);
	}
	
	public void show() {
		System.out.println(balance);
	}
}


public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank bank = new bank ();
		bank.showbalance();
		
	}

}

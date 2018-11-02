public class StaticBlock {

	static {
		System.out.println("Im Static Block..");
	}
	
	
	StaticBlock(){
		
		System.out.println("Im Constructor");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticBlock S1 = new StaticBlock();
	

	}

}

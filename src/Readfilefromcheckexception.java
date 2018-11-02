import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;





public class Readfilefromcheckexception {
	
	public static void main (String[] args) throws IOException{
		
		readFromFile();
	}
	
	static void readFromFile() throws IOException{
		
		File File = new File ("E:/Sample.txt");
		
		
		FileInputStream fis = new FileInputStream (File);
		
		
		int val = fis.read();
		System.out.println(val);
		System.out.println((char)val);
		
	}

	
}

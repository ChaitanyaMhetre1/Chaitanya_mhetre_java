
import java.io.FilterInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile{
	
	public static void main (String[] args) {
		
		File file= new File ("E:/Sample.txt");
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			
			int val = fis.read();
			System.out.println(val);
			///System.out.println((char)val);
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}



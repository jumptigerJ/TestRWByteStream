import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByteStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			byte input[] = new byte[20];
			fis.read(input);
			
			String inputString = new String(input);
			System.out.println(inputString);
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

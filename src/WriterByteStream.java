import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("textw.txt");
			
			String outString = "write 12345Êý¾Ý";
			byte output[] = outString.getBytes();
			fos.write(output);
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

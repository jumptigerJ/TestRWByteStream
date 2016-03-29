import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadByBufferByteStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("movie.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis,1000000);
			
			FileOutputStream fos = new FileOutputStream("movie_new.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos,1000000);
			//大型文件对应的数组可以大一点，小文件对应的数组可以小一些
			byte input[] = new byte[100000];
			long before = System.currentTimeMillis();
			int count = 1;
			while(bis.read(input) != -1){
				bos.write(input);
				count++;
			}
			System.out.println(System.currentTimeMillis()-before + "ms");
			System.out.println("读取了"+count+"次");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}

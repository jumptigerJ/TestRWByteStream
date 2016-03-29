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
			//�����ļ���Ӧ��������Դ�һ�㣬С�ļ���Ӧ���������СһЩ
			byte input[] = new byte[100000];
			long before = System.currentTimeMillis();
			int count = 1;
			while(bis.read(input) != -1){
				bos.write(input);
				count++;
			}
			System.out.println(System.currentTimeMillis()-before + "ms");
			System.out.println("��ȡ��"+count+"��");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}

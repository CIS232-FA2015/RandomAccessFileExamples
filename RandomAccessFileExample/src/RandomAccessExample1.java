import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessExample1 {

	public static void main(String[] args) throws IOException{
		RandomAccessFile file = new RandomAccessFile("test.dat", "rw");
		
		//file.writeUTF("This is a Random");
		file.seek(20);
		file.writeChars("appending to a random spot in the file");
		
		file.close();
	}

}

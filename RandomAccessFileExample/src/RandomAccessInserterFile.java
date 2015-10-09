import java.io.FileNotFoundException;
import java.io.RandomAccessFile;


public class RandomAccessInserterFile extends RandomAccessFile {

	public RandomAccessInserterFile(String file, String mode) throws FileNotFoundException{
		super(file, mode);
	}
	
	public void insertChars(String s){
		//Try this out for practice
	}
}

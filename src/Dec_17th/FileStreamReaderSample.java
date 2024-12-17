package Dec_17th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamReaderSample {
	FileInputStream fis;
	byte[] mybytes = new byte[100];
	public void readFromBinaryFile() {
		try {
			fis = new FileInputStream ("Student");
			fis.read(mybytes);
			String mystr = new String (mybytes);
			System.out.println("Data Read "+mystr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileStreamReaderSample fsrs = new FileStreamReaderSample();
		fsrs.readFromBinaryFile();

	}

}

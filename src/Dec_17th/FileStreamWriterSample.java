package Dec_17th;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamWriterSample {
	FileOutputStream fos;
	byte[] mybytes = new byte[100];
	String mystr = new String("Writing to Binary File");
	public void WriteToBinaryFile() {
		//getBytes method of string converts STring to bytes
		mybytes = mystr.getBytes();
		try {
			fos = new FileOutputStream("Student");
			fos.write(mybytes);
			fos.flush();
			fos.close();
			System.out.println("Successfully Written to Binary File...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileStreamWriterSample fsws = new FileStreamWriterSample();
		fsws.WriteToBinaryFile();

	}

}

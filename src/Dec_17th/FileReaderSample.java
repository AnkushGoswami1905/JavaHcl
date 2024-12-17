package Dec_17th;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {
	FileReader fr;
	int mychar;
	public void readFromFile() {
		try {
			fr = new FileReader("Customer.txt");
			while((mychar = fr.read()) != -1) {
				System.out.print((char)mychar);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileReaderSample frs = new FileReaderSample();
		frs.readFromFile();

	}

}

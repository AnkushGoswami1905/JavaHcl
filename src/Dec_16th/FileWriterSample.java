package Dec_16th;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
	String str = "Welcome to files";
	public void writeTofile() {
		try {
			FileWriter fw  = new FileWriter("Customer.txt");
			fw.write(str);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriterSample fws = new FileWriterSample ();
		fws.writeTofile();

	}

}

package Dec_17th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializerSample {
	ObjectInputStream ois;
	FileInputStream fis;
	
	public void deSerializeStudent() {
		try {
			fis = new FileInputStream("binarystudents");
			ois = new ObjectInputStream(fis);
			ArrayList <Student> mystudents = (ArrayList<Student>) ois.readObject();
			System.out.println("Deserialization Objects are...");
			for(Student s:mystudents)
			{
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeSerializerSample dss = new DeSerializerSample();
		dss.deSerializeStudent();
		

	}

}

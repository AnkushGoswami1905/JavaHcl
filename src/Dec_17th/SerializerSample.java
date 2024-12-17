package Dec_17th;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializerSample {
	FileOutputStream fos;
	ObjectOutputStream ops;
	ArrayList <Student> Students;
	public void serialization() {
		Students = new ArrayList<Student>();
		Students.add(new Student(1000,"Harsh",89));
		Students.add(new Student(2000,"Girish",79));
		Students.add(new Student(3000,"Bijresh",69));
		Students.add(new Student(4000,"Suresh",59));
		Students.add(new Student(5000,"Mahesh",49));
		
		try {
			fos = new FileOutputStream("binarystudents");
			ops = new ObjectOutputStream(fos);
			ops.writeObject(Students);
			ops.flush();
			ops.close();
			System.out.println("Serialised Students Object...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializerSample ss = new SerializerSample();
		ss.serialization();

	}

}

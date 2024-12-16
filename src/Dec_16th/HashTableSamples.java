package Dec_16th;
import Dec_16th.Student;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableSamples {
	Hashtable <String,Student> studTable = new Hashtable<String,Student>()	;
	
	public void populateHTable() {
		studTable.put("S001",new Student("S001","Kiran Kumar",97));
		studTable.put("S002",new Student("S002","Anup Kumar",87));
		studTable.put("S003",new Student("S003","Kunal Kumar",77));
		studTable.put("S004",new Student("S004","Sidhart Kumar",67));
		studTable.put("S005",new Student("S005","Mihir Kumar",57));
	}
	public void fetchTable() {
		Enumeration <String> myKeys = studTable.keys();
		while(myKeys.hasMoreElements()) {
			String mykey = myKeys.nextElement();
			System.out.println("The value of the key:"+mykey+"is"+studTable.get(mykey));
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableSamples hts = new HashTableSamples();
		hts.populateHTable();
		hts.fetchTable();

	}

}

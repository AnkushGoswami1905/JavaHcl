package Dec_16th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HmapTmapSample {
	HashMap <String,Student> hMap = new HashMap<String,Student>();
	TreeMap <String,Student> tMap = new TreeMap<String,Student>();
	public void populateHashMap() {
		hMap.put("S001",new Student("S001","Kiran Kumar",97));
		hMap.put("S002",new Student("S002","Anup Kumar",87));
		hMap.put("S003",new Student("S003","Kunal Kumar",77));
		hMap.put("S004",new Student("S004","Sidhart Kumar",67));
		hMap.put("S005",new Student("S005","Mihir Kumar",57));
		
	}
	public void populateTreeMap() {
		tMap.put("S001",new Student("S001","Kiran Kumar",97));
		tMap.put("S002",new Student("S002","Anup Kumar",87));
		tMap.put("S003",new Student("S003","Kunal Kumar",77));
		tMap.put("S004",new Student("S004","Sidhart Kumar",67));
		tMap.put("S005",new Student("S005","Mihir Kumar",57));
		
	}
	public void fetchTreeMap() {
		Set <Entry <String,Student>> myEntries = tMap.entrySet();
		Iterator <Entry <String,Student>> myEntryIter = myEntries.iterator();
		while(myEntryIter.hasNext())
		{
			Entry <String,Student> myEntry =  (Entry<String ,Student>)myEntryIter.next();
			System.out.println("the key is" + myEntry.getKey() + "Value Object :"+myEntry.getValue());
		}
	}
	public void fetchHashMap() {
		//fetching using keyset
		Set <String> hkeys = hMap.keySet();
		Iterator <String> mykeys = hkeys.iterator();
		System.out.println("-------------Fetching HashMap Objects by Keys-----------");
		while(mykeys.hasNext()) {
			String mykey = mykeys.next();
			System.out.println("The value for the key "+mykey+" is"+hMap.get(mykey));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HmapTmapSample htsample = new HmapTmapSample();
		htsample.populateHashMap();
		htsample.fetchHashMap();
		System.out.println("-----------------------------------------------------------------------");
		htsample.populateTreeMap();
		htsample.fetchTreeMap();

	}

}

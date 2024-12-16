package Dec_12th;

import java.util.HashSet;

public class SetSample {

	HashSet <String> mySet = new HashSet<String>();
	public void populateHasSet()
	{
		mySet.add("Ahmedabad");
		mySet.add("Bangalore");
		mySet.add("Chandigarh");
		mySet.add("Delhi-New");
		mySet.add("Ernakulam");
		mySet.add("Ernakulam");
	}
	public void displaySet()
	{
		for(String s: mySet)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetSample samp = new SetSample();
		samp.populateHasSet();
		samp.displaySet();
	}

}

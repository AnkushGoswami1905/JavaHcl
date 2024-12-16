package Dec_12th;

import java.util.LinkedList;

import Dec_12th.Customer;

public class LinkedListSample {

	LinkedList <Customer> customers = new LinkedList<Customer>();
	public void populateLinkedList()
	{
		Customer cust1 = new Customer("Anurag","RTNagar","7848486784",25000);
		Customer cust2 = new Customer("Surag","Koramangala","7848445684",35000);
		Customer cust3 = new Customer("Mahesh Kumar","Vijayanagar","7843288484",45000);
		Customer cust4 = new Customer("Kiran Kumar","Jayanagar","7848478984",65000);
		Customer cust5 = new Customer("Suman","Malleswaram","7848482344",55000);
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		
	}
	public void fetchLinkedListObjects()
	{
		System.out.println("Customers are..");
		System.out.println(customers);
		for(Customer c:customers)
		{
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSample lls = new LinkedListSample();
		lls.populateLinkedList();
		lls.fetchLinkedListObjects();

	}

}

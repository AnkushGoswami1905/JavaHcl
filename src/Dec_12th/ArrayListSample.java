package Dec_12th;

import java.util.ArrayList;

public class ArrayListSample {
    // Create an ArrayList to hold Customer objects
    ArrayList<Customer> customerList = new ArrayList<>();

    // Method to populate the ArrayList with Customer objects
    public void populateArrayList() {
        Customer cust1 = new Customer("Anurag", "RT Nagar", "55621185121", 25000);
        Customer cust2 = new Customer("Surag", "Noida", "55621185122", 35000);
        Customer cust3 = new Customer("Mahesh Kumar", "Vijayanagar", "55621185123", 45000);
        Customer cust4 = new Customer("Kiran Kumar", "Jayanagar", "55621185124", 55000);
        Customer cust5 = new Customer("Suman", "Malleswaram", "55621185125", 65000);

        // Add customers to the list
        customerList.add(cust1);
        customerList.add(cust2);
        customerList.add(cust3);
        customerList.add(cust4);
        customerList.add(cust5);
    }

    // Method to fetch and display all Customer details from the ArrayList
    public void fetchArrayListData() {
        System.out.println("Fetching Customer Details from the ArrayList...");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static void main(String[] args) {
        ArrayListSample als = new ArrayListSample();
        
        // Populate the customer list
        als.populateArrayList();
        
        // Fetch and display customer list
        als.fetchArrayListData();
    }
}

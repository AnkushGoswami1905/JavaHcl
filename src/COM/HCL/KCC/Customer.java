package COM.HCL.KCC;

public class Customer {
    // Fields (variables) should use camelCase
    String custName;
    String custAddress;
    int purchaseValue;

    // Default constructor using constructor chaining
    public Customer() {
        this("Harsha", "Indiranagar", "0000000000", 20000);
    }

    // Parameterized constructor
    public Customer(String custName, String custAddress, String phone, int purchaseValue) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.purchaseValue = purchaseValue;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("The customer details are... ");
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Address: " + custAddress);
        System.out.println("Purchased Goods Worth: " + purchaseValue);
    }

    // toString() method for better string representation
    @Override
    public String toString() {
        return "Customer Name: " + custName + ", Address: " + custAddress + ", Purchase Value: " + purchaseValue;
    }

    public static void main(String[] args) {
        // Default customer
        Customer customer1 = new Customer();
        customer1.displayCustomerDetails();

        System.out.println("-------------------------------------------------------------------");

        // Parameterized customer
        Customer customer2 = new Customer("Kiran Kumar", "RT Nagar", "55621185121", 24000);
        customer2.displayCustomerDetails();

        // Demonstrate use of toString() method
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Using toString(): " + customer2);
    }
}

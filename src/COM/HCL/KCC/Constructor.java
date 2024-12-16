package COM.HCL.KCC;

public class Constructor {
    String customerName;
    int purchaseValue;
    
    // Default Constructor
//    public Constructor() {
//    }
    
    // Setter methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public void setPurchaseValue(int purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
    
    // Getter methods with proper naming convention
    public String getCustomerName() {
        return this.customerName;
    }
    
    public int getPurchaseValue() {
        return this.purchaseValue;
    }

    public static void main(String[] args) {
        // Creating an object of CustomerClass
        Constructor cust1 = new Constructor();
        cust1.setCustomerName("Ankush");
        cust1.setPurchaseValue(3000);
        
        // Calling getters and printing values
        System.out.println("Customer details are:");
        System.out.println("Customer Name: " + cust1.getCustomerName());
        System.out.println("Purchase Value: " + cust1.getPurchaseValue());
    }
}

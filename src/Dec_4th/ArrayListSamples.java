package Dec_4th;

import java.util.ArrayList;

public class ArrayListSamples {
	ArrayList <Employee> employees = new ArrayList<Employee>();
	
    public void PopulateEmployee() {
    	Employee emp1 = new Employee("Harsha","Indiranagar","99554545",10000);
    	Employee emp2 = new Employee("Kiran","RT nagar","89554545",20000);
    	Employee emp3 = new Employee("Harsh","Jayanagar","79554545",30000);
    	Employee emp4 = new Employee("Suman","Malleswaram","69554545",40000);
    	Employee emp5 = new Employee("Adarsh","Agra","9786545",50000);
    	
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
    }
    
    public void displayEmployee() {
    	System.out.println("Displaying Employee Details:");
    	for(Employee e : employees) {
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) {
		ArrayListSamples als = new ArrayListSamples();
		als.PopulateEmployee();
		als.displayEmployee();
   
	}

}

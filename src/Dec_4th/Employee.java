package Dec_4th;

public class Employee {
	String empName;
	String empAdress;
	String empPhone;
	int salray;
	
	public Employee() {
		super();
	}
    
	public Employee(String empName, String empAdress, String empPhone, int salray) {
		super();
		this.empName = empName;
		this.empAdress = empAdress;
		this.empPhone = empPhone;
		this.salray = salray;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdress() {
		return empAdress;
	}

	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public int getSalray() {
		return salray;
	}

	public void setSalray(int salray) {
		this.salray = salray;
	}
	@Override
	public String toString() {
		return "Employee :"+empName+" Residing at "+empAdress+" with contact number "+empPhone+" Draws a salarry of "+salray;
	}

//	@Override
//	public String toString() {
//		return "Employee [empName=" + empName + ", empAdress=" + empAdress + ", empPhone=" + empPhone + ", salray="
//				+ salary + "]";
//	}
	

}

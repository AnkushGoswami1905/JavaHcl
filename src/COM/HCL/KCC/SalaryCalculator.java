package COM.HCL.KCC;

public class SalaryCalculator {

    // Instance variables
    String empName;
    double empSalary;
    double grossSalary;
    double netSalary;
    double basic, hra, cca, dedn;

    // Method to calculate and display gross salary
    public void calculateSalary(String empName, double basic, double hra, double cca) {
        this.empName = empName;
        this.basic = basic;
        this.hra = hra;
        this.cca = cca;

        grossSalary = basic + hra + cca;
        System.out.println("The Gross Salary for " + empName + " is: " + grossSalary);
    }

    // Method to calculate and display net salary
    public void calculateSalary(String empName, double basic, double hra, double cca, double dedn) {
        this.empName = empName;
        this.basic = basic;
        this.hra = hra;
        this.cca = cca;
        this.dedn = dedn;

        grossSalary = basic + hra + cca;
        netSalary = grossSalary - dedn;
        System.out.println("The Net Salary for " + empName + " is: " + netSalary);
    }

    public static void main(String[] args) {
        SalaryCalculator sal = new SalaryCalculator();
        sal.calculateSalary("Harsha", 333, 235, 343); // Gross Salary Calculation
        sal.calculateSalary("Harshaaa", 333, 235, 353, 100); // Net Salary Calculation
    }
}


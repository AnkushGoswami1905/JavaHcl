package Dec_13th;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeSorter {
    public static void main(String[] args) {
        ArrayList<Student> employee = new ArrayList<>();
        employee.add(new Student("E001", "Bombay", 92));
        employee.add(new Student("E002", "Chandighar", 42));
        employee.add(new Student("E003", "Noida", 52));
        employee.add(new Student("E004", "Agra", 62));
        employee.add(new Student("E005", "Fatehpur", 82));

        // Sort by Name (Natural order)
        Collections.sort(employee);
        System.out.println("-------------Sorted by Name-------------");
        for (Student stud : employee) {
            System.out.println(stud);
        }

        // Sort by City
        Collections.sort(employee, Student.compareByCity);
        System.out.println("-------------Sorted by City-------------");
        for (Student stud : employee) {
            System.out.println(stud);
        }

        // Sort by Score
        Collections.sort(employee, Student.compareByScore);
        System.out.println("-------------Sorted by Score-------------");
        for (Student stud : employee) {
            System.out.println(stud);
        }
    }
}



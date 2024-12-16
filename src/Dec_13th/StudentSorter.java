package Dec_13th;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Chandu", "Bombay", 92));
        students.add(new Student("Andu", "Chandighar", 42));
        students.add(new Student("Bandu", "Noida", 52));
        students.add(new Student("Dandu", "Agra", 62));
        students.add(new Student("Eandu", "Fatehpur", 82));

        // Sort by Name (Natural order)
        Collections.sort(students);
        System.out.println("-------------Sorted by Name-------------");
        for (Student stud : students) {
            System.out.println(stud);
        }

        // Sort by City
        Collections.sort(students, Student.compareByCity);
        System.out.println("-------------Sorted by City-------------");
        for (Student stud : students) {
            System.out.println(stud);
        }

        // Sort by Score
        Collections.sort(students, Student.compareByScore);
        System.out.println("-------------Sorted by Score-------------");
        for (Student stud : students) {
            System.out.println(stud);
        }
    }
}

package Dec_13th;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    String studName;
    String studCity;
    int score;

    public Student() {
        super();
    }

    public Student(String studName, String studCity, int score) {
        super();
        this.studName = studName;
        this.studCity = studCity;
        this.score = score;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudCity() {
        return studCity;
    }

    public void setStudCity(String studCity) {
        this.studCity = studCity;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [Name=" + studName + ", City=" + studCity + ", Score=" + score + "]";
    }

    // Single compareTo method (Natural order is by name)
    @Override
    public int compareTo(Student o) {
        return this.getStudName().compareTo(o.getStudName());
    }

    // Custom Comparator to sort by City
    public static Comparator<Student> compareByCity = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getStudCity().compareTo(s2.getStudCity());
        }
    };

    // Custom Comparator to sort by Score
    public static Comparator<Student> compareByScore = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getScore(), s2.getScore());
        }
    };
}

package Dec_9th;

public class StacticExamples {
    int nonStaticVar; // Non-static variable
    static int staticVar; // Static variable
    final int finalVar = 56; // Final variable (cannot be changed)

    public final void finalMethod() {
        nonStaticVar++;
        staticVar++;
    }

    // Static method (can only access static variables)
    public static void staticMethod1() {
        staticVar++;
        System.out.println("Static Variable in staticMethod1(): " + staticVar);
    }

    // Non-static method (can access both static and non-static variables)
    public void nonstaticMethod1() {
        staticVar++;
        nonStaticVar++;
        System.out.println("Static Variable in nonstaticMethod1(): " + staticVar);
        System.out.println("Non Static Variable in nonstaticMethod1(): " + nonStaticVar);
    }

    // Static method (can only access static variables)
    public static void staticMethod2() {
        staticVar++;
        System.out.println("Static Variable in staticMethod2(): " + staticVar);
    }

    // Non-static method (can access both static and non-static variables)
    public void nonstaticMethod2() {
        staticVar++;
        nonStaticVar++;
        System.out.println("Static Variable in nonstaticMethod2(): " + staticVar);
        System.out.println("Non Static Variable in nonstaticMethod2(): " + nonStaticVar);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create first instance of StacticExamples
        StacticExamples stat1 = new StacticExamples();

        // Call static method
        staticMethod1();

        // Call non-static methods
        stat1.nonstaticMethod1();
        stat1.nonstaticMethod2();

        // Create second instance of StacticExamples
        StacticExamples stat2 = new StacticExamples();

        // Call static method
        staticMethod2();

        // Call non-static methods
        stat2.nonstaticMethod1();
        stat2.nonstaticMethod2();
    }
}

package Dec_3rd;

public class ArraySamples {
    public void sample1Darray() {
        int arr1[] = new int[10];
        // Populating the array
        for (int i = 0; i < 10; i++) {
            arr1[i] = (i + 1) * 10;
        }
        // Fetching elements of 1D array
        for (int j = 0; j < 10; j++) {
            System.out.println("The element is " + arr1[j]);
        }
    }

    public void Sample2DArray() {
        int arr2[][] = new int[3][4];
        // Populating the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j] = (i + j) * 10;
            }
        }
        // Displaying 2D array elements
        System.out.println("Displaying 2D array Elements");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void StringArraySample() {
        String[][] countriesCap = { { "India", "New Delhi" }, { "England", "London" }, { "USA", "Washington" } };
        // Iterating through the string array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 1) { // Separate country and capital for better readability
                    System.out.print("Capital: " + countriesCap[i][j]);
                } else {
                    System.out.print("Country: " + countriesCap[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }
    
    public void jaggedArraySample() {
        int jagar[][] = new int[3][];
        jagar[0] = new int[4];
        jagar[1] = new int[5];
        jagar[2] = new int[6];
        
        // Populating the jagged array
        for (int i = 0; i < 4; i++) {
            jagar[0][i] = (i + 1) * 10;
        }
        
        for (int j = 0; j < 5; j++) {
            jagar[1][j] = (j + 1) * 10;
        }
        
        for (int k = 0; k < 6; k++) {
            jagar[2][k] = (k + 1) * 10;
        }
        
        System.out.println("--------------Displaying jagged array----------------");
        
        // Displaying elements of the jagged array
        for (int i = 0; i < 4; i++) {
            System.out.print(jagar[0][i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.print(jagar[1][i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < 6; i++) {
            System.out.print(jagar[2][i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArraySamples ars = new ArraySamples();
        ars.sample1Darray();
        ars.Sample2DArray();
        ars.StringArraySample();
        ars.jaggedArraySample();
    }
}

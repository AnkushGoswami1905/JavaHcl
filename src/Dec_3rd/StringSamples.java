package Dec_3rd;

public class StringSamples {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1 equals to str2: " + str1.equals(str2)); // false
        System.out.println("str1 == str2: " + (str1 == str2)); // false

        String str3 = "India";
        String str4 = "India";
        System.out.println("str3 equals to str4: " + str3.equals(str4)); // true

        System.out.println("-----------string as an object-----------");
        String str5 = new String("India");
        String str6 = new String("India");
        System.out.println("str5 equals to str6: " + str5.equals(str6)); // true
        System.out.println("str5 == str6: " + (str5 == str6)); // false

        String str7 = new String("India is great");
        System.out.println("Length of str7: " + str7.length()); // 14
        String str8 = new String("INDIA IS PEACE LOVING COUNTRY");
        System.out.println("Lowercase str8: " + str8.toLowerCase()); // india is peace loving country
        System.out.println("Character at index 6 in str8: " + str8.charAt(6)); // I
        System.out.println("str8.indexOf('P'): " + str8.indexOf("P"));
        
        String strA = "Hello";
        String strB = "hello";
        System.out.println("strA.compareTo(strB):" +strA.compareTo(strB));
        System.out.println("strA.compareToIgnoreCase(strB):" +strA.compareToIgnoreCase(strB));
        
        
        System.out.println("---------------------------stringbuilder-------------------------");
        StringBuilder sbr1 = new StringBuilder("Hello world");
        System.out.println("Before appending:" +sbr1);
        
        sbr1.append(" new world");
        System.out.println("After appending:" +sbr1);
        
        System.out.println("---------------------------stringbuffer-------------------------");
        StringBuffer sfr1 = new StringBuffer("Hello new world");
        System.out.println("Before appending:" +sfr1);
        
        sfr1.append(" is a beatiful world");
        System.out.println("After appending:" +sfr1);
    }
}

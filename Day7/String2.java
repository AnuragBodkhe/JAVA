package Day7;

import java.sql.SQLOutput;

public class String2 {
    public static void main(String[] args) {

        String str1 = "Anurag"; // String str1
        System.out.println(str1.length()); // Print length of str1

        System.out.println(str1.charAt(str1.length() - 1)); // Print last character of str1

        System.out.println(str1.toLowerCase()); // Print in LowerCase
        System.out.println(str1.toUpperCase()); // Print in UpperCase

        String str2 = "IronMan"; // String str2
        System.out.println(str2.contains("Man")); // If contains Man then "True" else "False"
        System.out.println(str2.startsWith("I")); // Start with I then "True" else "False"
        System.out.println(str2.endsWith("n")); // End with n then "True" else "False"

        String str3 = "MIT ADT"; // String str3
        System.out.println(str3.substring(2, 4)); // Print AD starts from index 2 to 4
        System.out.println(str3.replace("pune", "mumbai")); // Print ADT starts from index 2 to end

        String str4 = "Java,Python,C++"; // String str4
        String arr[] = str4.split(","); // split str4
        for (String sub : arr) {
            System.out.println(sub);  // Print Java,Python,C++

            //  String str5 = "Java/Python/C++";
            //String arr[] = str5.split("/"); // split str4
            //for (String sub : arr) {
            //  System.out.println(sub);  // Print Java,Python,C++

            String name = "Anurag Bodkhe"; // String name

            for (int i = 0; i < name.length(); i++) { // Iterate through each character of the name
                char ch = Character.toLowerCase(name.charAt(i));

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // Check if the character is a vowel
                    System.out.println(ch);
                }
            }

        }
        }
        }





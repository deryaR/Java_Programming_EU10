package day13_String;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("ThirdChar: " + thirdChar);

         /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("------------------------------");


        String s1 ="Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length();

        System.out.println("TotalChars = " + totalChars );

        char lastChar = s1.charAt(s1.length()-1); // last index number
        System.out.println("LastChar= " +lastChar );

        System.out.println("------------------------------");

        String str = "wooden spoon ";
        str =str.toUpperCase(); // "WOODEN SPOON "
        System.out.println(str);

        String s = "JAVA";
        str =  str.toUpperCase();
        System.out.println(str);

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);




    }
}

package utilities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtility {
    public static void printEachChar(String str) {

        //prints each character of the given string
        // verilen dizgenin her karakterini yazdırır

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }


    //reverses the given string and returns the reversed string
    //verilen diziyi tersine çevirir ve ters diziyi döndürür
    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result; //"avaJ
    }

    //checks if the given String is palindrome, returns boolean
    // verilen String'in palindrom olup olmadığını kontrol eder, boole döndürür

    public static boolean isPalindrome(String str) {
     return reverse(str).equalsIgnoreCase(str);
    }


    //checks if the given string is anagram, returns boolean
    // verilen dizgenin anagram olup olmadığını kontrol eder, boole döndürür
    public static boolean anagram(String str1, String str2){  // "acb", "bca"
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        return Arrays.equals(ch1, ch2);

    }


    //removes the duplicates from given string, returns String.
    // verilen dizgedeki kopyaları kaldırır, String'i döndürür.

    public static String removeDuplicates (String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(result.contains("" + each)){
                result += each;
            }
        }
        return result;
    }




}

package day25_CustomMethods_Overloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int [] numbers ={1,2,3,4,5,6}; //7

        numbers = addElement(numbers, 7);

        char [] chars = {'A', 'B', 'C', 'D'}; //'E'

        chars = addElement(chars,'E');

        String [] names = {"Ahmet","oleksandr", "Sinem", "Cihan"}; // "Layan"

        names = addElement(names,"Layan");

        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("chars = " + Arrays.toString(chars) );
        System.out.println("names = " + Arrays.toString(names));




    }

    //  1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    //    1. bir tamsayı dizisinin son dizininden sonra bir Tamsayı ekleyebilen addInteger adında bir dönüş yöntemi oluşturun.
    public static int[] addElement (int [] array, int element){

        int[] result = new int [array.length + 1];

        int i = 0 ;
        for (int each : array) {
            result [i++] = each;
        }
        result[i] = element;

        return result;
    }


    //  2. create a return method called addDouble that can add a double after the last index of a double array
    //    2. bir çift dizinin son dizininden sonra bir çift ekleyebilen addDouble adında bir dönüş yöntemi oluşturun.
    public static double[] addElement (double [] array, double element){
        double[] result = new double[array.length + 1];

        int i = 0 ;
        for (double each : array) {
            result [i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //3. create a return method called addString that can add a String after the last index of a String array
    //    3. bir String dizisinin son dizininden sonra bir String ekleyebilen addString adında bir dönüş yöntemi oluşturun.

    public static String[] addElement (String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }


    //  4. create a return method called addChar that can add a char after last index of a char array
    //   4. bir karakter dizisinin son dizininden sonra bir karakter ekleyebilen addChar adında bir dönüş yöntemi oluşturun.

    public static char[] addElement (char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }



}

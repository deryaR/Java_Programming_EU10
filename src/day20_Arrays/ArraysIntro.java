package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names
        String [] myGroup =new String[5];
        myGroup[0] = "Nevdin";
        myGroup[1] = "Gulay";
        myGroup[2] = "Ebrar";
        myGroup[3] = "Necip";
        myGroup[4] = "Derya";

        // eger string 5 tanimladiysan 01234 yani tolamda 5 karakter girmen gerekir 6 sini yani 5 sini kabul etmez
       //  myGroup[5] = "Derya";
       //  myGroup[-1] = "Derya";


        System.out.println(Arrays.toString(myGroup));


        System.out.println("--------------------------------------------------------------------------");

        String [] days ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index              0       1           2             3         4          5            6
        System.out.println(Arrays.toString(days));


        int number = 5;
        if (number <1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number -1]);


    }

}

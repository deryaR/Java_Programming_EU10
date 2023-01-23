package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 5;

        switch (number){ //1, 2, 3, 4, 5, 6, 7, ==
            case 1 :
                System.out.println("Monday");
                break; //exits he switch after executing the case block
            case 2 :
                System.out.println("Tuesday");
                break; //exits he switch after executing the case block
            case 3 :
                System.out.println("Wednesday");
                break; //exits he switch after executing the case block
            case 4 :
                System.out.println("Thursday");
                break; //exits he switch after executing the case block
            case 5 :
                System.out.println("Friday");
                break; //exits he switch after executing the case block
            case 6 :
                System.out.println("Saturday");
                break; //exits he switch after executing the case block
            case 7 :
                System.out.println("Sunday");
                break; //exits he switch after executing the case block



            default: // only gets executed if none of the case blocks are matching
                System.out.println("Invalid");
                // we don't need to give break statement for the last block of the switch in order to exit the switch


        }




    }
}
/*

Switch Statement: switch, case, default, break
syntax:
switch(Data){
case data1:
Statements;
break;
case data2:
Statements;
break;
default:
Statements;
break;
}
 */
package day08_IfStatement;

public class NameOfDays {
    public static void main(String[] args) {
         int  number =7 ;

         boolean monday    = number == 1,
                 tuesday   = number == 2,
                 wednesday = number == 3,
                 thursday  = number == 4,
                 friday    = number == 5,
                 saturday  = number == 6,
                 sunday    = number == 7;

         if (monday){
             System.out.println("Monday");
         }
        if (tuesday){
            System.out.println("Tuesday");
        }
        if (wednesday){
            System.out.println("Wednesday");
        }
        if (thursday){
            System.out.println("Thursday");
        }
        if (friday){
            System.out.println("Friday");
        }
        if (saturday){
            System.out.println("Saturday");
        }
        if (sunday){
            System.out.println("Sunday");
        }


    }
}
 /*
 2. write a program that can display the name of the day
number = 1 ~ 7
  */
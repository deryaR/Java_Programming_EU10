package day08_IfStatement;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {

        int number = 100;

     /*
        System.out.println("Odd Number");
        System.out.println("Even Number");

      */

        boolean evenNumber = number%2 == 0;
        boolean OddNumber = ! evenNumber;  //not even number


        if (evenNumber){ // even numbers // true
            System.out.println(number + " is even number");
        }
      if (OddNumber){  //not even number // false
          System.out.println(number + " is odd number");
           }

        System.out.println("__________________________________________________________");

      int n = 200;

         // positive
        if (n > 0){ //if the n is greater than zero,then it's positive
            System.out.println(n + " is positive");
        }

        // negative
         if (n < 0){ // if the n is lrs than zero, then it's negative
             System.out.println(n + "is negative");
         }

        //zero
        if (n == 0){
            System.out.println(n +"is zero");
        }



    }
}

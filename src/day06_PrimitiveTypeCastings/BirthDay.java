package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear =  1995;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + "." );


        System.out.println("____________________________________________________________________");

        //My favourite book is "bookName".
        String bookName = "The Rich Dad and Poor Dad ";
        System.out.println(" My favourite book is" + " \"" + bookName + "\".");


    }
}
/*
Package name: day06_PrimitiveTypeCastings

Warmup tasks
	1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */
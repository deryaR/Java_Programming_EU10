package day23_CustomMethods_void;

public class CustomMethodsWIthParameters {
    public static void main(String[] args) {
        //  oddOrEven(); // the method demands additional info to complete its task
        oddOrEven(10);

        ageOfThePerson(29);

        printNumbers(1000,2000);

    }
    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if(number % 2 == 0){
            System.out.println(number + " is even number.");
        }else {
            System.out.println(number + " is odd number.");
        }

    }

    // create a function that can display the age of the person
    public static void ageOfThePerson (int birthYear){
        int age = 2022 - birthYear;

        System.out.println("Your age is : " + age);

    }


    //                                                       10       50
    //create a function that can print all the numbers between X and Y
    public static void printNumbers (int x, int y){

    }

}
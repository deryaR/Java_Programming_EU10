package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is ____________
        System.out.println("Full name of the person is " + fullName);

        // ____ is ____ years old.
        System.out.println(fullName + " is " + age + " years old.");

        //FullName is JobTitle,works at CompanyName, and fUllName's salary is $salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName +
                ", and "+ fullName + "'s salary is $"+ salary);


    }
}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName

2. lastName

3. Use concatenation to print the full name

 */
package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.println("Enter your full name: ");
        String fullName =input.nextLine();

        System.out.println("Enter your Programming Language: ");
        String programming =input.nextLine();

        System.out.println("Enter your age ");
        String age =input.nextLine();

        input.nextLine(); //capture the enter key that user pressed for nextInt()

        System.out.println("Enter your schoolName ");
        String schoolName =input.nextLine();


        System.out.println("FullName = " + fullName);
        System.out.println("Programming = " + programming);
        System.out.println("Age = " + age);
        System.out.println("School Name = " + schoolName);

        input.close();










    }
}

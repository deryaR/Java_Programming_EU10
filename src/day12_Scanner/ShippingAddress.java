package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        scan.nextLine();

        System.out.println("Enter your building number: ");
        String building = scan.next();
        scan.nextLine();



        System.out.println("Enter your Street name ");
        String street = scan.nextLine ();

        System.out.println("Enter your city name ");
        String city = scan.nextLine ();

        System.out.println("Enter your state ");
        String state = scan.next();


        System.out.println("Enter your zip code ");
        String zipCode = scan.next ();

        scan.nextLine();

        System.out.println("Enter your country name ");
        String countryName = scan.nextLine();

        scan.close();

    }
}
/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( next() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */
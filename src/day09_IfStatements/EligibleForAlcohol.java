package day09_IfStatements;

public class EligibleForAlcohol {
    public static void main(String[] args) {

        String name = "John";
        int age = 17;

        if (age > 21) {
            System.out.println(name + " is eligible to buy alcohol");
        }else {
            System.out.println(name + " is not eligible to buy alcohol");
        }

    }
}

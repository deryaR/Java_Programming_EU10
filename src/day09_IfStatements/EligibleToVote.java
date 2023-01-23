package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 24;
        String citizen = "UK";
        boolean isEligibleToVote = age > 18 && citizen == "UK";

        if(isEligibleToVote){
            System.out.println(name + " is eligible to vote" );
        } else {
            System.out.println(name + " is not eligible to vote" );
        }
    }
}

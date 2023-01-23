package day14_string;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "     batch 25     ";
        str1 = str1.trim(); //"batch 25"

        System.out.println(str1);


        System.out.println("-------------------------------------");

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2);

        System.out.println("-------------------------------------");

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);


        System.out.println("---------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
       // int forthA = s.indexOf("ava W");
       // int forthA = s.lastIndexOf("av");
        int forthA = s.indexOf("Ca") + 1;
        //int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");
       // int seventhA = s.indexOf("a o");


        System.out.println("First A = "+firstA);
        System.out.println("Last A = "+lastA);
        System.out.println("Second A = "+ secondA);
        System.out.println("Third A = " + thirdA);
        System.out.println("Forth A = " + forthA);
        System.out.println("Fifth A = " + fifthA);
        System.out.println("Sixth A = " + sixthA);
        System.out.println("Seventh A = " + seventhA);






    }
}

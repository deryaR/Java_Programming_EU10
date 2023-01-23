package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        // find the max number between 100 & 200
        //100 ile 200 arasındaki maksimum sayıyı bulun

        int maxNumber = max(100,200);
        System.out.println("Max Numbers = "  + maxNumber);


        // multiply the max number by 2
        // maksimum sayıyı 2 ile çarp

        int multiplication = maxNumber * 2;
        System.out.println("multiplication = "  + multiplication);
    }

    public static int max (int a, int b) {
        int result = 0;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result ;
    }
}

package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int s = 135;

        if (s >= 0 && s <= 100 ){ // if the s is valid
            // 5 possibilities: A, B, C, D, E,
            if (s >= 90 ){ // false: s < 90
                System.out.println("Excellent");
            }else if (s >= 80){ // false: s < 80
                System.out.println("Great");
            }else if (s >=70){ // false: s < 70
                System.out.println("Good");
            }else if (s >=60) { // false: s < 60
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }


        }else { // if the s is not valid
            System.out.println("Invalid score");
        }




        System.out.println("--------------------------------------");
       /* //solution2: use ternaries ONLY

        String result =(s >= 0 && s <= 100 )? ( s >= 90 )? "Excellent":    ( s >= 80)? "Great" : (s >=70)?"Good"
                     : (s >=60) ? "Passed": "Failed" :"Invalid score";
        System.out.println(result);

        */

        System.out.println("--------------------------------------");

        //solution3

        String result2="";
        if (s >= 0 && s <= 100 ) {
            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" :"Failed";

        }else {

            result2 = "Invalid Score";
        }

        System.out.println(result2);



    }
}

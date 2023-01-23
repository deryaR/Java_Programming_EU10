package day09_IfStatements;

import java.sql.SQLOutput;

public class GradeReport {
    public static void main(String[] args) {


        int grade = 55;
        String finalGrade ;

        if (grade >= 90  && grade <= 100 ){
            finalGrade = "A";
        }else if (grade >= 90  && grade <= 100 ) {
            finalGrade = "B";
        }else if (grade >= 90  && grade <= 100 ) {
            finalGrade = "C";
        }else if (grade >= 90  && grade <= 100 ) {
            finalGrade = "D";
        }else  {
            finalGrade = "F";
        }
        System.out.println("Grade = " + finalGrade);
    }
}

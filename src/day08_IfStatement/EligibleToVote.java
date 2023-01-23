package day08_IfStatement;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "John";
        int age = 38;
        String citizen ="USA";   //true

        boolean isEligible = age >= 21 && citizen == "USA";

        //Eligible
        if (isEligible){   // true
            System.out.println("Eligible");
        }
        //Not Eligible
        if (! isEligible){  //false
            System.out.println("Not Eligible");
        }

    }
}

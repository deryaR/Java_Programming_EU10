package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        //System.out.println(AccessModifiers_Test4.name1); // default is not
        System.out.println(AccessModifiers_Test4.name2); // protected is visible


        // AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2();

    }
}

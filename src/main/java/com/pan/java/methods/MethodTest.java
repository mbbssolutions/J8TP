package com.pan.java.methods;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class MethodTest {

    public static void main(String[] args) {
        StaticCheck.setTestValue(5);

        // non-private static variables can be accessed with class name
        StaticCheck.testString = "\nAssigning testString a value";
        StaticCheck sc = new StaticCheck();
        System.out.println(sc.getTestString());

        // class and instance static variables are same
        System.out.print("\nCheck if Class and Instance Static Variables are same:  ");
        System.out.println(StaticCheck.testString == sc.testString);
        System.out.println("Why? Because: StaticCheck.testString == sc.testString");

        System.out.println("Test after GIT");
    }
}

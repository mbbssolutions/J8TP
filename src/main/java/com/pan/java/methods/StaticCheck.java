package com.pan.java.methods;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class StaticCheck {

    public static String testString;
    private static int testValue;

    static {
        System.out.println("Inside static method 1");
        setTestString("This is static blocks string");
        setTestValue(2);
    }

    static{
        System.out.println("Inside 2nd static block");
    }


    public static void setTestValue(int testValue) {
        StaticCheck.testValue=testValue;
        if(testValue>0){
            System.out.println("setTestValue method : "+ testValue);
        }
    }

    private static void setTestString(String testString) {
        StaticCheck.testString=testString;
        System.out.println("testString Value : "+testString);
    }

    public String getTestString() {
        return testString;
    }
}

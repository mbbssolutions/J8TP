package com.pan.java8.lambda;


import java.util.Arrays;

/**
 * Created by Pavan_Karasala on 10/14/2016.
 */
public class Lambda1 {
    public static void main(String args[]){

//       Check1
        Arrays.asList("a", "b", "c").forEach(e-> System.out.print(e));

        System.out.println();
//check 2
        Arrays.asList("a", "b", "c").forEach(e->
        {
            System.out.print(e);
            System.out.print(e);
        });

        System.out.println();
//Check 3
        String separator = ",";
        Arrays.asList( "a", "b", "c" ).forEach(( String e )-> System.out.print( e + separator ) );

        System.out.println();
        //    Check 4
        final String separator1 = ",";
        Arrays.asList( "a", "b", "c" ).forEach(( String e )-> System.out.print( e + separator1 ) );

        System.out.println();
//Check 5

        Arrays.asList("a","b","c").sort((e1,e2)->e1.compareTo(e2));

        Arrays.asList("a","b","c").sort((e1,e2)->{
            int result=e1.compareTo(e2);
            System.out.println(result);
            return result;
        });

    }

}

package com.pan.java8.lambda;

import java.util.Optional;

/**
 * Created by Pavan_Karasala on 10/18/2016.
 */
public class OptionalCheck {
    public static void main(String[] args){
        Optional<String> firstname=Optional.ofNullable(null);
        System.out.println("First name is set ? : "+firstname.isPresent());
        System.out.println("First name  :"+firstname.orElseGet(()->"[None]"));
        System.out.println(firstname.map(s -> "Hey "+s+ "!").orElse("Hey Stranger!!!"));

        System.out.println();

        Optional<String> lastname=Optional.of("Pavan");
        System.out.println("Last name is set ?"+lastname.isPresent());
        System.out.println("Last name :"+lastname.orElseGet(()->"[none]"));
        System.out.println(lastname.map(s -> "Hey "+s+"!!!").orElse("Hey Stranger!!!"));
    }
}

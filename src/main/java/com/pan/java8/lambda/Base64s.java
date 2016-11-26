package com.pan.java8.lambda;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by Pavan_Karasala on 11/5/2016.
 */
public class Base64s {
    public static void main(String args[]){
        final String text="Base64 finally in JAVA 8!";

        final String endcoded= Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(endcoded);

        final String decoded= new String(Base64.getDecoder().decode(endcoded),StandardCharsets.UTF_8);
        System.out.println(decoded);

    }
}

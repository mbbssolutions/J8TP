package com.pan.java8.lambda;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public interface Defaulable {
    default String notRequired(){
        return "Default implementation";
    }


}

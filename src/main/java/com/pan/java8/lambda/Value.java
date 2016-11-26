package com.pan.java8.lambda;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class Value<T> {
    public static<T> T defaultValue(){
        return null;
    }

    public T getOrDefault(T value,T defaultValue){
        return (value!=null)?value:defaultValue;
    }
}

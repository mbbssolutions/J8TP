package com.pan.java8.lambda;


import java.lang.annotation.*;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class RepeatingAnnotations {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters{
        Filter[] value();
    }

    @Target( ElementType.TYPE )
    @Retention( RetentionPolicy.RUNTIME )
    @Repeatable( Filters.class )
    public @interface Filter{
        String value();
    }

    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable{

    }
    public static void main(String args[]){
        for(Filter filter:Filterable.class.getAnnotationsByType(Filter.class) ){
            System.out.println(filter.value());
        }
    }
}

package com.pan.java8.lambda;

import java.util.function.Supplier;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class DefaultAndStaticMethod {
    public static void main(String ars[]){
        Defaulable defaulable=DefaulableFactory.create(DefaulableImpl::new);
        System.out.println(defaulable.notRequired());

        defaulable=DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaulable.notRequired());


    }
}

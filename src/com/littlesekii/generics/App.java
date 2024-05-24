package com.littlesekii.generics;

import com.littlesekii.generics.data_sctructures.TypedDSExamples;
import com.littlesekii.generics.data_sctructures.UntypedDSExamples;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("============Sized Untyped Queue===========");
        UntypedDSExamples.sizedQueue();
        System.out.println("==========================================");

        System.out.println();

        System.out.println("===============Dynamic Untyped Queue==============");
        UntypedDSExamples.dynamicQueue();
        System.out.println("==========================================");

        System.out.println("=============Sized Typed Queue============");
        TypedDSExamples.sizedQueue();
        System.out.println("==========================================");
        
        System.out.println();

        System.out.println("============Dynamic Typed Queue===========");
        TypedDSExamples.dynamicQueue();
        System.out.println("==========================================");

    }
}

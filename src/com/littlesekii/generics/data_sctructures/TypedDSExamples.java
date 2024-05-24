package com.littlesekii.generics.data_sctructures;

import com.littlesekii.generics.data_sctructures.domain.TypedQueue;

public class TypedDSExamples {
    
    public static void sizedQueue() {
        
        TypedQueue<String> objectQueue = new TypedQueue<>(5);
        
        //THIS THROWS AN InvalidDataStructureSizeException EXCEPTION
        // UntypedQueue dynamicObjectQueue = new UntypedQueue(-1);

        objectQueue.push("Davi Bacalhau");
        objectQueue.push("Flávia Helena");

        //THIS IS NOT PERMITTED BY COMPILER
        // objectQueue.push(100);        
        // objectQueue.push(100.5);
        // objectQueue.push(true);
        
        //THIS THROWS AN InvalidDataStructureAccessException EXCEPTION
        // objectQueue.push("");

        while(!objectQueue.isEmpty()) {
            System.out.println(objectQueue.get());
        }

        //THIS THROWS AN InvalidDataStructureAccessException EXCEPTION
        // System.out.println(objectQueue.get());
    }

    public static void dynamicQueue() {
        
        TypedQueue<Integer> dynamicObjectQueue = new TypedQueue<>();

        for(int i = 1; i <= 100; i++) {
            dynamicObjectQueue.push(i);
        }

        //THIS IS NOT PERMITTED BY COMPILER
        // dynamicObjectQueue.push("This queue is so big 🤯");
        
        while(!dynamicObjectQueue.isEmpty()) {
            //THIS IS NOT PERMITTED BY COMPILER
            //String s = dynamicObjectQueue.get();

            int n = dynamicObjectQueue.get();
            System.out.println(n);           
        }
    }

}

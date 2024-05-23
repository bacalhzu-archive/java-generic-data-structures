package com.littlesekii.generics.data_sctructures;

import com.littlesekii.generics.data_sctructures.domain.UntypedQueue;

public class UntypedDSExamples {
    
    public static void sizedQueue() {
        
        UntypedQueue objectQueue = new UntypedQueue(5);
        
        //THIS THROWS AN InvalidDataStructureSizeException EXCEPTION
        // UntypedQueue dynamicObjectQueue = new UntypedQueue(-1);

        objectQueue.push("Davi Bacalhau");
        objectQueue.push("Flávia Helena");
        objectQueue.push(100);        
        objectQueue.push(100.5);
        objectQueue.push(true);
        
        //THIS THROWS AN InvalidDataStructureAccessException EXCEPTION
        // objectQueue.push("");

        while(!objectQueue.isEmpty()) {
            System.out.println(objectQueue.get());
        }

        //THIS THROWS AN InvalidDataStructureAccessException EXCEPTION
        // System.out.println(objectQueue.get());
    }

    public static void dynamicQueue() {
        
        UntypedQueue dynamicObjectQueue = new UntypedQueue();

        for(int i = 1; i <= 100; i++) {
            dynamicObjectQueue.push(i);
        }

        dynamicObjectQueue.push("This queue is so big 🤯");
        
        while(!dynamicObjectQueue.isEmpty()) {
            System.out.println(dynamicObjectQueue.get());
        }
    }

}

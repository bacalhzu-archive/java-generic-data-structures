package com.littlesekii.generics.data_sctructures.domain;

import com.littlesekii.generics.data_sctructures.domain.exception.InvalidDataStructureAccessException;
import com.littlesekii.generics.data_sctructures.domain.exception.InvalidDataStructureSizeException;
import com.littlesekii.generics.data_sctructures.domain.interfaces.TypedDataStructure;

public class TypedQueue<T> implements TypedDataStructure<T> {

    private final int DEFAULT_DYNAMIC_SIZE = 100;

    private int maxSize;
    private int size = 0;

    private Object[] queue;

    

    /**
    * Instantiate a dynamic sized queue
    *
    * @see TypedQueue
    */
    public TypedQueue() {     
        this.maxSize = -1;

        this.queue = new Object[DEFAULT_DYNAMIC_SIZE];
    }

    /**
    * Instantiate a sized queue
    *
    * @param maxSize the max possible amount of items in the structure
    * @see TypedQueue
    */
    public TypedQueue(int maxSize) {          
        if (maxSize <= 0) 
            throw new InvalidDataStructureSizeException("max size of a Data Structure must be higher than zero.");
        
        this.maxSize = maxSize;
        this.queue = new Object[this.maxSize];
    }

    /**
    * Append a new object to the end of the queue.
    *
    * @param o the instance of Object to be append.
    * @see TypedQueue
    */
    @Override
    public void push(T o) {

        if (this.isFull()) 
            throw new InvalidDataStructureAccessException("cannot push data to a full Queue.");

        if (this.isDynamic() && this.isOverflowing()) {
            --this.maxSize;

            int newDynamicSize = this.DEFAULT_DYNAMIC_SIZE * -this.maxSize();
            int oldDynamicSize = newDynamicSize - this.DEFAULT_DYNAMIC_SIZE;

            Object[] oldQueue = new Object[oldDynamicSize];
            oldQueue = this.queue;

            this.queue = new Object[newDynamicSize];

            for (int i = 0; i < oldDynamicSize; i++) {
                this.queue[i]= oldQueue[i];
            }
        }

        this.queue[this.size()] = o;
        this.size++;            
    }

    /**
    * Retrieves a object from the head of the queue. 
    *
    * This removes the retrieved object from queue.
    *
    * @return the instance of Object to be retrieved.
    * @see TypedQueue
    */
    @Override
    public T get() {

        if (this.isEmpty()) 
            throw new InvalidDataStructureAccessException("cannot get data from empty Queue.");

        @SuppressWarnings("unchecked")
        T nextObject = (T) this.queue[0];
        
        for(int i = 1; i < this.size(); i++) {
            this.queue[i - 1] = this.queue[i];
        }

        this.size--;
        return nextObject;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int maxSize() {
        return this.maxSize;
    }

    @Override
    public boolean isFull() {
        return this.size() == this.maxSize();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean isDynamic() {
        return this.maxSize() < 0;
    }

    private boolean isOverflowing() {
        int maxDynamicSize = this.DEFAULT_DYNAMIC_SIZE * -this.maxSize();

        return (!this.isEmpty()) && (this.size() % maxDynamicSize == 0);
    }
    
    // private T[] createTypedQueue(int size) {
    //     @SuppressWarnings("unchecked")
    //     Class<T> tClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    //     System.out.println(tClass.getClass());

    //     @SuppressWarnings("unchecked")
    //     T[] typedQueue = (T[]) Array.newInstance(tClass, size);

    //     return typedQueue;
    // }

}

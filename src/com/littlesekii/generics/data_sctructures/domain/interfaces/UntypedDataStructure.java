package com.littlesekii.generics.data_sctructures.domain.interfaces;

public interface UntypedDataStructure {

    /**
    * Append a new object to the structure.
    *
    * @param o the instance of Object to be append.
    * @see UntypedDataStructure
    */
    public void push(Object o);

    /**
    * Retrieves a object from the structure. 
    *
    * @return the instance of Object to be retrieved.
    * @see UntypedDataStructure
    */
    public Object get();

    /**
    * Returns the current amount of items in the structure.
    *
    * @return the current amount of items in the structure.
    * @see UntypedDataStructure
    */
    public int size();

    /**
    * Returns the max possible amount of items in the structure.
    *
    * @return the max possible amount of items in the structure.
    * @see UntypedDataStructure
    */
    public int maxSize();

    /**
    * Returns if the structure is full.
    *
    * @return if the structure is full.
    * @see UntypedDataStructure
    */
    public boolean isFull();

    /**
    * Returns if the structure is empty.
    *
    * @return if the structure is empty.
    * @see UntypedDataStructure
    */
    public boolean isEmpty();

    /**
    * Returns if the structure is dynamic sized.
    *
    * @return if the structure is dynamic sized.
    * @see UntypedDataStructure
    */
    public boolean isDynamic();
}

package com.littlesekii.generics.data_sctructures.domain.interfaces;

public interface TypedDataStructure<T> extends DataStructure {
    /**
    * Append a new object to the structure.
    *
    * @param o the instance of Object to be append.
    * @see TypedDataStructure
    */
    public void push(T o);

    /**
    * Retrieves a object from the structure. 
    *
    * @return the instance of Object to be retrieved.
    * @see TypedDataStructure
    */
    public T get();
}

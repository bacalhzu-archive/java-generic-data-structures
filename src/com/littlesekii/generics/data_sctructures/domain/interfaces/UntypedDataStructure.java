package com.littlesekii.generics.data_sctructures.domain.interfaces;

public interface UntypedDataStructure extends DataStructure {

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
}

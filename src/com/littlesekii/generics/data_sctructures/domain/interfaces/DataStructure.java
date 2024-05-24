package com.littlesekii.generics.data_sctructures.domain.interfaces;

public interface DataStructure {
    /**
    * Returns the current amount of items in the structure.
    *
    * @return the current amount of items in the structure.
    * @see DataStructure
    */
    public int size();

    /**
    * Returns the max possible amount of items in the structure.
    *
    * @return the max possible amount of items in the structure.
    * @see DataStructure
    */
    public int maxSize();

    /**
    * Returns if the structure is full.
    *
    * @return if the structure is full.
    * @see DataStructure
    */
    public boolean isFull();

    /**
    * Returns if the structure is empty.
    *
    * @return if the structure is empty.
    * @see DataStructure
    */
    public boolean isEmpty();

    /**
    * Returns if the structure is dynamic sized.
    *
    * @return if the structure is dynamic sized.
    * @see DataStructure
    */
    public boolean isDynamic();
}

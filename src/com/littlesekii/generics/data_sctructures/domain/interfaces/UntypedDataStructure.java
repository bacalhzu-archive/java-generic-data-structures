package com.littlesekii.generics.data_sctructures.domain.interfaces;

public interface UntypedDataStructure {
    public void push(Object o);
    public Object get();
    public Object get(int index);

    public int size();
    public int maxSize();

    public boolean isFull();
    public boolean isEmpty();
    public boolean isDynamic();
}

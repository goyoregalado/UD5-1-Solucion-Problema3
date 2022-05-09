package com.digitalcastaway.datastructures;

public class GenericStack<T> {
    private static final int CAPACIDAD_INICIAL = 5;
    private static final int TOP = 0;

    private GenericCollection<T> collection = new GenericCollection<T>(CAPACIDAD_INICIAL);

    public void push(T element) {
        collection.insert(element, TOP);
    }

    public T pop() {
        return collection.delete(TOP);
    }

    public int getLength() {
        return collection.length();
    }

}

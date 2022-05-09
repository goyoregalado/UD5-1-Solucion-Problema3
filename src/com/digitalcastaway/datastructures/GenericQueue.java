package com.digitalcastaway.datastructures;

public class GenericQueue<T> {
    private final static int CAPACIDAD_INICIAL = 5;

    private GenericCollection<T> collection = new GenericCollection<T>(CAPACIDAD_INICIAL);

    public void enqueue(T element) {
        collection.add(element);
    }

    public T dequeue() {
        return (T) collection.delete(0);
    }

    public int getLength() {
        return collection.length();
    }

}

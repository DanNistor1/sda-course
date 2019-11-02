package com.sda.generics;

public class GenricBox<T> {
    private T item;

/*
    // set item in constructor
    public GenricBox(T item) {
        this.item = item;
    }
*/

    // set item by custom method
    public void add(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    // set item by setter
    public void setItem(T item) {
        this.item = item;
    }
}

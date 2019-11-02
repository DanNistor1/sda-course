package com.sda.generics;

public class Generic<E> {
    private E element;

/*
    // set item in constructor
    public Generic(E element) {
        this.element = element;
    }
*/

    // set item by setter
    public void setElement(E element) {
        this.element = element;
    }

}

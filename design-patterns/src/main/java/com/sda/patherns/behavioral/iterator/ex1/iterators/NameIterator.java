package com.sda.patherns.behavioral.iterator.ex1.iterators;

import com.sda.patherns.behavioral.iterator.ex1.collections.NameRepository;

public class NameIterator implements Iterator {

    private NameRepository repository;
    private int index;

    public NameIterator(NameRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean hasNext() {

        if (index < repository.getNames().length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (this.hasNext()) {
            return repository.getNames()[index++];
        }
        return null;
    }
}




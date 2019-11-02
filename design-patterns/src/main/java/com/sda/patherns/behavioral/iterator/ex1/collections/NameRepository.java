package com.sda.patherns.behavioral.iterator.ex1.collections;

import com.sda.patherns.behavioral.iterator.ex1.iterators.Iterator;
import com.sda.patherns.behavioral.iterator.ex1.iterators.NameIterator;

public class NameRepository implements Repository {

   private String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(this);
    }

    public String[] getNames() {
        return names;
    }
}
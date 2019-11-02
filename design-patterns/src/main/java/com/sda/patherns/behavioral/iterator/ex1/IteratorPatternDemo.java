package com.sda.patherns.behavioral.iterator.ex1;

import com.sda.patherns.behavioral.iterator.ex1.collections.NameRepository;
import com.sda.patherns.behavioral.iterator.ex1.iterators.Iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}

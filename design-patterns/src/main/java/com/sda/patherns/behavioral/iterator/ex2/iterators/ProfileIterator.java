package com.sda.patherns.behavioral.iterator.ex2.iterators;

import com.sda.patherns.behavioral.iterator.ex2.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}

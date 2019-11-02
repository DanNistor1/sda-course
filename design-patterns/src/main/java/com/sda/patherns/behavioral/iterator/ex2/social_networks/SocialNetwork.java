package com.sda.patherns.behavioral.iterator.ex2.social_networks;

import com.sda.patherns.behavioral.iterator.ex2.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}

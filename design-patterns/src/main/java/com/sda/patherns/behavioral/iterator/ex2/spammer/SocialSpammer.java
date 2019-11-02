package com.sda.patherns.behavioral.iterator.ex2.spammer;

import com.sda.patherns.behavioral.iterator.ex2.iterators.ProfileIterator;
import com.sda.patherns.behavioral.iterator.ex2.profile.Profile;
import com.sda.patherns.behavioral.iterator.ex2.social_networks.SocialNetwork;

public class SocialSpammer {

    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            String email = profile.getEmail();
            sendMessage(email, message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            String email = profile.getEmail();
            sendMessage(email, message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email
                + "'. Message body: '" + message + "'");
    }
}

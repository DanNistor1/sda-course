package com.sda.patherns.behavioral.iterator.ex2;

import com.sda.patherns.behavioral.iterator.ex2.profile.Profile;
import com.sda.patherns.behavioral.iterator.ex2.social_networks.Facebook;
import com.sda.patherns.behavioral.iterator.ex2.social_networks.LinkedIn;
import com.sda.patherns.behavioral.iterator.ex2.social_networks.SocialNetwork;
import com.sda.patherns.behavioral.iterator.ex2.spammer.SocialSpammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoIteratorPattern {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork socialNetwork;
        if (choice.equals("2")) {
            socialNetwork = new LinkedIn(createTestProfiles());
        } else {
            socialNetwork = new Facebook(createTestProfiles());
        }
        SocialSpammer socialSpammer = new SocialSpammer(socialNetwork);
        socialSpammer.sendSpamToFriends("anna.smith@bing.com", "Message.");
        socialSpammer.sendSpamToCoworkers("anna.smith@bing.com", "Message.");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}

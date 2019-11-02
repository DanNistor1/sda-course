package com.sda.randomizer;

import java.util.List;

public class TestUtils {
    public static void main(String[] args) {

        List<Person> list = Utils.convert(Utils.readFile("C://Users//bcs//IdeaProjects//Lectia 12 - Advanced//Randomizer//Names.txt"));
        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getDifficulty());
        }
    }
}

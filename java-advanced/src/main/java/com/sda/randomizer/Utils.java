package com.sda.randomizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

    public static int getRandomNumberInRange(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min) + 1 + min);
    }

    public static List<String> readFile(String source){
        Path input = Paths.get(source);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static List<Person> convert(List<String>  stringList){
        List<Person> personList = new ArrayList<>();
        stringList.stream()
                .forEach(s ->personList.add(new Person(s, 5)));
        return personList;
    }

}

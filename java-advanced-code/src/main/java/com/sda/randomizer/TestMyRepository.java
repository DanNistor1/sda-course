package com.sda.randomizer;

import java.util.ArrayList;
import java.util.List;

public class TestMyRepository {

    public static void main(String[] args) {

        Person p1 = new Person("dragos", 3);
        Person p2 = new Person("mihai", 5);
        Person p3 = new Person("victor", 4);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        MyPersonRepository myPersonRepository = new MyPersonRepository(list);

        print(list);
        System.out.println();

        Person person1 = myPersonRepository.select("dragos");
        myPersonRepository.update(person1,"alin", 2);
        Person person2 = myPersonRepository.select("victor");
        myPersonRepository.remove(person2);

        print(list);
    }

    public static void print(List<Person> list) {
        list.forEach(p -> System.out.println(p.getName() + " " + p.getDifficulty()));
    }
}


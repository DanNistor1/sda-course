package com.sda.io;

public class ResourceTest {
    public static void main(String[] args) {

        String fileName = "io/person-output.yml";
        System.out.println(fileName);
        System.out.println(new ResourceTest().getClass().getResource(fileName));
        System.out.println(new ResourceTest().getClass().getClassLoader().getResource(fileName));

    }
}

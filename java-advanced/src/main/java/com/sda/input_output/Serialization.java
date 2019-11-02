package com.sda.input_output;

import java.io.*;

public class Serialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        writeUsingFileOutputStream();

        readUsingFileInputStrim();

    }

    private static void writeUsingFileOutputStream() throws IOException {
        // creat object to serialize
        Person person = new Person("Dan", "Nistor");

        // create destination
        File file = new File("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\person.txt");

        // serialize object
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(person);
        }
    }

    public static void readUsingFileInputStrim() throws IOException, ClassNotFoundException {

        Person person;

        File source = new File("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\person.txt");

        // read from file with input stream
        try (FileInputStream fileInputStream = new FileInputStream(source);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

            // cast object read result to a Person object
            person  = (Person) objectInputStream.readObject();
            System.out.println(person);
        }
    }
}


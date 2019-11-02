package com.sda.input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class NewIO {

    public static void main(String[] args) {

        try {
            readFileWithJava8();
        } catch (IOException e) {
            System.out.println("complex eror");
        }

        try {
            writeFileWithJava8();
        } catch (IOException e) {
            System.out.println("could not write");
        }

        try {
            otherMethodInFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readFileWithJava8() throws IOException {
        Path source = Paths.get("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\input.txt");
        // read line by line
        List<String> lines = Files.readAllLines(source);

        // print result
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static void writeFileWithJava8() throws IOException {

        Path destination = Paths.get("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\output.txt");
        List<String> content = Arrays.asList("alex", "ana", "george");
        Files.write(destination, content, StandardOpenOption.APPEND);

    }

    private static void otherMethodInFiles() throws IOException {

        String destinationFolder = "C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput";
        String folderName = "generatedFolder";
        Path destination = Paths.get(destinationFolder + "\\" + folderName);

        if (Files.exists(destination)) {
            System.out.println("folder already exist: " + destination);
        } else {
            Files.createDirectories(destination);
        }
    }
}


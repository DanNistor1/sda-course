package com.sda.input_output;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoEx1 {

    public static void main(String[] args) {
        Path source = Paths.get("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\input.txt");
        File inputFile = new File("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\input.txt");

        System.out.println(countWordsJava8(source));
        System.out.println(countWordsJava7(inputFile));

    }

    private static int countWordsJava8(Path path){
        // read lines
        long count = 0;
        try {
            Stream<String> lines = Files.lines(path);

            // line1: word1 word2 word3
            count = lines.flatMap(line -> Arrays.stream(line.trim().split(" ")))
                    .count();

        } catch (IOException e) {
            System.out.println("could not read file");
        }

        return (int) count;
    }

    private static int countWordsJava7(File file) {

        List<String> linesList = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            linesList = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                linesList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long count = linesList.stream()
                              .flatMap(line -> Arrays.stream(line.trim().split(" ")))
                              .count();

        return (int)count;
    }
}

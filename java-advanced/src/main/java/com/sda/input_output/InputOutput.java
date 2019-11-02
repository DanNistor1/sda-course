package com.sda.input_output;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws IOException {

        // try with resource
        readWithbufferedReader();

        // writeWithBufferedWriter();
        writeWithBufferedWriterAppend();

    }

    private static void readWithbufferedReader() throws IOException {
        // read with buffered reader
        File file = new File("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\input.txt");

        // create buffered reader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            // read line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    private static void writeWithBufferedWriter() throws IOException {

        File fileDestination = new File("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\output.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileDestination))) {
            String line = "other text";
            bufferedWriter.write(line);
        }
    }

    private static void writeWithBufferedWriterAppend() throws IOException {

        File fileDestination = new File("C:\\Users\\bcs\\IdeaProjects\\Lectia 13 - Advanced\\InputOutput\\output.txt");
        // write with append
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileDestination, true))) {
            String line = " other text";
            bufferedWriter.write(line);
        }
    }
}

package com.sda.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class CustomYmlWriter {

    public void write(Student student) {
        // write it to an yml file
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try {
            String shortPath = this.getClass()
                    .getClassLoader()
                    .getResource("io/person-output.yml").getFile();

//            Path path = Paths.get("src/main/resources/person-output.yml");
//            Path absolutePath = path.toAbsolutePath();

            File file = new File(shortPath);
            mapper.writeValue(file, student);
        } catch (IOException e) {
            System.out.println("error writing to file");
        }
    }
}

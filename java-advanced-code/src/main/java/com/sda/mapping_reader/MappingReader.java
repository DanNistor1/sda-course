package com.sda.mapping_reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class MappingReader {

    private Map<String, String> emailsAddress;

    public MappingReader(String fileName) {

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        String relativePath = "src/main/resources/" + fileName;

        try {
            File file = new File(relativePath);
            emailsAddress = mapper.readValue(file, new TypeReference<Map<String, String>>() {});
        } catch (IOException e) {
            System.out.println("Error reading from file!");
        }
    }

    public Map<String, String> getEmailsAddress() {
        return emailsAddress;
    }

    public static void print(Map<String, String> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

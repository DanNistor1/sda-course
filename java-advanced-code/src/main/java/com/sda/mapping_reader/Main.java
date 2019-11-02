package com.sda.mapping_reader;

public class Main {
    public static void main(String[] args) {

        MappingReader mappingReader = new MappingReader("mappings.yml");
        MappingReader.print(mappingReader.getEmailsAddress());
    }
}

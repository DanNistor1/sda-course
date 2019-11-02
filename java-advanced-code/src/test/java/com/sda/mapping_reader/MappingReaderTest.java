package com.sda.mapping_reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MappingReaderTest {

    @Test
    void givenFile_whenRead_thenReturnMap() throws IOException {

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        String relativePath = "src/test/resources/" + "mappings.yml";
        File file = new File(relativePath);

        Map<String, String> expectedEmailsAddress = new HashMap<>();
        expectedEmailsAddress.put("aaa", "email1@gmail.com");
        expectedEmailsAddress.put("bbb", "email2@gmail.com");
        expectedEmailsAddress.put("ccc", "email3@gmail.com");

        Map<String, String> actualEmailsAddress = mapper.readValue(file, new TypeReference<Map<String, String>>() {
        });

        assertThat(actualEmailsAddress).isEqualTo(expectedEmailsAddress);

    }
}

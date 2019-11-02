package com.sda.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.File;
import java.io.IOException;

public class CustomYmlReader {
    public void read(String absolutePath) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try {
            File file = new File(absolutePath);
            Employee employee = mapper.readValue(file, Employee.class);
            System.out.println(ReflectionToStringBuilder.toString(employee, ToStringStyle.MULTI_LINE_STYLE));
        } catch (IOException e) {
            System.out.println("error reading from file");
        }
    }
}

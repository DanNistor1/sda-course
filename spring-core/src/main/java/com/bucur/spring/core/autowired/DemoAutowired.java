package com.bucur.spring.core.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoAutowired {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiredConfig.class);

        TextEditor textEditor = (TextEditor) context.getBean("textEditor"); // daca nu se trece clasa ca argument rezulta un obiect si trebuie facut cast
        textEditor.format();
        textEditor.convertImage();

    }
}

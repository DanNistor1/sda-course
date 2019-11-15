package com.bucur.spring.core.autowired;

import org.springframework.stereotype.Component;

@Component
public class TextFormatter {

    public TextFormatter() {
        System.out.println("textformatter constructor");
    }

    public void textFormatting() {
        System.out.println("text formatting...");
    }
}

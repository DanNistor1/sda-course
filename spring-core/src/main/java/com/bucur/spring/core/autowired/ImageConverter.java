package com.bucur.spring.core.autowired;

import org.springframework.stereotype.Component;

@Component
public class ImageConverter {

    public ImageConverter() {
        System.out.println("imageconverter constructor");
    }

    public void imageConverting() {
        System.out.println("image converting...");
    }
}

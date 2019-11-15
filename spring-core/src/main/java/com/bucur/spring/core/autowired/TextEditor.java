package com.bucur.spring.core.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

    private SpellChecker spellChecker;
    // field injection - recomandat in teste
    @Autowired
    private TextFormatter textFormatter;
    private ImageConverter imageConverter;

    // constructor injection - recomandat in mod uzual
    @Autowired
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    // setter injection
    @Autowired
    public void setImageConverter(ImageConverter imageConverter) {
        this.imageConverter = imageConverter;
    }

    // delegation
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
    public void format() {
        textFormatter.textFormatting();
    }
    public void convertImage() {
        imageConverter.imageConverting();
    }
}

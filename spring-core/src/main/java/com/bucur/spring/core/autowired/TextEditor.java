package com.bucur.spring.core.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

    private SpellChecker spellChecker;

    @Autowired
    public TextEditor(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    // delegation
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}

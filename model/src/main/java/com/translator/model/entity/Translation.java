package com.translator.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "DICTIONARY")
public class Translation {
    @Id
    @GeneratedValue
    @Column(name="original_word")
    private String originalWord;

    @Column(name="translated_word")
    private String translatedWord;

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public void setTranslatedWord(String translatedWord) {
        this.translatedWord = translatedWord;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }
}

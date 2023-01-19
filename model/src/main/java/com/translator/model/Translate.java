package com.translator.model;

public class Translate {
    private String phrase;

    public Translate(String phrase){
        this.phrase = phrase;
    }

    public Translate(){}

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}

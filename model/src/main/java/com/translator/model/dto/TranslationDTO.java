package com.translator.model.dto;

public class TranslationDTO {
    private String originalPhrase;
    private String translatedPhrase;

    public TranslationDTO(String originalPhrase, String translatedPhrase){
        this.originalPhrase = originalPhrase;
        this.translatedPhrase = translatedPhrase;
    }

    public TranslationDTO(){}

    public String getOriginalPhrase() {
        return originalPhrase;
    }

    public String getTranslatedPhrase() {
        return translatedPhrase;
    }

    public void setOriginalPhrase(String originalPhrase) {
        this.originalPhrase = originalPhrase;
    }

    public void setTranslatedPhrase(String translatedPhrase) {
        this.translatedPhrase = translatedPhrase;
    }
}

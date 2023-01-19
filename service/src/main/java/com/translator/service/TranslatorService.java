package com.translator.service;

import com.translator.model.Translate;
import com.translator.model.dto.TranslationDTO;
import com.translator.model.entity.Translation;
import com.translator.repository.TranslationReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TranslatorService {

    @Autowired
    private TranslationReposity reposity;

    public TranslationDTO getTranslation(Translate translate){

        //split the phrase in separated words
        String[] wordsToTranslate = translate.getPhrase().split(" ");
        StringBuilder phraseTranslated = new StringBuilder();
        for (String wordToTranslate : wordsToTranslate) {
            //translate the word
            Optional<Translation> translation = reposity.findById(wordToTranslate.toLowerCase());
            //append word by word to make a translated phrase
            if(translation.isPresent() && !translation.get().getTranslatedWord().isEmpty()) {
                if(phraseTranslated.isEmpty()){
                    phraseTranslated.append(translation.get().getTranslatedWord());
                }else {
                    phraseTranslated.append(" ").append(translation.get().getTranslatedWord());
                }
            }
        }

        return new TranslationDTO( translate.getPhrase(), phraseTranslated.toString());
    }
}
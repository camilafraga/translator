package com.translator.service;

import com.translator.model.Translate;
import com.translator.model.dto.TranslationDTO;
import com.translator.model.entity.Translation;
import com.translator.repository.TranslationReposity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
public class TranslatorServiceTest {

    @TestConfiguration
    static class TranslatorServiceTestContextConfiguration {

        @Bean
        public TranslatorService TranslatorService() {
            return new TranslatorService();
        }
    }

    @Autowired
    private TranslatorService service;

    @MockBean
    private TranslationReposity reposity;

    @Before
    public void setUp(){
        Translation translation = new Translation();
        translation.setOriginalWord("Olá");
        translation.setTranslatedWord("Hello");

        Mockito.when(reposity.findById(translation.getOriginalWord().toLowerCase()))
                .thenReturn(Optional.of(translation));
    }

    @Test
    public void whenWordExist_thenTranslate(){
        String expectedWord = "Hello";

        TranslationDTO dto = service.getTranslation(new Translate("Olá"));

        Assert.assertEquals(expectedWord, dto.getTranslatedPhrase());
    }

    @Test
    public void whenWordDoNotExist_thenNotTranslate(){

        TranslationDTO dto = service.getTranslation(new Translate("Adeus"));

        Assert.assertEquals("", dto.getTranslatedPhrase());
    }
}

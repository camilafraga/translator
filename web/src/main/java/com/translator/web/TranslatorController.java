package com.translator.web;

import com.translator.model.Translate;
import com.translator.model.dto.TranslationDTO;
import com.translator.service.TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslatorController {

    @Autowired
    private TranslatorService service;

    @GetMapping(value="/translator", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TranslationDTO> getTranslation(@RequestBody Translate translate)
    {
        return ResponseEntity.ok(service.getTranslation(translate));
    }

}

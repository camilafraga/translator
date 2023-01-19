package com.translator.repository;

import com.translator.model.entity.Translation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationReposity extends JpaRepository<Translation, String> {
}

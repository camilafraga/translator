DROP TABLE IF EXISTS DICTIONARY;
CREATE TABLE DICTIONARY (
original_word VARCHAR(50) PRIMARY KEY,
translated_word VARCHAR(50) NOT NULL
);
package com.translator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.translator")
public class TranslateSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranslateSpringBootApplication.class, args);
    }
}

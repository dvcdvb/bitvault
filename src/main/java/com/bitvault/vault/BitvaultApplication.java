package com.bitvault.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BitvaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitvaultApplication.class, args);
        System.out.println("Enter your name");
    }
}
package com.bitvault.pass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class BitvaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitvaultApplication.class, args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
    }
}

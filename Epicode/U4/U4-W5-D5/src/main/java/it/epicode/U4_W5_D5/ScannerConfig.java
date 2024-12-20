package it.epicode.U4_W5_D5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class ScannerConfig {
    @Bean
    public Scanner getScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}

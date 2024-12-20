package it.epicode.U4_W5_D5;

import org.springframework.context.annotation.Configuration;
import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

@Configuration
public class FakerConfig {

    @Bean
    public Faker getFaker() {
        Faker faker = new Faker(Locale.ITALIAN);
        return faker;
    }
}
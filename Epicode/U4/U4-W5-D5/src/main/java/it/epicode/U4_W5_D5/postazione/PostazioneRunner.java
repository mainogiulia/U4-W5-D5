package it.epicode.U4_W5_D5.postazione;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PostazioneRunner implements ApplicationRunner {
 private final PostazioneRepo postazioneRepo;


    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
